/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.checkpoint1uusinta;

/**
 *
 * @author Susanna
 */
public class Car implements Vehicle {
    private String owner = "Riia";

    public Car(String owner) {
        this.owner = owner;
    }

    
    //Implementoidaan rajapinnan metodit
    
    @Override
    public String getOwner() {
        return this.owner;
    }

    @Override
    public String getType() {
        return "auto";
    }
  
    
}


