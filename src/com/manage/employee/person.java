/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manage.employee;

import java.time.LocalDateTime;

/**
 *
 * @author NCC
 */
public class person {
    public String name;
    public int age;
    public String address;
    public String qualification;
    public String gender;
    public LocalDateTime dateOfBirth;

    public person() {
    }
    
    

    public person(String name, int age, String address, String qualification, String gender) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.qualification = qualification;
        this.gender = gender;
        this.dateOfBirth=LocalDateTime.now().minusYears(age);
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public void getFullInformation(){
        String message="";
        message+="Name: "+getName()+"\n";
        message+="Age: "+getAge()+"\n";
        message+="Address: "+getAddress()+"\n";
        message+="Qualification: "+getQualification()+"\n";
        message+="Gender: "+getGender()+"\n";
        message+="Date of birth: "+getDateOfBirth()+"\n";
        System.out.println(message);
        
    
    
    
    
    
    }
    
    
    
    
}
