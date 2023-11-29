package com.xworkz.examples;

public class Chain {
    String material;
     int lengthInInches;
     boolean isGold;
     
     Chain(String material,int lengthInInches,boolean isGold){
         this.material=material;
         this.lengthInInches=lengthInInches;
         this.isGold=isGold;
         System.out.println("running chain");

     }
     @Override
    public String toString(){
         return "material:-"+material+","+"lengthInInches:-"+lengthInInches+","+"isGold:-"+isGold;
     }

}
