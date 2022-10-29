/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.cpharjoitus2;

/**
 *
 * @author Susanna
 */
class Product implements Named{
    private String product = "";
    
    Product(String product) {
        if (product == null) {return;}
        this.product = product;
    }

    //Impelementoidaan rajapinnan metodi getName(). Se on pakko implementoida muuten luokka ei toimi.
    @Override
    public String getName() {
        return product;
    }
    
    //Metodia default String getExtra() ei ole pakko implementoida! Siinä tapauksessa tulostuisi
    //Extra Saltin sijaan
    @Override
    public String getExtra() {
        return "Salt";
    }
    
    
}
