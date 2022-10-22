/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.checkpoint1;

import java.io.PrintWriter;
import java.time.LocalDate;

/**
 *
 * @author Susanna
 */
public class Transaction {
    private LocalDate date;
    private double amount = 0;
    
    public Transaction(LocalDate date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }
    
    
    String getDescription() {
       String text = "Withdrawal";
       if (amount < 0) {
           text = "deposit";
       }
        
       return text + " " + date + " " +amount;
    }

    @Override
    public String toString() {
        return date + " " + amount;
    }
    
}
