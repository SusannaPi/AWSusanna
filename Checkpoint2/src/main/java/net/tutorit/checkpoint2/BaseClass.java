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
public class BaseClass<T> {
    protected ArrayList<T> list = new ArrayList<>();
    
    public void add(T t) {
        list.add(t);
    }
    
       
}
