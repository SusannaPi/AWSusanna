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
public class Person implements Worker, Comparable<Person> {
    private String name = "Henna";
    private int age = 11;
    
    public Person() {
        
    }
    
    public Person(String name) {
        this.name = name;
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
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
 
    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.getName());
        
    } 

    @Override
    public String toString() {
        return name + " on " + age + " vuotias";
    }
    
    
    
    
}


