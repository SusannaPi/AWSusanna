/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.cpharjoitus2;

/**
 *
 * @author Susanna
 */
public class Other extends Some {
    //private String t = "";

    
    public Other(String s) {
        super("Other");
    }

    
    //Ylikirjoitetaan kantaluokan metodi print()
    @Override
    public void print() {
        System.out.println("Some stuff");
    }
    
    
    /* Jos tämä olisi ylikirjoitettu tulostuisi Other kutsuttaessa System.out.println(t), mutta koska
    ei ole ylikirjoitettu tulostuu Some. Testaa. */
    /*
    @Override
    public String toString() {
        return "Other";
    }
    */
}
