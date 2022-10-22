/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.techniques.techniques.dates;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author Susanna
 */


public class DateTests {
    
    public static void showCurrent() {
        // date
        LocalDate current = LocalDate.now();
        System.out.println("Current date " + current);
        
        // time
        LocalTime time = LocalTime.now();
        System.out.println("Current time: " + time);
        
    }
    
    public static void someCalculations() {
        // today
        LocalDate now = LocalDate.now();
        Duration dur = Duration.ofDays(35);
        System.out.println("Duration " + dur);
        
        LocalDateTime dt = now.atStartOfDay().withHour(9).plusDays(dur.toDays());
        System.out.println("35 days from now " + dt);
    }
    
    
    public static void howManyDays() {
        //When is Christmas
        LocalDate now = LocalDate.now();
        LocalDate christmas = now.withMonth(12).withDayOfMonth(24);
        long days = now.until(christmas, ChronoUnit.DAYS);
        System.out.println("Until Christmas it will be " + days + " days.");
        
        //When is next Friday 13?
        LocalDate now2 = LocalDate.now();
        LocalDate friday = now2.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        while(friday.getDayOfMonth() != 13){
            friday=friday.plusDays(7);
        }
        System.out.println("Next Friday 13th will be " + friday);
        
        
    }
    
    
    
    
    
    
}
