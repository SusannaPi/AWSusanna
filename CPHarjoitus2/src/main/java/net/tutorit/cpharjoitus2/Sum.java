/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.cpharjoitus2;

/**
 *
 * @author Susanna
 */
class Sum extends CalcBase{       
    public Sum(int a, int b) {
        super(a, b, "+");
    }
    
    @Override
    public int result() {
        int summa = a + b;
        return summa;
    }

    @Override
    public void print() {
        System.out.println(a + " + " + b + " = " + result());
    }
          
}
