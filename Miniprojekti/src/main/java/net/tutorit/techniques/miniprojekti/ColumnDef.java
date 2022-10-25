/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.tutorit.techniques.miniprojekti;

/**
 *
 * @author Susanna
 */
public class ColumnDef {
    private String columnTitle;
    private int width;
    
    
    public ColumnDef(String columnTitle, int width) {
        this.columnTitle = columnTitle;
        this.width = width;
    }

    public void setColumnTitle(String columnTitle) {
        this.columnTitle = columnTitle;
    }

    public String getColumnTitle() {
        return columnTitle;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
         
}
