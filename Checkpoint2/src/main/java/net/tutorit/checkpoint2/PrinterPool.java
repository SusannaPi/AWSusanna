/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.checkpoint2;

import java.util.ArrayList;

/**
 *
 * @author jyrki
 */
public class PrinterPool extends BaseClass<Printer>{
    //Viety yhteiseen kantaluokkaan
    //private ArrayList<Printer> printers=new ArrayList<>();
    
    //Viety yhteiseen kantaluokkaan
    /*
    public void add(Printer p){
        printers.add(p);
    }
    */
    
    
    public void showPool(){
        System.out.println("Printers");
        for(Printer p : list){
            System.out.println(p);
        }
    }
    
}
