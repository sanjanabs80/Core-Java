package com.xworkz.examples;

public class Geyser {

    String brand;
     double capacityInLiters;
     boolean hasAutoShutOff;

     Geyser(String brand,double capacityInLiters,boolean hasAutoShutOff){
         this.brand=brand;
         this.capacityInLiters=capacityInLiters;
         this.hasAutoShutOff=hasAutoShutOff;
         System.out.println("running geyser");
     }
     @Override
     public String toString(){
         return "brand:-"+brand+","+"capacityinlitre:-"+capacityInLiters+","+"hasautoshutoff:-"+hasAutoShutOff;
     }
}
