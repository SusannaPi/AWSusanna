/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.checkpoint2;

/**
 *
 * @author Susanna
 */
class Juice implements Priced{
    private String name = "kiivi";
    private double price = 0;
    
    
    public Juice(String name, double price) {
        this.name = name;
        this.price = price;
    }

    
    @Override
    public String getName() {
        return this.name;
    }

    
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    
    @Override
    public double getPrice() {
        return this.price;
    }

    
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }
    
    
    
    
    
}
