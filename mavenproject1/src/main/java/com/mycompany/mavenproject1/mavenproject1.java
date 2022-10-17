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
import java.util.ArrayList;
        

public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> guesses = new ArrayList<>();
        
        int secret=(int)(Math.random()*100+1);
        
        while (true) {
            System.out.println("Guess secret number between 0-100: ");
            int guess = Integer.valueOf(scanner.nextLine());
            
            guesses.add(guess);
            
            if (guess == secret) {
                System.out.println("Gongratulation. You had " + guesses.size() + " guesses.");
                break;
            }
            
            if (guess < secret) {
                System.out.println("You guess was too small.");
            }
            
            if (guess > secret) {
                System.out.println("You guess was too big.");
            }
            
        }
        
    }    
}
