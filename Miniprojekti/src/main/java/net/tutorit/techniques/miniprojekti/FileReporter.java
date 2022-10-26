/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.techniques.miniprojekti;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Susanna
 */

public class FileReporter extends ReporterBase{
    // FileReporter-luokka (=aliluokka) perii ReporterBase-luokan (=yliluokka)
    // Hakee PrintWriterin, joka saa parametrikseen FileWriterin, joka saa parametrikseen tiedoston nimen
    // Sulkee PrintWriterin
    
    private String fileName;
    
    public FileReporter(String fileName) {          //Konstruktori
        this.fileName = fileName;    
    }
    
    @Override
    protected PrintWriter getWriter(){
        try{
            return new PrintWriter(new FileWriter(fileName));
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    
    @Override
    protected void closeWriter(PrintWriter pw){
        pw.close();
    }
    
    
    
    //private ArrayList <ColumnDef> titleAndWidth = new ArrayList<>();
    //private int counter;
    //private PrintWriter out;
    //private String fileName;
    
    
    /*public void addColumn(String title, int width) {
        titleAndWidth.add(new ColumnDef(title, width));
           
    }
    */
    
    
    /*
    public void printColumns() {
        //prints titles 
        
        for (ColumnDef c : titleAndWidth) {
            out.printf("%-" + c.getWidth() + "s", c.getColumnTitle());
        }
        
        out.println();
          
    }
    */
    
    /*public void printData(String name) {
        out.printf("%-" + titleAndWidth.get(this.counter).getWidth() + "s", name);
        this.counter++;
        
        if(this.counter >= titleAndWidth.size()) {
            this.counter = 0;
            out.println("");
        }   
        
    }
    */
    
    /*public void printData(int age) {
        printData("" + age);
        
    }
    */ 
    
    // Opens the file
    /*public void beginReport() {
        try {
            out=new PrintWriter(new FileWriter(this.fileName)); 
           
        }
        catch (IOException ex) {
            System.out.println("Raportin kirjoitus epäonnistui");
            
        }
    }
    */
    
    /*
    // Closes the file
    public void endReport() {
        out.flush();
        out.close();
    }
    */
    
}
    
    
    
    

