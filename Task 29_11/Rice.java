package com.xworkz.examples;

public class Rice {
    String type;
     double quantity;
     double pricePerKg;

     Rice(String type,double quantity,double pricePerKg){
         this.type=type;
         this.quantity=quantity;
         this.pricePerKg=pricePerKg;
         System.out.println("running rice");
     }
     @Override
    public String toString(){
         return "type:-"+type+","+"quantity:-"+quantity+","+"price:-"+pricePerKg;
     }

}
