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
public class manager extends person {
    private String boardPosition;
    private int shares;

    public manager(String boardPosition, int shares) {
        this.boardPosition = boardPosition;
        this.shares = shares;
    }
    
    public manager(String name, int age, String address, String qualification, String gender,String boardPosition,int shares){
        super(name,age,address,qualification,gender);
        this.boardPosition=boardPosition;
        this.shares=shares;
        
    
    }
    
    

    public String getBoardPosition() {
        return boardPosition;
    }

    public void setBoardPosition(String boardPosition) {
        this.boardPosition = boardPosition;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }
    public void getFullInformation(){
        super.getFullInformation();
        System.out.println("Board position: "+getBoardPosition()+"\n");
        System.out.println("Shares: "+getShares()+"\n");
    
    }
    
    
    
    
}
