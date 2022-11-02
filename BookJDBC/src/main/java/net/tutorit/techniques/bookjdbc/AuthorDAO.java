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
public class AuthorDAO {
    //Yhteys tietokantaan
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
    
    //Luo taulun Author
    private Author authorFromResultSet(ResultSet rs) {
        try{
            Author a = new Author();
            a.setId(rs.getInt("id"));
            a.setFirstName(rs.getString("firstname"));
            a.setLastName(rs.getString("lastname"));
            a.setBirthDate(rs.getDate("birthdate"));
            a.setDeathDate(rs.getDate("deathdate"));
            return a;
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    
    /*Uses Connection getConnection() and Author authorFromResultSet(ResultSet rs) 
      to return author that has been fetched from the database*/
    public Author get(int id) {
        try{
            String sql = "SELECT * FROM author where id=?";
            Connection con = getConnection();
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            Author a = null;
            if(rs.next()) {
                a = authorFromResultSet(rs);
            }
            rs.close();
            stm.close();
            con.close();
            return a;
        } 
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        return null;
        }

    
    //Listaa kaiken taulusta Author järjestyksessä sukunimi, etunimi
    public List<Author> getAll() {
        ArrayList<Author> al = new ArrayList<>();
        try{
            Connection con = getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM author ORDER BY lastname, firstname");
            while(rs.next()) {
                al.add(authorFromResultSet(rs));
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
    
    //Taulun luominen
    public Author create(Author a) {
        try{
            Connection con = getConnection();
            String sql = "INSERT * INTO Author(firstname, lastname, birthdate, deathdate) values(?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql, 
                    Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, a.getFirstName());
            stm.setString(2, a.getLastName());
            stm.setDate(3, a.getBirthDate());
            stm.setDate(4, a.getDeathDate());
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
    
    //Author-taulun päivitys
    public Author update(Author a) {
        try{
            String sql="SELECT * FROM author where id=?";
            Connection con=getConnection();
            PreparedStatement stm=con.prepareStatement(sql,ResultSet.TYPE_FORWARD_ONLY,
                    ResultSet.CONCUR_UPDATABLE);
            stm.setInt(1, a.getId());
            ResultSet rs=stm.executeQuery();
            Author aret=null;
            if (rs.next()){
                rs.updateString("firstname",a.getFirstName());
                rs.updateString("lastname",a.getLastName());
                rs.updateDate("birthdate", a.getBirthDate());
                rs.updateDate("deathdate", a.getDeathDate());
                rs.updateRow();
                aret=authorFromResultSet(rs);
            }
            rs.close();
            stm.close();
            con.close();
            return aret;
            
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }
      
    // Tiedon poistaminen taulusta
    public boolean delete(int id){
        try{
            Connection con=getConnection();
            PreparedStatement stm=con.prepareStatement("DELETE FROM author WHERE id=?");
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
    
    public List<Author> getAuthorsNameContains(String namePart){
        ArrayList<Author> al=new ArrayList<>();
        try{
            Connection con=getConnection();
            //String sql="SELECT * FROM author where lcase(concat(lastname,' ',firstname)) like '%?%' ORDER BY lastname,firstname";
            String sql="SELECT * FROM author where lcase(concat(lastname,' ',firstname)) like ? ORDER BY lastname,firstname";
            PreparedStatement stm=con.prepareStatement(sql);
            //stm.setString(1, namePart);
            stm.setString(1, "%"+namePart+"%");
            ResultSet rs=stm.executeQuery();
            while(rs.next()){
                al.add(authorFromResultSet(rs));
            }
            rs.close();
            stm.close();
            con.close();
            //return al;
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return al;
    }

    public Author getAuthorOfBook(int bookId){
        try{
            Connection con=getConnection();
            String sql="SELECT a.* FROM author a, book b WHERE a.id=b.author_id AND b.id=?";
            PreparedStatement stm=con.prepareStatement(sql);
            stm.setInt(1, bookId);
            ResultSet rs=stm.executeQuery();
            Author a=null;
            if (rs.next()){
                a=authorFromResultSet(rs);
            }
            return a;
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    
    public List<Book> getBooksOfAuthor(int authorid){
        return new BookDAO().getBooksOfAuthor(authorid);
    }
    
    
    public void getBooks(Author a){
        a.setBooks(getBooksOfAuthor(a.getId()));
    }
}   


