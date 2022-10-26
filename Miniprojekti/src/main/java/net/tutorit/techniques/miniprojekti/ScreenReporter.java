/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.techniques.miniprojekti;

import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Susanna
 */

public class ScreenReporter extends ReporterBase{
    // ScreenReporter-luokka (=aliluokka) perii ReporterBase-luokan (=yliluokka)
    // Tulostaa tekstin näytölle ja sulkee kirjoittimen
    
    
    @Override
    protected PrintWriter getWriter(){              //Hakee PrintWriterin
        return new PrintWriter(System.out);             //teksti lähetetään näytölle
    }
    @Override
    protected void closeWriter(PrintWriter pw){                 //Sulkee PrintWriterin
        pw.close();
    }
}



/*public class ScreenReporter extends ReporterBase{
    private ArrayList <ColumnDef> titleAndWidth = new ArrayList<>();
    private int counter = 0;
    
    
    /*public void addColumn(String title, int width) {
        titleAndWidth.add(new ColumnDef(title, width));
           
    }
    */
    
    /*
    public void printColumns() {
        //prints titles 
        
        /*for (int i = 0; i < titleAndWidth.size(); i++) {
            System.out.printf("%-" + titleAndWidth.get(i).getWidth() + "s", titleAndWidth.get(i).getColumnTitle());  
        }
        
        System.out.println();
        */
        
        
        /*for (ColumnDef c : titleAndWidth) {
            System.out.printf("%-" + c.getWidth() + "s", c.getColumnTitle());
        }
    
        System.out.println();
        */
             
   
   
    /*public void printData(String name) {
        System.out.printf("%-" + titleAndWidth.get(this.counter).getWidth() + "s", name);
        this.counter++;
        
        if(this.counter >= titleAndWidth.size()) {
            this.counter = 0;
            System.out.println("");
        }   
        
    }
    */
    
    /*
    public void printData(int age) {
        printData("" + age);  
    }
    */   
    
    
    
    
