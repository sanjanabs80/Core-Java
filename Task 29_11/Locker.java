package com.xworkz.examples;

public class Locker {
    int lockerNumber;
     String lockerCode;
     boolean isLocked;

     Locker(int lockerNumber,String lockerCode,boolean isLocked){
         this.lockerNumber=lockerNumber;
         this.lockerCode=lockerCode;
         this.isLocked=isLocked;
         System.out.println("running locker");
     }
     @Override
    public String toString(){
         return "lockno:-"+lockerNumber+","+"lockcode:-"+lockerCode+","+"islock:-"+isLocked;
     }
}
