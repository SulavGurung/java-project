/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datetimedemo;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Set;

/**
 *
 * @author NCC
 */
public class MainClass3 {
    public static void main(String args[]){
        Set<String> ids=ZoneId.getAvailableZoneIds();
//        System.out.println(ids);
    for(String s:ids){
        
        LocalDateTime d=LocalDateTime.now( ZoneId.of("Iran"));
        System.out.println(s+"\t\t\t\t\t"+d);
    
    }
    }
    
}
