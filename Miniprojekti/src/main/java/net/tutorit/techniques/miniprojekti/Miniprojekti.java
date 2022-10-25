/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package net.tutorit.techniques.miniprojekti;

/**
 *
 * @author Susanna
 */
public class Miniprojekti {

    public static void main(String[] args) {
        ScreenReporter rep=new ScreenReporter();
        rep.addColumn("Name",20);
        rep.addColumn("Age",5);
        rep.printColumns();
        rep.printData("John Wayne");
        rep.printData(82);
        rep.printData("Ronald Reagan");
        rep.printData(93);
        System.out.println("");
        
        PersonReport pr=new PersonReport();
        pr.addData(new Person("John Wayne",82));
        pr.addData(new Person("Ronald Reagan",92));
        pr.doReport();
        System.out.println("");
        
       
       
        
        CompanyReport cr=new CompanyReport();
        cr.addData(new Company("Coders Unlimited","555-234234","info@coders.net"));
        cr.addData(new Company("Testers united","555-123123","info@testers.com"));
        cr.doReport();
        
        
    }
}
