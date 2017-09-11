/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sulav.ecommerce;
import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 *
 * @author NCC
 */
public class Cart {
    public LocalDateTime date;
    private ArrayList<product> items=new ArrayList();
    
    
    public void addProduct(product p){
        items.add(p);
    }
    private double getTotal(){
        double price=0;
        for (int i = 0; i < items.size(); i++) {
            price=price+items.get(i).getPrice();
            
        } 
        return price;
    }
    public void prepareBill(){
        System.out.println(UTIL.ORG_NAME);
        System.out.println(date);
        System.out.println("Sno.    Product         Price");
        
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i)+items.get(i).getName()+items.get(i).getPrice());
            
        }
        System.out.println("Total:"+getTotal());
    }
}
