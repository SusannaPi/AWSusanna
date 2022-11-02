/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.techniques.bookjdbc;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author Susanna
 */
public class Author {
    private int id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date deathDate;
    private List<Book> books=null;
    
    
    public Author() {
        
    }
    
    public Author(String fn, String ln, Date bd, Date dd) {
        firstName=fn;
        lastName=ln;
        birthDate=bd;
        deathDate=dd;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }
    
    @Override
    public String toString() {
        return ""+id+" + "+firstName+" "+lastName+", "+birthDate+"-"+deathDate;
    }
    
    
    public List<Book> getBooks() {
        return books;
    }
    
    
    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
}
