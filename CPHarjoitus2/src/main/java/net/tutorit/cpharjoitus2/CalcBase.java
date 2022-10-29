/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.cpharjoitus2;

/**
 *
 * @author Susanna
 */
//Abstrakti luokka

public abstract class CalcBase {
    //Attribuutit näkyvät periville luokille
    protected int a;
    protected int b;
    String operator;
    
    
    public CalcBase(int a, int b, String operator) {
        this.a = a;
        this.b = b;
        this.operator = operator;
        
    }
    
    
    //Abstrakti-metodi, jonka sisällön perivä luokka määrittelee
    public abstract int result();
    
    
    public void print() {
        System.out.println("a" + "operator" + "b" + "=" + result());
    }
    
    
     
    
}
