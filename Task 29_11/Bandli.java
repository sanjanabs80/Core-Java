package com.xworkz.examples;

public class Bandli {

    int size;
    String type;

    String color;

    Bandli(int size,String type,String color){
        this.size=size;
        this.type=type;
        this.color=color;
    }
    @Override
    public String toString(){
        return "size:-"+size+","+"type:-"+type+","+"color:-"+color;
    }
}
