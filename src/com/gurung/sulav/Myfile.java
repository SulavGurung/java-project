/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gurung.sulav;

/**
 *
 * @author NCC
 */
public class Myfile { 
    private String myFile;
    private int entryDate;
    private double fileSize;

    public Myfile(String myFile, int entryDate) {
        this.myFile = myFile;
        this.entryDate = entryDate;
    }

    public Myfile(String myFile, int entryDate, double fileSize) {
        this.myFile = myFile;
        this.entryDate = entryDate;
        this.fileSize = fileSize;
    }

    public String getMyFile() {
        return myFile;
    }

    public void setMyFile(String myFile) {
        this.myFile = myFile;
    }

    public int getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(int entryDate) {
        this.entryDate = entryDate;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }
    public String getFile(){
    String f="";
    f+="FileName::"+getMyFile()+"\nEntryDate::"+getEntryDate()+"\nFileSize::"+getFileSize();
            return f ;
    }
    
}
