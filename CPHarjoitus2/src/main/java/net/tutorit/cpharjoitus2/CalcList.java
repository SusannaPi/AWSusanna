/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.cpharjoitus2;

import java.util.ArrayList;

/**
 *
 * @author Susanna
 * @param <T>
 */
abstract public class CalcList<T> {
    protected ArrayList<T> calculations = new ArrayList<>();
    
    
    public void add(T t) {
        calculations.add(t);
    }
    
    
    /*
    abstract public String getResult(T calc);
    */
    
    /*
    public void print() {
        for (T t : calculations) {
            System.out.println(getResult(t));
        }
    }
    */
    
    
}
