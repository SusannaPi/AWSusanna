/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.techniques.techniques.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import net.tutorit.techniques.techniques.interfaces.Person;

/**
 *
 * @author Susanna
 */
public class CollectionsTest {
    
    static ArrayList<Person> persons1 = new ArrayList<>();
    
    static{
        persons1.add(new Person());
        persons1.add(new Person("Anne", 58));
        persons1.add(new Person("Helena", 2));
        persons1.add(new Person("Aimo", 77));
        persons1.add(new Person("Heikki", 12));
        
        
    }
    public static void showPersons() {
        for(Person p : persons1) {
            System.out.println(p);
        }  
    }
    
    
    public static void personArrayTest() {
            showPersons();
            System.out.println(persons1);
            /*System.out.println("... alphabetical order " );
            persons1.sort((person1, person2) -> person1.getName().compareTo(person2.getName()));
            System.out.println(persons1);
            
            System.out.println("...sorted by age...");
            persons1.sort((person1, person2) -> person1.getAge()-(person2.getAge()));
            System.out.println(persons1);*/
            
            System.out.println("");
            
            persons1.stream().sorted((p1,p2)-> p1.getName().compareTo(p2.getName()))
                    .forEach(System.out::println);
            
            System.out.println("");
            
            
            persons1.stream().sorted((p1,p2) -> (p1.getAge()-p2.getAge()))
                    .forEach(System.out::println);
            
            System.out.println("");
            
            persons1.stream().filter(p -> p.getAge() > 18).forEach(System.out::println);
            System.out.println("");
            
            persons1.stream().filter(p -> p.getAge() > 18)
                    .sorted((p1,p2)-> p1.getName().compareTo(p2.getName()))
                    .forEach(System.out::println);
    }
    
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
        
        
        Set<Person> persons2 = new TreeSet<Person>();
        Person hanna = new Person("Hanna");
        persons2.add(hanna);
        //Trying to add Hanna again, but it is not working becaude class Person has 
        //equals + hashcode methods without those you have two Hanna in HashSet persons
        
        //persons.add(new Person("Hanna"));
        persons2.add(new Person("Aapo"));
        persons2.add(new Person("Kaisa"));
        persons2.add(new Person("Yvonne"));
        persons2.add(new Person("Tuomas"));
        
        for (Person p : persons2) {
            System.out.println(p.getName());
        }
        System.out.println("");  
    }   
    
    
    public static void mapTests() {
        System.out.println("Testing maps");
        HashMap<String, Person> codes = new HashMap<>();
        
        Person kaisu = new Person("Kaisu");
        String sotu = "090909-xxxx";
        
        codes.put(sotu, kaisu);
        codes.put("070707-3333", new Person("Markku"));
        codes.put("010101-1234", new Person("Maiju"));
        
        System.out.println("Going through keys and printing values");
        for (String s : codes.keySet()) {
            System.out.println(s + " ==> " + codes.get(s).getName());
        }
        System.out.println("");
        System.out.println("Going through values");
        for (Person p : codes.values()) {
            System.out.println(p.getName());
        }
        System.out.println("");
        
        System.out.println("Finding keys and values");
        for(Entry<String, Person> pe : codes.entrySet()) {
            System.out.println(pe.getKey() + " ==> " + pe.getValue().getName());
        }
        System.out.println("");
        
        System.out.println("Who's social security number is 090909-xxxx?");
        System.out.println(codes.get("090909-xxxx").getName());
        System.out.println("");
          
        System.out.println("Arvotaan lottonumeroita 1000 kpl HashMapiin");
        Map<Integer, Integer> im = new HashMap<>();
        for(int i = 0; i < 1000; i++) {
            int random = (int)(Math.random()*37+1);
            int prev = im.getOrDefault(random, 0);
            im.put(random, prev+1);
        }
        
        System.out.println("How many times you can find the same number?");
        for(int i : im.keySet()) {
            System.out.println("Number " + i + " you can find " + im.get(i) + " times");
        }
        System.out.println("");
        
    }
    
    
    
        
    
    
    
    
    
}
