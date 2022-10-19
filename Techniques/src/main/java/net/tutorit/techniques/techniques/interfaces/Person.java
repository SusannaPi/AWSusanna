/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.techniques.techniques.interfaces;

import java.util.Objects;

/**
 *
 * @author Susanna
 */
public class Person implements Worker {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }

    @Override
    public void pay(double amount) {
        System.out.println("[" + name + "]" + " is payed [" + amount + "] EUR and [" + amount*0.25 + "] as social security");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        return Objects.equals(this.name, other.name);
    } 
 
    
    
}

