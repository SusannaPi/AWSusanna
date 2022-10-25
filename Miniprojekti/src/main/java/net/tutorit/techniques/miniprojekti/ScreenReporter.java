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
public class ScreenReporter{
    private ArrayList <ColumnDef> titleAndWidth;
    private int counter = 0;
    
    
    public ScreenReporter() {
        this.titleAndWidth = new ArrayList<>(); 
        this.counter = 0;
    }
    
    
    public void addColumn(String title, int width) {
        titleAndWidth.add(new ColumnDef(title, width));
           
    }
    
    
    public void printColumns() {
        //prints titles 
        
        for (int i = 0; i < titleAndWidth.size(); i++) {
            System.out.printf("%-" + titleAndWidth.get(i).getWidth() + "s", titleAndWidth.get(i).getColumnTitle());  
        }
        
        System.out.println();
        
        /*for (ColumnDef c : titleAndWidth) {
            System.out.printf("%-" + c.getWidth() + "s", c.getColumnTitle());
        }*/
        
        //System.out.println();
          
    }
    
    
    public void printData(String name) {
        
      //ColumnDef cd = titleAndWidth.get(this.counter);
        System.out.printf("%-" + titleAndWidth.get(this.counter).getWidth() + "s", name);
        this.counter++;
        
        if(this.counter >= titleAndWidth.size()) {
            this.counter = 0;
            System.out.println("");
        }
        
        
    }
    
    
    public void printData(int age) {
        printData(""+ age);
        
    }
       
}
