/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.advance;

import java.util.ArrayList;

/**
 *
 * @author NCC
 */
public class teacher extends person {
    ArrayList <subject> teach;
    public long salary;
    public String position;

    public teacher(String name,int age,String address,char gender, long salary, String position) {
        super(name,age,address,gender);
        this.salary = salary;
        this.position = position;
    }
    
    

    public teacher(ArrayList<subject> teach, long salary, String position) {
        this.teach = teach;
       
    }

    
    
    public ArrayList<subject> getTeach() {
        return teach;
    }

    public void setTeach(ArrayList<subject> teach) {
        this.teach = teach;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    
}
