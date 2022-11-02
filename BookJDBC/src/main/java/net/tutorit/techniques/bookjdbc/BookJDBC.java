/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package net.tutorit.techniques.bookjdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Susanna
 */
public class BookJDBC {
    
    static void showResultSet(ResultSet rs) {
        try {
            ResultSetMetaData rmd=rs.getMetaData();
                for(int i=1;i<=rmd.getColumnCount();i++){
                    System.out.print(rmd.getColumnName(i));
                    if (i==rmd.getColumnCount()) System.out.println();
                    else System.out.print(", ");
                }
                while(rs.next()){
                    for(int i=1;i<=rmd.getColumnCount();i++){
                        System.out.print(rs.getString(i));
                        if (i==rmd.getColumnCount()) System.out.println();
                        else System.out.print(", ");
                    }
                }
            }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
            
            
            
    
    
    static void getAllAuthors() {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books",
                "librarian", "test123");
            Statement stm = con.createStatement();
            //String sql="SELECT * FROM book b LEFT JOIN author a on (a.id=b.author_id)";
            String sql = "SELECT * from author";
        
            //ResultSet rs = stm.executeQuery("SELECT * from author");
            ResultSet rs = stm.executeQuery(sql);
            showResultSet(rs);
        
            /*
            while(rs.next()){
                System.out.println(rs.getString(2));
            }
            */
        
            rs.close();
            stm.close();
            con.close();
    
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
    public static void originalTests(String[] args) {
         //getAllAuthors();
        AuthorDAO dao = new AuthorDAO();
        
        Author a = dao.get(1);
        System.out.println("Author 1: " + a);
        a.setFirstName("J.R.R");
        dao.update(a);
        
        Author na = new Author("Andrea", "Camilleri", Date.valueOf("1925-09-06"), 
                Date.valueOf("2019-07-17"));
        //dao.create(na);
        
        
        Author toBeDeleted=new Author("Rex","Stout",null,null);
        toBeDeleted=dao.create(toBeDeleted);
        
        List<Author> authors = dao.getAll();
        for(Author ax: authors) {
            System.out.println(ax);
        }
        
        boolean deleteSucceeded=dao.delete(toBeDeleted.getId());
        System.out.println("Delete succeeded: "+deleteSucceeded);
        authors=dao.getAuthorsNameContains("mi");
        System.out.println("Name contains 'mi'");
        for(Author ax:authors){
            System.out.println(ax);
        }
        
        
        System.out.println("Tolkienin kirjat");
        BookDAO bdao=new BookDAO();
        List<Book> books=bdao.getBooksOfAuthor(1);
        for(Book b:books){
            System.out.println(b.getTitle());
        }
        
        books=dao.getBooksOfAuthor(1);
        for(Book b:books){
            System.out.println(b.getTitle());
        }
        a=bdao.getAuthorOfBook(1);
        System.out.println("Hobbitin kirjailija: "+a);
        a=dao.getAuthorOfBook(1);
        System.out.println("Hobbitin kirjailija: "+a);
    
    }
    
    
    public static void main(String[] args) {
        AuthorDAO adao=new AuthorDAO();
        Author a=adao.get(1);
        adao.getBooks(a);
        System.out.println(a.getLastName()+"'s books:");
        for(Book b:a.getBooks()){
            System.out.println(b.getTitle());
        }
        Book hobbit=a.getBooks().get(0);
        System.out.println(hobbit.getTitle()+" Author:"+hobbit.getAuthor());
        BookDAO bdao=new BookDAO();
        bdao.getAuthor(hobbit);
        System.out.println(hobbit.getTitle()+" Author:"+hobbit.getAuthor());
        
    } 
       
    
}
