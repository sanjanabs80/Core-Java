package com.xworkz.examples;

public class Heart {
    int heartRate;
     String size;
     boolean isHealthy;

     Heart(int heartRate,String size,boolean isHealthy){
         this.heartRate=heartRate;
         this.size=size;
         this.isHealthy=isHealthy;
         System.out.println("running  heart");
     }
     @Override
     public String toString()
     {
         return "heartrate:-"+heartRate+","+"size:-"+size+","+"ishealthy:-"+isHealthy;
     }

     }


