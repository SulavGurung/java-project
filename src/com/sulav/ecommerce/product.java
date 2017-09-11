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
public class product {
    private String name;
    private int price;
    private int manufactureDate;
    private int expiryDate;

    public product(String name, int price, int manufactureDate, int expiryDate) {
        this.name = name;
        this.price = price;
        this.manufactureDate = manufactureDate;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(int manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(int expiryDate) {
        this.expiryDate = expiryDate;
    }
    
    public double getFinalPrice(){
        return price+UTIL.TAX_RATE*price;
    }
    
}
