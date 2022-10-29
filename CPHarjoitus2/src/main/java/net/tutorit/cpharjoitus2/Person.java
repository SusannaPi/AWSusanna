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
    private String name = "";
    
    
    public Person (String name){
        if (name == null) {return;}
        this.name = name;
    }
    
    //Impelementoidaan rajapinnan metodi getName(). Se on pakko implementoida muuten luokka ei toimi.
    @Override
    public String getName() {
        return name;
    }

    //Metodia default String getExtra() ei ole pakko implementoida! -> Koska ei ole implementoitu
    //tulostuu Extra kutsuttaessa metodia default String getExtra()
    

    
    
    
    
}
