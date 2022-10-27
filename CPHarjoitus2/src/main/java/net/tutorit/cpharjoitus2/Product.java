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
    private String product = "banana";
    
    Product(String product) {
        this.product = product;
    }

    @Override
    public String getName() {
        return product;
    }

    @Override
    public String getExtra() {
        return "Salt";
    }
    
    
}
