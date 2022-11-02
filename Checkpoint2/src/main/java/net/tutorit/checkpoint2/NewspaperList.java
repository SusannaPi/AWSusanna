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
public class NewspaperList extends BaseClass<Newspaper>{
    //Viety yhteiseen kantaluokkaan
    //private ArrayList<Newspaper> listing=new ArrayList<>();
    
    //Viety yhteiseen kantaluokkaan
    /*
    public void add(Newspaper p){
        listing.add(p);
    }
    */
    
    
    public void listThem(){
        System.out.println("Newspapers");
        for(Newspaper p : list){
            System.out.println(p.getDescription());
        }
    }
    
    
}
