package com.manage.employee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NCC
 */
public class MainClass {
    public static void main(String args[]){
        employee e=new employee("Sulav", 19, "Nayabazar", "+2", "Male", 20000);
        e.getFullInformation();
        
        manager m=new manager("SUlav", 19, "Nayabazar", "Bachelor", "Male", "Senior", 3000000);
        m.getFullInformation();
    }
    
}
