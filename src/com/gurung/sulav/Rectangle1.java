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
public class Rectangle1 {
    int length;
    int breadth;

    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        
//        Rectangle1 p1=new Rectangle1(length, breadth);
        
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
   public int getArea(){
   return this.length*this.breadth;
   }
   public boolean isSquare(){
       if(length==breadth){
       return true;
       } else{
       return false;
       }
       
   }

    
    
    
}
