package com.xworkz.examples;

public class Bowl {

    String material;
    String color;
     int size;

     Bowl(String material,String color,int size){
         this.material=material;
         this.color=color;
         this.size=size;
         System.out.println("running bowl");

     }
     @Override
     public String toString(){
         return  "materialName:-"+material+","+"color:-"+color+","+"size:-"+size;
     }

}
