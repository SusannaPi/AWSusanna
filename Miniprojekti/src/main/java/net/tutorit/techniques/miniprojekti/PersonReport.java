/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.techniques.miniprojekti;

import java.util.ArrayList;

/**
 *
 * @author Susanna
 */
public class PersonReport {
    private ScreenReporter personReporter = new ScreenReporter();
    private ArrayList<Person> persons = new ArrayList<>();
    
    public PersonReport() {
        personReporter.addColumn("Name", 20);
        personReporter.addColumn("Age", 5);
    }
    
    public void addData(Person person) {
        persons.add(person);
    }
    
    public void doReport() {
        personReporter.printColumns();
        
        for (Person p : persons) {
            personReporter.printData(p.getName());
            personReporter.printData(p.getAge());
        }
    }
    
      
    
}
