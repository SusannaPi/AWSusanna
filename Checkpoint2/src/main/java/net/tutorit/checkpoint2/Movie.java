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
    private int duration = 0;
    
    
    public Movie(String name, int duration) {
        super(name);
        this.duration = duration;
    }

    
    @Override
    public String getDuration() {
        return ", " + duration + " minutes";
    }
            
    
    
    
    
    
    
    
}
