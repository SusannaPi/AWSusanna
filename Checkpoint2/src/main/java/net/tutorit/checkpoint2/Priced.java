/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package net.tutorit.checkpoint2;

/**
 *
 * @author Susanna
 */
// Rajapintaluokka. Rajapintaluokan metodit tulee toteuttaa, paitsi 
                    //jos niiden edessä on määre default!

public interface Priced {
    
    double getPrice();
    
    
    //Tätä metodia ei ole pakko implementoida rajapinnan toteuttavissa luokissa
    default String getName() {
        return "Default";
    }
    
}
