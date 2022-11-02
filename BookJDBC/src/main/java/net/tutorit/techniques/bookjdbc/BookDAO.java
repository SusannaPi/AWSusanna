/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.techniques.bookjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Susanna
 */
public class BookDAO {
    
    private Connection getConnection() {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "librarian", "test123");
        
            return con;
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        return null;
        
    }
    
    
    private Book bookFromResultSet(ResultSet rs) {
        try{
            Book b = new Book();
            b.setId(rs.getInt("id"));
            b.setAuthorId(rs.getInt("author_id"));
            b.setTitle(rs.getString("title"));
            return b;
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    /* CRUDIT myöhemmäksi */
    
    
    public Book get(int id) {
        try{
            String sql = "SELECT * FROM book where id=?";
            Connection con = getConnection();
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            Book b = null;
            if(rs.next()) {
                b = bookFromResultSet(rs);
            }
            rs.close();
            stm.close();
            con.close();
            return b;
        } 
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        return null;
        }

    
    public List<Book> getAll() {
        ArrayList<Book> al = new ArrayList<>();
        try{
            Connection con = getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM book ORDER BY author_id, title");
            while(rs.next()) {
                al.add(bookFromResultSet(rs));
            }
            rs.close();
            stm.close();
            con.close();
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        return al;
    }
    
    
    
    public Book create(Book b) {
        try{
            Connection con = getConnection();
            String sql = "INSERT * INTO Book(author_id, title) values(?,?)";
            PreparedStatement stm = con.prepareStatement(sql, 
                    Statement.RETURN_GENERATED_KEYS);
            stm.setInt(1, b.getAuthorId());
            stm.setString(2, b.getTitle());
            
            int rowsAffected = stm.executeUpdate();
            ResultSet keys = stm.getGeneratedKeys();
            if (keys.next()) {
                int id = keys.getInt(1);
                return this.get(id);
            }
            
            stm.close();
            con.close();
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Book update(Book b) {
        try{
            String sql="SELECT * FROM book where id=?";
            Connection con=getConnection();
            PreparedStatement stm=con.prepareStatement(sql,ResultSet.TYPE_FORWARD_ONLY,
                    ResultSet.CONCUR_UPDATABLE);
            stm.setInt(1, b.getId());
            ResultSet rs=stm.executeQuery();
            Book bret=null;
            if (rs.next()){
                rs.updateInt("author_id",b.getAuthorId());
                rs.updateString("title",b.getTitle());
                rs.updateRow();
                bret=bookFromResultSet(rs);
            }
            rs.close();
            stm.close();
            con.close();
            return bret;
            
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    
    public boolean delete(int id){
        try{
            Connection con=getConnection();
            PreparedStatement stm=con.prepareStatement("DELETE FROM book WHERE id=?");
            stm.setInt(1, id);
            int rowsAffected=stm.executeUpdate();
            stm.close();
            con.close();
            return (rowsAffected==1);
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    
    public Author getAuthorOfBook(int bookId) {
        return new AuthorDAO().getAuthorOfBook(bookId);
    }
        
    
    public List<Book> getBooksOfAuthor(int authorId) {
        ArrayList<Book> bl = new ArrayList<>();
        try{
            Connection con = getConnection();
            String sql = "SELECT b.* FROM book b WHERE b.author_id=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, authorId);
            ResultSet rs = stm.executeQuery();
            while(rs.next()) {
                bl.add(bookFromResultSet(rs));
            }
            stm.close();
            con.close();    
        }
        catch(SQLException ex) {
            ex.printStackTrace();   
        }
        return bl;
    }
    
    
    
    public void getAuthor(Book b){
        b.setAuthor(getAuthorOfBook(b.getId()));
    }
    
}
