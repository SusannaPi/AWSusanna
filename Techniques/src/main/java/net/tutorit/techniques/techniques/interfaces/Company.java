/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.techniques.techniques.interfaces;

/**
 *
 * @author Susanna
 */
public class Company implements Worker {
    private String name = "Hanna";
    

    @Override
    public void pay(double amount) {
        System.out.println("[" + name + "] invoices [" + amount + "] EUR + VAT [" + amount*0.24 + "] EUR");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    
    
}
