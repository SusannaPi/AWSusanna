/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.checkpoint2;

import java.util.ArrayList;

/**
 *
 * @author Susanna
 * @param <T>
 */
//Geneerinen kantaluokka: mahdollisuus kirjoittaa yleiskäyttöisiä funktioita ja luokkia  
//erikoistetaan käyttötilanteisiinsa sopiviksi. Kantaluokkaan kootaan yhteistä toiminnallisuutta 
//ja aliluokat erikoistavat kantaluokkansa toimintaa

public class BaseClass<T> {
    protected ArrayList<T> list = new ArrayList<>();
    
    public void add(T t) {
        list.add(t);
    }
    
       
}
