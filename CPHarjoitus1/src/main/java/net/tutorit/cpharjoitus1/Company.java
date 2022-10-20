/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.cpharjoitus1;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author jyrki
 */
public class Company {
    private ArrayList<Person> employees = new ArrayList<Person>(); 
    private String name; 
    
    public Company(String name) {
        this.name = name;
    }
    
    public void addEmployee(String name, LocalDate start) {
        employees.add(new Person(name, start));
    }
    
    public void addEmployee(String name, LocalDate start, LocalDate end) {
        employees.add(new Person(name, start, end));
    }
    
    public String getEmployeeInfo(String name) {
        for(Person em : employees) {
            if (em.getName().equals(name)) {
                if (em.getEnd() == null) { 
                    return em.getName() + " aloitti " + em.getStart() + " ja työsuhde jatkuu vielä";
                } else {
                    return em.getName() + " aloitti " + em.getStart() + " ja lopetti " + em.getEnd();
                }
            }
        }
        
        return name + " ei ole työntekijärekisterissä";
    }

    public ArrayList<Person> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Person> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public List getAll() {
        List<Person> all = employees.stream()
                 .sorted((p1,p2)-> p1.getName().compareTo(p2.getName()))
                 .collect(Collectors.toList());
                
        return all;           
    }
    
    
    public List getStillEmployed() {
        List<Person> all = employees.stream()
                 .filter(p -> p.getEnd() == null)
                 .sorted((p1,p2)-> p1.getName().compareTo(p2.getName()))
                 .collect(Collectors.toList());
                
        return all;           
    }
    
    void exportEmployees(String employeeFile) {
        try(PrintWriter writer = new PrintWriter("C:\\javatraining\\AWSusanna\\CPHarjoitus1\\employee.txt")) {
            for(Person em : employees) {
                String s = this.getEmployeeInfo(em.getName());
                writer.println(s);
            }
            
            writer.close();
        }
        catch(IOException ioex) {
            System.out.println("Virhe kirjoitettaessa " + ioex.getMessage());
        }
    }
    
    
}
