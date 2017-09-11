/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exceptionhandling;

import java.util.Scanner;

/**
 *
 * @author NCC
 */
public class MainClass {
    public static void main(String args[]){
//        try{
//        int x=23;
//        int y=7;
//        int z=x/y;
//        System.out.println(z);
//        int ages[]={12,45};
//        int e=ages[4];
//        
//        } catch(ArithmeticException e){
//            System.out.println("YOU CANNOT DIVIDE A NUMBER BY ZERO:");
//        } catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("ARRAY NOT VALID:"+e.getMessage());
//        } catch(Exception e){
//            System.out.println("ERROR OCCURED:"+e.getMessage());
//        } 
    try{
        Scanner s=new Scanner(System.in);
            System.out.println("PLEASE INPUT FIRST NUMBER:");
        int a=s.nextInt();
            System.out.println("PLEASE INPUT SECOND NUMBER:");
        int b=s.nextInt();
        int c=a/b;
            System.out.println(c);
        } catch (ArithmeticException e){
            System.out.println("YOU CANNOT DIVIDE A NUMBER BY ZERO:");
        } catch (NumberFormatException e){
            System.out.println("PLEASE INPUT VALID CHARACTER:");
        } catch(Exception e){
            System.out.println("ERROR OCCURED:"+e.getLocalizedMessage()) ;   
        }
    }
    
}
