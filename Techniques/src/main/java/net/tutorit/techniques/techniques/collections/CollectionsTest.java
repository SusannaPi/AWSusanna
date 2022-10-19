/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.techniques.techniques.collections;

import java.util.HashSet;
import java.util.TreeSet;
import net.tutorit.techniques.techniques.interfaces.Person;

/**
 *
 * @author Susanna
 */
public class CollectionsTest {
    public static void weekdays() {
        HashSet<String> weekdays = new HashSet<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");
        
        
        for (String weekday: weekdays) {
            System.out.println(weekday);
        }
        System.out.println("");
        
        //Trying to add Monday again. Not working!
        weekdays.add("Monday");
        
        for (String weekday: weekdays) {
            System.out.println(weekday);
        }
        System.out.println("");
        
        
        TreeSet<String> weekdaysTree = new TreeSet<>();
        weekdaysTree.add("Monday");
        weekdaysTree.add("Tuesday");
        weekdaysTree.add("Wednesday");
        weekdaysTree.add("Thursday");
        weekdaysTree.add("Friday");
        weekdaysTree.add("Saturday");
        weekdaysTree.add("Sunday");
        
        for (String weekday: weekdaysTree) {
            System.out.println(weekday);
        }
        System.out.println("");
        
        //Trying to add Monday again. Not working!
        weekdaysTree.add("Monday");
        
        for (String weekday: weekdaysTree) {
            System.out.println(weekday);
        }
        System.out.println("");
        
        
        HashSet<Person> persons = new HashSet<Person>();
        Person hanna = new Person("Hanna");
        persons.add(hanna);
        persons.add(new Person("Hanna"));
        for (Person p : persons) {
            System.out.println(p.getName());
        }
        
    }
}
