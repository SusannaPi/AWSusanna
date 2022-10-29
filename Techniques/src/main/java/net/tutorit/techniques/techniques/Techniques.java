/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package net.tutorit.techniques.techniques;

import net.tutorit.techniques.techniques.interfaces.Worker;
import net.tutorit.techniques.techniques.collections.CollectionsTest;
import net.tutorit.techniques.techniques.files.FileTests;
import net.tutorit.techniques.techniques.dates.DateTests;
import net.tutorit.techniques.techniques.exceptions.ExceptionTests;


/**
 *
 * @author Susanna
 */
public class Techniques {
    
    
    
    /*class create finances(Worker w) method (meaning the class that contains
        the main method)
        • Calls w.pay (
        • And in the main
        • create Person and Company objects
        • Pass them to finances method*/
    /*    
    static void finances(Worker w, double salary) {
        w.pay(salary);
    }
    */
    
    
    
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //System.out.println("");
        
        //finances(a -> System.out.println("Pimeää työtä " + a), 8000);
        //System.out.println("");
        
        //CollectionsTest.weekdays();
        //CollectionsTest.mapTests();
        CollectionsTest.personArrayTest();
        
        //FileTests.createFiles();
        
        
        //DateTests.showCurrent();
        //DateTests.someCalculations();
        //DateTests.howManyDays();
        
        //ExceptionTests.testExceptions();
        
        
        
        
    }
}
