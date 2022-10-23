/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.checkpoint1uusinta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Susanna
 */
public class PurchaseOrder {
    private String customer;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Item> items;
    
    
    public PurchaseOrder(String customer) {
        this.customer = customer;
        this.orderDate = LocalDate.now();
        this.deliveryDate = orderDate.plusWeeks(3);
        this.items = new ArrayList<>();
        
           
    }
    
    
    public void addItem(String item, int pieces, double price) {
        items.add(new Item(item, pieces, price));
           
    }
    
    public void print() {
        System.out.println(this.customer);
        System.out.println(this.orderDate);
        System.out.println(this.deliveryDate);
        items.stream().forEach(i -> System.out.println(i));
        
        
    }
    
}
