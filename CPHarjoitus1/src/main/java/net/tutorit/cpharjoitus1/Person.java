/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.cpharjoitus1;

import java.time.LocalDate;

/**
 *
 * @author jyrki
 */
public class Person {
    private String name = "Elisa";
    private LocalDate start;
    private LocalDate end;
    
    public Person(String name, LocalDate start) {
        this.name = name;
        this.start = start;
        this.end = null;
    }
    
    public Person(String name, LocalDate start, LocalDate end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }
    
    
    
}
