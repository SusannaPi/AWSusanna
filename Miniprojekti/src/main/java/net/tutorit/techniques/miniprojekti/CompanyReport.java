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
public class CompanyReport {
    private ScreenReporter companyReporter= new ScreenReporter();
    private ArrayList<Company> companys = new ArrayList<>();

    public CompanyReport() {
        companyReporter.addColumn("Company", 20);
        companyReporter.addColumn("Phone", 15);
        companyReporter.addColumn("Contact email", 20);
    }
    
    
    public void addData(Company company) {
        companys.add(company);
    }
    
    
    public void doReport() {
        companyReporter.printColumns();
        
        for (Company c : companys) {
            companyReporter.printData(c.getName());
            companyReporter.printData(c.getPhone());
            companyReporter.printData(c.getEmail());
        }
    }
    

    
}


