/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.checkpoint2;

/**
 *
 * @author Susanna
 */
abstract class TVBase {
    protected String name = "Tunturi";
    
    public TVBase(String name) {
        this.name = name;
    }
    
    
    public abstract String getDuration();
    
    
    public void print() {
        System.out.println(name + getDuration());
    }
    
    
}
