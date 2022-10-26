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
public class PersonReport extends ReportBase<Person> {
    
    public PersonReport(Reporter rep){
        super(rep);
    }
    
    protected void addColumns(Reporter reporter){
        reporter.addColumn("Name",20);
        reporter.addColumn("Age",5);
    }
    
    protected void printData(Reporter reporter, Person p){
        reporter.printData(p.getName());
        reporter.printData(p.getAge());
    }
}
    
    
    
    
    /*
    //private FileReporter personReporter = new FileReporter("henkilot.txt");
    private ArrayList<Person> persons = new ArrayList<>();
    private Reporter personReporter;
    
    public PersonReport(Reporter rep) {
        
        personReporter = rep;
        personReporter.addColumn("Name", 20);
        personReporter.addColumn("Age", 5);
    }
    
    
    public void addData(Person person) {
        persons.add(person);
    }
    
    
    public void doReport() {
        personReporter.beginReport();    // Avaa tiedoston
        //personReporter.printColumns();  //Vie otsikot raportille/taululle
        
        
        for (Person p : persons) {  //Vie tiedot raportille
            personReporter.printData(p.getName());
            personReporter.printData(p.getAge());
        }
        
        personReporter.endReport();
    }
    */
    

