/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.techniques.techniques.exceptions;

/**
 *
 * @author Susanna
 */
public class ExceptionTests {
     /* 
      Toteuta tämä metodi siten, että käytät try-catchia tarkasti ja lähellä kohdetta,
      jossa poikkeus voi aiheutua
    */
    
    static int calculateWithExceptions(String calc){
        try {
            String[] parts = calc.split(" ");
            try {
                String a1 = parts[0];
                String operator = parts[1];
                String a2 = parts[2]; 
                try {
                    int a3 = Integer.parseInt(a1);
                    int a4 = Integer.parseInt(a2);
                    if (operator.equals("+")) {
                        return a3 + a4;
                    } else if (operator.equals("*")) {
                        return a3 * a4;
                    }
                }
                catch (NumberFormatException ex) {
                    System.out.println("Tekijät eivät ole numeroita");
                }
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Ei tarpeeksi tekijöitä");
            }        
        } 
        catch (NullPointerException ex) {
        System.out.println("Laskutoimitus ei voi olla null");
        }
        return 0;
    }

    /*
      Totauta tämä metodi siten, että metodin rungossa voi tapahtua mahdollisimman 
      vähän virheitä. Voit ensin palauttaa nollan, havaittuasi virheen.
      Sen jälkeen toteuta oma poikkeusluokka (CalculateException, 
      jolla viestit havaitsemastasi virheestä
    */
    static int calculateWithLessExceptions(String calc){
        if (calc == null) {
                return 0;
            }
        
        
        return 0;
    }
    
    static public void testExceptions(){
        try {
            System.out.println("Correct "+calculateWithExceptions("1 + 2"));
            System.out.println("Correct "+calculateWithExceptions("1 + a"));
            System.out.println("Correct "+calculateWithExceptions("1 +"));
            System.out.println("Correct "+calculateWithExceptions(null));
            System.out.println("Correct "+calculateWithLessExceptions("1 + 2"));
            System.out.println("Correct "+calculateWithLessExceptions("1 + a"));
            System.out.println("Correct "+calculateWithLessExceptions("1 +"));
            System.out.println("Correct "+calculateWithLessExceptions(null));
        }
        catch(Exception ex){
            System.out.println("Jotain meni pieleen, tänne ei pitäisi tulla");
            System.out.println(ex.getMessage());
        }
    }
}
