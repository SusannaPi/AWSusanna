/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.cpharjoitus2;

/**
 *
 * @author jyrki
 */
public class SumList {
    private ArrayList<Sum> calculations=new ArrayList<>();
    
    public void add(Sum s){
        calculations.add(s);
    }
    
    public void print(){
        for(Sum s:calculations){
            System.out.println("Summa "+s.result());
        }
    }
}
