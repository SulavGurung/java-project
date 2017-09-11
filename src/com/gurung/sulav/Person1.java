/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gurung.sulav;

import java.util.ArrayList;

/**
 *
 * @author NCC
 */
public class Person1 {
    private static int count;
    private String name;
//    private String address;
    private byte age;
    private String qualification;
    private float percentage;
    private boolean completedPlusTwo;
    private String destination;
    private ArrayList<Address> address=new ArrayList();
    private ArrayList<Myfile>  file=new ArrayList();
    
    public void addMyfile(Myfile b){
        file.add(b);
    }
    
    public void addAddress(Address a){
        address.add(a);
    }
    
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

public Person1(){
    increaseCount();
}

    public Person1(String name, byte age, String qualification, float percentage, boolean completedPlusTwo) {
        increaseCount();
        setName(name);
//        this.address = address;
        setAge(age);
        this.qualification = qualification;
        this.percentage = percentage;
        this.completedPlusTwo = completedPlusTwo;
        
        System.out.println(getFullInformation());
    }
    private static void increaseCount (){
     count++;
    }
    public static int getTotalCount(){
        return count++;
    }

public void setName(String n){
    if(n.length()>5){
    name=n;
    }
}
public String getName(){
    if(age>18){
        return name;
}

        return "Not eligible to view";
}
public void setAge(byte a){
    if(a>10 && a<60){
        age=a;
}
}
public byte getAge(){
    return age;
}

//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public boolean isCompletedPlusTwo() {
        return completedPlusTwo;
    }

    public void setCompletedPlusTwo(boolean completedPlusTwo) {
        this.completedPlusTwo = completedPlusTwo;
    }
    public String getFullInformation(){
    String fullInfo="STUDENT NAME:"+getName()+"\n";
//    fullInfo+="STUDENT ADDRESS:"+getAddress()+"\n";
    fullInfo+="STUDENT AGE:"+getAge()+"\n";
    fullInfo+="STUDENT QUALIFICATION:"+getQualification()+"\n";
    fullInfo+="STUDENT PERCENTAGE:"+getPercentage()+"\n";
    fullInfo+="STUDENT COMPLETED+2"+isCompletedPlusTwo()+"\n";
    return fullInfo;
        
    }
    
    
    
    public String getRecomendation(){
    String message ="";
    if(destination=="AUS"){
        message=getDestination()+"is one of the most preffered country for abroad studies.\n"+"Many nepalese people migrate to Australia in regular basis.\n";
        message+="Univeristy of Sydney,University of melbourne are some universities of Australia.";
    }else if(destination=="USA"){
        message="USA is the land of oppertunities.n"+"Nepalese people are also interested in USA after Australia.\n "+"Some of the universities of USA are Havard,Cambridge and many more.";
    
    }else if(destination=="IND"){
        message=getDestination()+"is our neighbouring country.\n"+"Many nepalese student prefer India for studies.";
    }
    return message;
    }
    
    
    public void getAllAddress(){
        for(Address a:address){
            System.out.println(a.getFullAddres());
        }
    }
    public void getFile(){
        for(Myfile b:file){
            System.out.println(b.getFile());
        
        }
}

}
