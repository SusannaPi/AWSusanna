/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.checkpoint1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Susanna
 */
public class Account {
    private String owner = "Hanna";
    private double initialBalance = 0;
    private List<Transaction> transactions = new ArrayList<>();
    
    
    public Account(String owner, double initialBalance) {
        this.owner = owner;
        this.initialBalance = initialBalance;
    }
    
    public void transaction(double amount, LocalDate date) {
        transactions.add(new Transaction(date, amount));    
    }
    
    public void transaction(Transaction transaction) {
        transactions.add(transaction);
    }
    
    public void getAll() {
        for (Transaction tr : transactions) {
            System.out.println(tr);
        }
    }
    
    List<Transaction> getTransactionsOf(int i, int j) {
        List<Transaction> februarysActions = transactions.stream()
                .filter(tr -> (tr.getDate().getYear()) == i && (tr.getDate().getMonthValue() == j))
                .collect(Collectors.toList());
        
        return februarysActions;
    }
    
    
    public void export(String fn) {
        
        try(PrintWriter writer = new PrintWriter(new FileWriter(fn))) {
            writer.println(owner);
            writer.println(initialBalance);
            double finalBalance = initialBalance;
            for(Transaction t : transactions) {
                finalBalance += t.getAmount();
                writer.println(t.getDescription());
            }
            
            writer.println("Loppusaldo " + finalBalance);
         
        }
        catch(IOException ioex) {
            System.out.println("Export failed");
        }
    }

    
}
