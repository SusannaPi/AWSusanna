/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.checkpoint1;

/**
 *
 * @author Susanna
 */
class Television implements Merchandise {
    
    private String name = "Samsung";
    private double price = 0;
    
    public Television(String name,double price) {
        this.name = name;
        this.price = price;
       
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
     
}
