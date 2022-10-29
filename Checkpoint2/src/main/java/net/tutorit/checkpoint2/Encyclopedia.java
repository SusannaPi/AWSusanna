/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.checkpoint2;

/**
 *
 * @author Susanna
 */
class Encyclopedia extends Book{
    private int pages = 0;
    
    Encyclopedia(int i) {
        super("Encyclopedia Britannica");
        this.pages = i;
    }
    
    
    /*
    @Override
    public String getTitle() {
        return "Encyclopedia Britannica";
    }
    */
    
    //Ylikirjoittaa Book-luokan metodin toString()
    @Override
    public String toString() {
        return "Huge book";
    }
    
    //Ylikirjoittaa Book-luokan metodin print()
    @Override
    public void print() {
        System.out.println("Encyclopedia britannica has 32640 pages");
    }
   
}
