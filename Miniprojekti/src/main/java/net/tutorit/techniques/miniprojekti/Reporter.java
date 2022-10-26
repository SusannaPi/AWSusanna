/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package net.tutorit.techniques.miniprojekti;

/**
 *
 * @author Susanna
 */

/*
  +Rajapinnan (engl. interface) avulla määritellään luokalta vaadittu käyttäytyminen, eli sen metodit
  +"public interface ..."
  + Rajapinnat määrittelevät käyttäytymisen metodien niminä ja palautusarvoina, 
    mutta ne eivät aina sisällä metodien konkreettista toteutusta
  + Näkyvyysmäärettä rajapintoihin ei erikseen merkitä, sillä se on aina public
*/

public interface Reporter {
    //Metodit, jotka ReporterBasen tulee toteuttaa
    
    void beginReport();
    
    void endReport();
    
    void printColumns();
    
    void addColumn(String title, int width);
    
    void printData(String data);
    
    void printData(int data);
    
    
    
}
