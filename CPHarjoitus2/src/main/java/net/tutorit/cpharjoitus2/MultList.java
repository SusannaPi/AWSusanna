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
public class MultList extends CalcList<Mult>{
    //Siirretty yhteiseen kantaluokkaan
    //private ArrayList<Mult> calculations=new ArrayList<>();
    
    
    //Siirretty yhteiseen kantaluokkaan
    /*
    public void add(Mult m){
        calculations.add(m);
    }
    */
    
    
    @Override
    public String getResult(Mult calc) {
        return "Tulo " +calc.result();
    }
    
    
    //Myös tämä osuus on mahdollista siirtää yhteiseen kantaluokkaan. Silloin kantaluokkaan syntyy
    //abstraktimetodi, joka tulee implementoida. Yllä abstraktin metodin toteutus.
    /*
    public void print(){
        for(Mult m : calculations){
            System.out.println("Tulo "+m.result());
        }
    }
    */
    
    

}
