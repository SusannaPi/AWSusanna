/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.checkpoint2;

/**
 *
 * @author Susanna
 */
class Series extends TVBase{
    //private String name = "Metsä";
    private int episodes = 0;
    
    public Series(String name, int episodes) {
        super(name);
        this.episodes = episodes;
    }

    @Override
    public String getDuration() {
       return ", " + episodes + " episodes";
    }
    
    
    
    
}
