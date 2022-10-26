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
abstract public class ReportBase<T> {   
    private Reporter reporter;
    private ArrayList<T> information = new ArrayList<>();
    
    
    public ReportBase (Reporter rep) {
        reporter = rep;
        addColumns(reporter);
        
    }

    
    abstract protected void addColumns(Reporter reporter);  
    
    public void addData(T d) {
        information.add(d);
    }
    
    
    public void doReport() {
        reporter.beginReport();    // Avaa tiedoston
        //companyReporter.printColumns();     //Vie otsikot raportille/taululle
        
        for (T d : information) {
            printData(reporter, d);     
        }
        
        reporter.endReport();
    }
    
    abstract protected void printData(Reporter reporter, T d);
}
