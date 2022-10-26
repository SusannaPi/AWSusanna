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
public class CompanyReport extends ReportBase<Company>{
    
    public CompanyReport(Reporter rep){
        super(rep);
    }
    
    protected void addColumns(Reporter reporter) {
        reporter.addColumn("Company", 20);
        reporter.addColumn("Phone", 15);
        reporter.addColumn("Contact email", 20);
    }
    
    protected void printData(Reporter reporter, Company c) {
        reporter.printData(c.getName());
        reporter.printData(c.getPhone());
        reporter.printData(c.getEmail());
    }
    
    
    /*
    //private ScreenReporter companyReporter= new ScreenReporter();
    //private ArrayList<Company> companys = new ArrayList<>();
    
    private Reporter companyReporter;
    private ArrayList<Company> companys = new ArrayList<>();

    public CompanyReport(Reporter rep) {
        reporter = rep;
        companyReporter.addColumn("Company", 20);
        companyReporter.addColumn("Phone", 15);
        companyReporter.addColumn("Contact email", 20);
    }
    
    
    public void addData(Company company) {
        companys.add(company);
    }
    
    
    public void doReport() {
        companyReporter.beginReport();    // Avaa tiedoston
        //companyReporter.printColumns();     //Vie otsikot raportille/taululle
        
        
        for (Company c : companys) {
            companyReporter.printData(c.getName());
            companyReporter.printData(c.getPhone());
            companyReporter.printData(c.getEmail());
        }
        
        
        companyReporter.endReport();
    }
    
    */
    
}


