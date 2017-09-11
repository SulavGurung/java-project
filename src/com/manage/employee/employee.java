/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manage.employee;

/**
 *
 * @author NCC
 */
public class employee extends person {
    
    private int salary;
    
    public employee(String name, int age, String address, String qualification, String gender,int salary){
        super(name,age,address,qualification,gender);
        this.salary=salary;
        
    
    }

    public employee(int salary) {
        this.salary = salary;
    }
    
    

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
     public void getFullInformation(){
         super.getFullInformation();
         System.out.println("Salary: "+getSalary()+"\n");
     }
    
}
