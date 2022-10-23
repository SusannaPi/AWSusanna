/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.checkpoint1uusinta;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
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
        
        int date1 = orderDate.getDayOfMonth();
        int month1 = orderDate.getMonthValue();
        int year1 = orderDate.getYear();
        System.out.println(date1 + "." + month1 + "." + year1);
        int date2 = deliveryDate.getDayOfMonth();
        int month2 = deliveryDate.getMonthValue();
        int year2 = deliveryDate.getYear();
        System.out.println(date2 + "." + month2 + "." + year2);
        items.stream().forEach(i -> System.out.println(i));
           
    }
    
    public double totalPrice() {
        double totalPrice = 0;
        for(Item i: items) {
            totalPrice += i.getPrice();
        }
        
        return totalPrice;
    }
    
    public boolean isUrgent() {
        if(totalPrice() > 50) {
            return true;
        }
        return false;
    }
    
          
    
    
    
}


