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
public class Address {
    private String country;
    private String province;
    private int zipcode;
    private String street1;
    private String street2;
    private int houseNumber;
    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Address(String country, String provinde, int zipcode, String street1, String street2, int houseNumber) {
        this.country = country;
        this.province = province;
        this.zipcode = zipcode;
        this.street1 = street1;
        this.street2 = street2;
        this.houseNumber = houseNumber;
    }
    public String getFullAddres(){
        String s="";
        s+="Country::"+getCountry()+"\nProvince::"+getProvince()+"\nZipcode::"+getZipcode()+"\nStreet1::"+getStreet1()+"\nStreet2::"+getStreet2()+"\nHouseNumber::"+getHouseNumber();
        return s;
    }
    
}
