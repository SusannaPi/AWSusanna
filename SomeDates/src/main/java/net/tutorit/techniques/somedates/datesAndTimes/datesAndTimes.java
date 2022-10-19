/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.techniques.somedates.datesAndTimes;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.format.FormatStyle;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;



/**
 *
 * @author Susanna
 */
public class datesAndTimes {
    
    public static void printTodaysDate() {
        LocalDate todaysDate = LocalDate.now();
        System.out.println("Todays date " + todaysDate);
    }
    
    public static void printTimeNow() {
        LocalTime timeNow = LocalTime.now();
        System.out.println("Time is now " + timeNow);
    }
    
    
    public static void timeAndDateNow() {
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("Date and time now are " + dateTimeNow);
        System.out.println("");
        
        DateTimeFormatter formatHelper = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String formattedDateTimeNow = dateTimeNow.format(formatHelper);
        System.out.println("Date and time can be formatted as follows: " + formattedDateTimeNow);
        System.out.println("");
        
        //System.out.println(dateTimeNow.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
    }
    
    public static void durationAndDate() {
        LocalDate now = LocalDate.now();
        
        Duration dur = Duration.ofDays(35);
        System.out.println("Duration is" + dur);
        System.out.println("Duration to days is " + dur.toDays());
        
        LocalDate xDaysLater = now.plusDays(35);
        System.out.println("Date 35 days later is " + xDaysLater);
        
        LocalDateTime xDaysLater9 = now.atStartOfDay().withHour(9).plusDays(35);
        System.out.println("Date 35 days later starting today at 9 o'clock is " + xDaysLater9);
        System.out.println("");
        
    } 
    
    public static void whenIsChristmas() {
        LocalDate now = LocalDate.now();
        LocalDate christmas = now.withMonth(12).withDayOfMonth(24);
        long days = now.until(christmas, ChronoUnit.DAYS);
        System.out.println("Until Christmas it will be " + days + " days.");
    }
    
    public static void whenIsFriday13() {
        LocalDate now = LocalDate.now();
        LocalDate friday = now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        while(friday.getDayOfMonth() != 13){
            friday=friday.plusDays(7);
        }
        System.out.println("Next Friday 13th will be " + friday);
         
       
        
    }
    
    
    
}
