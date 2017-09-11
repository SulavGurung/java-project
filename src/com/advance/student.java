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
public class student extends person {
    ArrayList <subject> takes;
    public String studentId;

    public student(ArrayList<subject> takes, String studentId) {
        this.takes = takes;
        this.studentId = studentId;
    }

    
    
    public ArrayList<subject> getTakes() {
        return takes;
    }

    public void setTakes(ArrayList<subject> takes) {
        this.takes = takes;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    
     
}
