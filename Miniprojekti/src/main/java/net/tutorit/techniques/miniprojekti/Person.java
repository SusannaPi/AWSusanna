/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.techniques.miniprojekti;

/**
 *
 * @author Susanna
 */
public class Person {
    String name = "Hanna";
    int age = 0;
    
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;    
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null) {
            name = "";
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
    
    
    
}
