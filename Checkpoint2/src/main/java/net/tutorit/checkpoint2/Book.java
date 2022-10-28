/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.checkpoint2;

/**
 *
 * @author Susanna
 */
public class Book {
    private String book;
    
    public Book(String book) {
        this.book = book;
    }

    public String getTitle() {
        return book;
    }

   
    @Override
    public String toString() {
        return book;
    }
    
    
    public static void print() {
        System.out.println("In a hole in the ground there lived a hobbit");
    }
    
}
