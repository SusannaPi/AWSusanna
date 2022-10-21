/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.checkpoint1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Susanna
 */
public class Account {
    private String owner = "Hanna";
    private double saldo = 0;
    private List<Transactions> transactions = new ArrayList<>();
    
    
    public Account(String owner, int saldo) {
        this.owner = owner;
        this.saldo = saldo;
    }
    
    public void transaction(double amount, LocalDate dt) {
        this.saldo += amount;
        transactions.add(new Transactions(amount, dt));    
    }
    
    public void getAll() {
        for (Transactions tr : transactions) {
            System.out.println(tr);
        }
    }
    
}
