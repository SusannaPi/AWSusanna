/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.techniques.miniprojekti;

/**
 *
 * @author Susanna
 */
public class Company {
    String company = "koodarit";
    String phone = "0";
    String email = "m";
    
    
    public Company(String company, String phone, String email) {
        this.company = company;
        this.phone = phone;
        this.email = email;
    }

    String getName() {
        return company;
    }

    String getPhone() {
        return phone;
    }

    String getEmail() {
        return email;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return company + " " + phone + " " + email;
    }
    
    
    
}
