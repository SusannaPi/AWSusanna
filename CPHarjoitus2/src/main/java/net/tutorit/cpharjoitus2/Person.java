/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.cpharjoitus2;

/**
 *
 * @author Susanna
 */
public class Person implements Named{
    private String name = "Hanna";
    
    
    public Person (String name){
        this.name = name;
    }
    

    @Override
    public String getName() {
        return name;
    }

    

    
    
    
    
}
