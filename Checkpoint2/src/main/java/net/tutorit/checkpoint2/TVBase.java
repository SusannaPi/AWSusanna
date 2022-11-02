/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.checkpoint2;

/**
 *
 * @author Susanna
 */
//Abstrakti kantaluokka

abstract class TVBase {
    protected String name = "";
    
    public TVBase(String name) {
        this.name = name;
    }
    
    // Abstraktit metodit tulee implementoida
    public abstract String getDuration();
    
    
    public void print() {
        System.out.println(name + getDuration());
    }
    
    
}
