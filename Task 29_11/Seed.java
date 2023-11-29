package com.xworkz.examples;

public class Seed {
    String name;
     String type;
     double weight;

     Seed(String name,String type,double weight){
         this.name=name;
         this.type=type;
         this.weight=weight;
         System.out.println("running seed");
     }
     @Override
    public String toString(){
         return "name:-"+name+","+"type:-"+type+","+"weight:-"+weight;
     }
}
