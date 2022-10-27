/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.cpharjoitus2;

/**
 *
 * @author Susanna
 */
class Mult extends CalcBase{        
    public Mult(int a, int b) {
        super(a, b, "*");
    }
    
    @Override
    public int result() {
        int tulo = a * b;
        return tulo;
    }

    @Override
    public void print() {
        System.out.println(a + " * " + b + " = " + result());
    }    
}
