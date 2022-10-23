/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.checkpoint1uusinta;

/**
 *
 * @author Susanna
 */
class Item {
    private String item = "kirves";
    private int pieces = 0;
    private double price = 0;
    
    public Item(String item, int pieces, double price) {
        this.item = item;
        this.pieces = pieces;
        this.price = price;
        
    }

    public String getItem() {
        return item;
    }


    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        if (pieces > 0) {
            this.pieces = pieces;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
        
    }
    
    
    public double totalPrice() {
        return pieces*price;
    }
    

    @Override
    public String toString() {
        return item + ", " + price  + " euroa/kpl " + pieces + " kappaletta, yhteensä " + totalPrice() + " euroa";
    }
    
    
    
}
