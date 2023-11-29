package com.xworkz.examples;

public class Mic {
    String brand;
     String model;
    double frequency;

    Mic(String brand,String model,double frequency){
        this.brand=brand;
        this.model=model;
        this.frequency=frequency;
        System.out.println("running mic");
    }
    @Override
    public String toString(){
        return "brand:-"+brand+","+"model:-"+brand+","+"frequency:-"+frequency;
    }
}
