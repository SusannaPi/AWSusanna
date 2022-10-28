/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.checkpoint2;

/**
 *
 * @author Susanna
 */
public class Movie extends TVBase {
    //private String name = "Metsä";
    private int duration = 0;
    
    
    public Movie(String name, int duration) {
        super(name);
        this.duration = duration;
    }
            
    
    @Override
    public void print() {
        System.out.println(name + " " + duration);
    }
    
    
    
    
    
}
