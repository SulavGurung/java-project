/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abstraction;

import com.gurung.sulav.Util;

/**
 *
 * @author NCC
 */
public class java {
    public static void main(String args[]){
        Rectangle r=new Rectangle(37,24);
        System.out.println("Area: "+r.getArea()+" Perimeter: "+r.getPerimeter());
        
        Circle c=new Circle(45);
        System.out.println("Area: "+c.getArea()+" Perimeter: "+c.getPerimeter());

    }
}
