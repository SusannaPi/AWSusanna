/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.cpharjoitus2;

/**
 *
 * @author jyrki
 */
public class MultList {
    private ArrayList<Mult> calculations=new ArrayList<>();
    
    public void add(Mult m){
        calculations.add(m);
    }
    
    public void print(){
        for(Mult m:calculations){
            System.out.println("Tulo "+m.result());
        }
    }
}
