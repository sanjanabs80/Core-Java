package com.xworkz.object;

import java.util.Objects;

public class Guitar {
	
	int id;
	int price;
	String material;
	
	
	 Guitar(int id,int price,String material){
		this.id=id;
		this.price=price;
		this.material=material;
		System.out.println("running int,short,String in guitar");  				
}
	 @Override
	    public boolean equals(Object obj) {

	        Guitar leftSide=this;
	        if(obj!=null){

	            if(obj instanceof Guitar) {
	                Guitar guitarRightSide=(Guitar) obj;

	                System.out.println("same on both side");

	                if (leftSide.id == guitarRightSide.id && leftSide.price == guitarRightSide.price) {

	                    System.out.println("leftside and guitarrightside is same");
	                    return true;
	                } else {
	                    System.err.println("leftside and guitarrightside is not same");
	                }
	            }
	        }
	        else{
	            System.err.println("null is passed");
	        }

	        return false;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id, price, material);
	    }
	}

