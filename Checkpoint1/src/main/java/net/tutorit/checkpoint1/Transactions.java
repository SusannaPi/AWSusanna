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
public class Transactions {
    private double amount = 0;
    private LocalDate date;
    
    
    public Transactions(double amount, LocalDate date) {
        this.amount = amount;
        this.date = date;
    
        try(PrintWriter writer = new PrintWriter("C:\\javatraining\\AWSusanna\\Checpoint1\\tapahtumat.txt")) {
            writer.println();
            
            writer.close();
        }
        catch(Exception ex) {
            System.out.println("Tiedoston kirjoittaminen epäonnistui");
        }
    
    }

    @Override
    public String toString() {
        return amount + " " + date;
    }
    
    public static void export() {
        
      
    }
    
    
    
}
