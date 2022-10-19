/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.techniques.somedates.datesAndTimes;


import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.FormatStyle;


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
    
    public static void dateXDaysFromNow(int days) {
        if (days < 0) return;
        LocalDate now = LocalDate.now();
        
        LocalDate xDaysLater = now.plusDays(days);
        System.out.println("Date " + days + " days later is " + xDaysLater);
        
        LocalDateTime xDaysLater9 = now.atStartOfDay().withHour(9).plusDays(days);
        System.out.println("Date " + days + " days later starting today at 9 o'clock is " + xDaysLater9);
        
    } 
    
    
    
}
