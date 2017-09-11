/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sulav.ecommerce;

/**
 *
 * @author NCC
 */
public class Mainclass {
    public static void main(String args[]){
    
        
        product p=new product("BAG", 678, 2017, 2018);
        product p1=new product("CAR", 678, 2017, 2018);
        product p2=new product("BIKE", 678, 2017, 2018);
        Cart c=new Cart();
        c.addProduct(p);
        c.addProduct(p1);
        c.addProduct(p2);
        c.prepareBill();
    
    }
    
}
