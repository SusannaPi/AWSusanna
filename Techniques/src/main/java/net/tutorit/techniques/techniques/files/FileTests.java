/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.techniques.techniques.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Susanna
 */
public class FileTests {
    
    public static void createFiles() {
        // How to create a text files I/O
        
        try(PrintWriter writer = new PrintWriter("C:\\javatraining\\AWSusanna\\test.txt")) {
            writer.println("Tässä harjoitellaan");
            
            writer.close();
        }
        catch(Exception ex) {
            System.out.println("Tiedoston kirjoittaminen epäonnistui");
        }
        
        // How to create a text files NIO
        
        
        
        
        // How to read a text file I/O
        
        File file = new File("test.txt"); 
    
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while(true) {
                String st = reader.readLine();
                if(st.isEmpty()) {
                    break;
                }
                System.out.println(st);
            }
        } 
        catch (IOException ex) {
            System.out.println("Virhe luettaessa tiedostoa");
        }
        
        // How to read a text file NIO
        
    }
}
