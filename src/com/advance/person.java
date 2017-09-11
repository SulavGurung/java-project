/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.advance;

/**
 *
 * @author NCC
 */
public class person {
    public String name;
    public int age;
    public String address;
    public char gender;

    public person() {
    }

    
    public person(String name, int age, String address, char gender) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    
    
}
