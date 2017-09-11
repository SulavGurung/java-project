package com.gurung.sulav;


import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NCC
 */
public class Util {

    /**
     *
     */
     
    
    
    
    public static double getAreaOfCircle(double r){
        return Math.PI*r*r;
    }
    public static double getAreaOfTriangle(double b,double h){
        return 0.5*b*h;
    }
    public static double getAreaOfRectangle(double l,double b1){
        return l*b1;
    }
    public static double getPerimeterOfcircle(double r){
        return Math.PI*2*r;
    }
    public static double getPerimeterOfTriangle(double a,double b,double c){
        return a+b+c;
    }
    public static double getPerimeterOfRectangle(double l, double b){
        return 2*(l+b);
    }
    public static String getUserName(String name){
        String cap=name.toUpperCase();
        LocalDate ld=LocalDate.now();
        int year=ld.getYear();
        int rand=(int)(Math.random()*100);
                return cap+year+""+rand;
    }
    public static int sum(int...nos){
        int sum=0;
        for (int i = 0; i <nos.length; i++) {
            sum+=nos[i];
            
        } return sum;
    
    } 
    public static int max(int[]nos){
    
        int max=0;
        for (int i = 0; i <nos.length; i++) {
            if(nos[i]>max){
            max=nos[i];
            }
        }
        return max;
    } 
    
    public static double getTemperatureF(double c){
        return (c*9.0/5)+32;
        
    
    }
    public static double getTemperatureK(double c){
        return c+273.15;
    
    }
    
    
    
}
