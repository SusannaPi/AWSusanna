/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package net.tutorit.cpharjoitus2;

/**
 *
 * @author Susanna
 */

//Rajapintaluokka

public interface Named {
    
    //Tämä metodi tulee implementoida kaikissa rajapinnan toteuttavissa luokissa
    String getName();

    
    // Default metodia ei ole pakko implementoida! Default metodilla ilmeisesti myös tulee olla 
    // toteutus rajapintaluokassa
    
    default String getExtra() {
        return "Extra";
    }
    
}
