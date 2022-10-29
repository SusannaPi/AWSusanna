/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.cpharjoitus2;

import java.util.ArrayList;

/**
 *
 * @author jyrki
 */
public class SumList extends CalcList<Sum>{
    //Siirretty yhteiseen kantaluokkaan
    //private ArrayList<Sum> calculations=new ArrayList<>();
    
    
    //Siirretty yhteiseen kantaluokkaan
    /*
    public void add(Sum s){
        calculations.add(s);
    }
    */
    
    
    @Override
    public String getResult(Sum calc) {
        return "Summa " + calc.result();
    }
    
    
    //Myös tämä osuus on mahdollista siirtää yhteiseen kantaluokkaan. Silloin kantaluokkaan syntyy
    //abstraktimetodi, joka tulee implementoida. Yllä abstraktin metodin toteutus.
    /*
    public void print(){
        for(Sum s : calculations){
            System.out.println("Summa "+s.result());
        }
    }
    */
    
    
    
}
