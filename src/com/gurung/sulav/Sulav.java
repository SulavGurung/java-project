/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gurung.sulav;
//import Util;
import com.gurung.sulav.Person;
import java.util.Scanner;
/**
 *
 * @author NCC
 */
public class Sulav {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//      
//String name="Sulav";
//       byte age=20;
//       String address="Kathmandu";
//       String mobile="9860558492";
//       float plus2percentage=79.56f;
//       char gender='M';
//       boolean passedplus2=true;
//        System.out.println(name);
//        System.out.println("I am "+name+ " from " +address+"\n I am "+age+" years old. "+" completed +2 with "+plus2percentage);
//        int age1=026;
//        System.out.println("Age is "+age1);
//        int age2=0b111100001111;
//        System.out.println("Age is "+age2);

//    double x=7.0;
//    int y=4;
//       
//     System.out.println("The sum of "+x+" and "+y+" is "+(x+y));
//      System.out.println("The difference of "+x+" and "+y+" is "+(x-y));
//       System.out.println("The product of "+x+" and "+y+" is "+(x*y));
//        System.out.println("The division of "+x+" and "+y+" is "+(x/y));
//int age=22;
//boolean hasVoterCard=false;
//if(age>=18 && hasVoterCard){
//    System.out.println("He is eligible");
//   
//}else{
//    System.out.println("Not eligible");
//}
//int n=8767;
//if(n%7==0){
//    System.out.println(n+" is multiple of 7");
//}else{
//    System.out.println(n+" is not a multiple of 7");
//}
//int percentage=80;
//if(percentage>90){
//    System.out.println("A+");
//}else if(percentage > 80 && percentage < 90){
//    System.out.println("A-");
//}else if (percentage>70 && percentage<80){
//    System.out.println("B+");
//}else if(percentage>60 && percentage<70){
//    System.out.println("B-");
//}else if (percentage>50 && percentage<60){
//    System.out.println("C+");
//}else if (percentage>40 && percentage<50){
//    System.out.println("C-");
//}else if (percentage>30 && percentage<40){
//    System.out.println("D+");
//}else if (percentage>20 && percentage<30){
//    System.out.println("D-");
//}else{
//    
//    System.out.println("withheld");
//}
//int salary=4_50_000;
//double tax=0.0;
//boolean married=true;
//
//Scanner s=new Scanner(System.in);
//        System.out.println("What is your salary?");
//        int salary=s.nextInt();
//        System.out.println("Are you married?");
//        String strMarried=s.next();
//        if(strMarried.equals("T") || strMarried.equals("True") || strMarried.equals("Yes") || strMarried.equals("Y")){
//            married=true;
//        }else {
//        married=false;
//        }
//        
//
//
//if(married){
//    if(salary<300000){
//    tax=salary*0.01;
//    }else if(salary>300000&&salary<500000){
//        tax=300000*0.01+(salary-300000)*0.1;
//    }else if(salary>500000&&salary<1000000){
//        tax=200000*0.1+(salary-500000)*0.15;        
//    }else{
//        tax=3000+20000+75000+(salary-1000000)*0.25;
//    }
//}else{
//    if(salary<300000){
//        tax=salary*0.0;
//    }else if(salary>300000&&salary<500000){
//        tax=300000*0.0+(salary-300000)*0.05;
//    }else if(salary>500000&&salary<1000000){
//        tax=200000*0.05+(salary-500000)*0.1;        
//    }else{
//        tax=3000+20000+75000+(salary-1000000)*0.15;
//    }
//} 
//
//
//        System.out.println("Tax for "+salary+" is "+tax);
//   Scanner s=new Scanner(System.in);
//        System.out.println("Please enter a number");
//        int input=s.nextInt();
//        if(input%2==0){
//            System.out.println(input+" is even.");
//        }else {
//            System.out.println(input+" is odd.");
//                }
//System.out.println("Enter first number");
//int firstInput=s.nextInt();
//        System.out.println("Enter second number");
//int secondInput=s.nextInt();
//if(firstInput>secondInput){
//    System.out.println(firstInput+" is greater than "+secondInput);
//}else {
//    System.out.println(secondInput+" is greater than "+firstInput);

//    }
//System.out.println("Please enter a country code");
//String code=s.next();
//switch(code){
//    case"NP":
//        System.out.println("NEPAL");
//        break;
//    case"IN":
//        System.out.println("INDIA");
//        break;
//    case"PK":
//        System.out.println("PAKISTAN");
//        break;
//    case"BG":
//        System.out.println("BANGLADESH");
//        break;
//    case"AF":
//        System.out.println("AFGHANISTAN");
//        break;
//    case"BU":
//        System.out.println("BHUTAN");
//    case"ML":
//        System.out.println("MALDIVES");
//    default:
//        System.out.println("PLEASE ENTER A VALID CODE");
//            
//}
//Scanner s=new Scanner(System.in);
//        System.out.println("Which multiplication table do you want?");
//        int input=s.nextInt();
//for(int i=1;i<10;i+=1){
//    for(int j=1;j<10;j+=1){
//    
//    System.out.print(i+"*"+j+"="+(j*i)+"\t");}
//    System.out.println("");
//    
//}
//for(int i=1;i<100;i++){
//    if(i%2==0){
//        System.out.println(i+" is even.");
//    } else{
//        System.out.println(i+" is odd.");
//    }
//    }

//for(int i=0;i<10;i++){
//    for (int j = 0; j < 10; j++) {
//        if(i<j){
//            System.out.println("*");
//        } else {
//            System.out.println(" ");
//        }
//        
//    }
//    System.out.println("");
//String name[]={"Ram","Shyam","Sita","Gita"};
//String number[]={"23556","54678","98367","03755"};
//char gender[]={'M','M','F','F'};
////        for (int i = 0; i < name.length; i++) {
////            
////        
////        System.out.println("Sending sms to "+name[i]+" in "+(gender[i]=='M'?"his":"her")+" number ("+number[i]+")");
////    }
//        
//    for(String n:name){
//        System.out.println("My name is "+n);

//    }
//int i=0;
//while(i<10){
//    System.out.println(i);
//    i++;
//}
 Person1 p1=new Person1();
// p1.name="Sulav";
// p1.address="Nayabazar";
// p1.age=19;
// p1.completedPlusTwo=true;
// p1.percentage=80.0f;
// p1.qualification="plus two";
//System.out.println(p1.name+p1.percentage+p1.address);    
p1.setName("SULAV GURUNG");
//p1.setAddress("NAYABAZAR");
p1.setAge((byte)19);
p1.setCompletedPlusTwo(true);
//String val=p1.getFullInformation();
//        System.out.println(val);

Person1 p2=new Person1("SURESH", (byte)19, "PASSED PLUS TWO", 80.00f, true);
Address a1=new Address("Nepal", "Kathmandu", 4566, "Nayabazar", "Dhara galli", 218);
Address a2=new Address("Nepal", "Kathmandu", 4566, "Naya", "Dhara", 218);
Address a3=new Address("Nepal", "Kathmandu", 4566, "Bazar", "Galli", 218);
p2.addAddress(a1);
p2.addAddress(a2);
p2.addAddress(a3);
p2.getAllAddress();

Myfile b1=new Myfile("Homework", 2017, 213);
Myfile b2=new Myfile("Classwork", 2016, 64);
Myfile b3=new Myfile("Project", 2017, 712);
p2.addMyfile(b1);
p2.addMyfile(b2);
p2.addMyfile(b3);
p2.getFile();

Rectangle1 r1=new Rectangle1(23, 23); 
        System.out.println("the area of rectangle with length "+r1.getLength()+" and breadth "+r1.getBreadth()+" is "+r1.getArea());
        System.out.println("is it square "+r1.isSquare());
     
        System.out.println(Util.getUserName("sulav"));    
   }
    
            
    
    
}
