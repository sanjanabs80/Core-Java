package com.xworkz.examples;

public class Spoon {
    String material;
    int sizeInInches;
    String color;


    public Spoon(String material, int sizeInInches, String color) {
        this.material = material;
        this.sizeInInches = sizeInInches;
        this.color = color;
        System.out.println("running spoon");
    }
    @Override
    public String toString(){
        return "material:-"+material+","+"size:-"+sizeInInches+","+"color:-"+color;
    }
}
