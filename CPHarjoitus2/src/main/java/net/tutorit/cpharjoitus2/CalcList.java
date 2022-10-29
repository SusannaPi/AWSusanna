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
//Yhteinen geneerinen abstrakti kantaluokka. Siirretään yhteinen toiminnallisuus tänne.
abstract public class CalcList<T> {
    //Molemmissa kantaluokissa alunperin listat, jonne kootaan laskutoimitukset
    protected ArrayList<T> calculations = new ArrayList<>();
    
    
    //Molemmissa kantaluokissa alunperin add-metodi, joka mahdollistaa laskutoimitusten 
    //lisäämisen listalle
    public void add(T t) {
        calculations.add(t);
    }
    
    
    // Metodi getResult(T calc) tulee implementoitavaksi perivissä luokissa, jos myös 
    //alempana oleva print()-metodi tuodaan tänne yhteiseen kantaluokkaan.
    abstract public String getResult(T calc);
    
    
    public void print() {
        for (T t : calculations) {
            System.out.println(getResult(t));
        }
    }
    
    
    
}
