package com.xworkz.examples;

public class Cotton  {
    String color;
    double length;
    boolean organic;

     Cotton(String color, double length, boolean organic) {
        this.color = color;
        this.length = length;
        this.organic = organic;
        System.out.println("running string,double,boolean in cotton");

    }
    @Override
    public String toString(){
         return "color:-"+color+","+"length:-"+length+","+"organic:-"+organic;
    }
}
