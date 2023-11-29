package com.xworkz.examples;

public class Basket {

    String fruit;
     int quantity;
     double price;

     Basket(String fruit,int quantity,double price){
         this.fruit=fruit;
         this.quantity=quantity;
         this.price=price;
         System.out.println("running basket");
     }


    @Override
    public String toString() {
        return "fruitName - " + fruit + "," + "quantity - " + quantity + "," + "price - " + price;
    }


}

