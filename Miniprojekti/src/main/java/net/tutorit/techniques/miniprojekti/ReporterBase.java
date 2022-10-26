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
abstract public class ReporterBase implements Reporter{
    private ArrayList <ColumnDef> titleAndWidth = new ArrayList<>();
    private int counter = 0;
    private PrintWriter writer = null;
    abstract protected PrintWriter getWriter();         //Returns a PrintWriter object that can send character text to the client
    abstract protected void closeWriter(PrintWriter pw);
    

  
    @Override
    public void addColumn(String title, int width) {
        titleAndWidth.add(new ColumnDef(title, width));
    }

    
    @Override
    public void printColumns() {
        //prints titles 
        if (writer==null) return;
        
        for (ColumnDef c : titleAndWidth) {
            writer.printf("%-" + c.getWidth() + "s", c.getColumnTitle());
        }
        writer.println();
    }
    
   
    @Override
    public void printData(String data) {
        if (writer==null) return;
        
        writer.printf("%-" + titleAndWidth.get(this.counter).getWidth() + "s", data);
        this.counter++;
        
        if(this.counter >= titleAndWidth.size()) {
            this.counter = 0;
            writer.println();
        }   
    }

    
    @Override
    public void printData(int data) {
        printData("" + data);
    }
    
    
    @Override
    public void beginReport() {
        writer = getWriter();
        printColumns();   
    }

    
    @Override
    public void endReport() {
        writer.flush();
        closeWriter(writer);
    }
    
    
    
}
