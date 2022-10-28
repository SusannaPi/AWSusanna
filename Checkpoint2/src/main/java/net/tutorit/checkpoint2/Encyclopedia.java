/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.checkpoint2;

/**
 *
 * @author Susanna
 */
class Encyclopedia extends Book{
    
    Encyclopedia(int i) {
        super("Huge book");
    }
    
    @Override
    public String getTitle() {
        return "Encyclopedia Britannica";
    }
    
    public static void print() {
        System.out.println("Encyclopedia britannica has 32640 pages");
    }
}
