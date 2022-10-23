/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.checkpoint1uusinta;

/**
 *
 * @author Susanna
 */
public class Motorbike implements Vehicle{
    private String owner = "Terho";
    
    
    public Motorbike(String owner) {
        this.owner = owner;
    }

    
    //Implementoidaan rajapinnan metodit
    
    @Override
    public String getOwner() {
        return this.owner;
    }

    @Override
    public String getType() {
        return "moottoripyörä";
    }
    
    
}
