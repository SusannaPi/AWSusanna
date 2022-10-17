/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Susanna
 */
import java.util.Scanner;
        

public class numbergame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        while (true) {
            int secret=(int)(Math.random()*100+1);
            //System.out.println("secret");
            System.out.println("Guess secret number between 0-100: ");
            int guess = Integer.valueOf(scanner.nextLine());
            //jatkuu
        }
        
    }    
}
