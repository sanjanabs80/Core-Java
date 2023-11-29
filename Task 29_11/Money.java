package com.xworkz.examples;

public class Money {
    String currency;
     double amount;
     String description;

     Money(String currency,double amount,String description){
         this.currency=currency;
         this.amount=amount;
         this.description=description;
         System.out.println("running money");
     }
     @Override
    public String toString(){
         return "currency:-"+currency+","+"amount:-"+amount+","+"description:-"+description;
     }
}
