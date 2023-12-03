package com.xworkz.object;

public class wifiDongle {
	String brand;
	String transferRate;
	int itemWeight;
	
	wifiDongle(String brand,String transferRate,int itemWeight){
		this.brand=brand;
		this.transferRate=transferRate;
		this.itemWeight=itemWeight;
			
	}
	 @Override
	    public boolean equals(Object obj) {

	        wifiDongle wifiLeftSide=this;
	        if(obj!=null){

	            if(obj instanceof wifiDongle) {
	                wifiDongle wifiRightSide=(wifiDongle) obj;

	                System.out.println("same on both side");

	                if (wifiLeftSide.transferRate == wifiRightSide.transferRate && wifiLeftSide.itemWeight == wifiRightSide.itemWeight) {

	                    System.out.println("wifileftside and wifirightside is same");
	                    return true;
	                } else {
	                    System.err.println("wifileftside and wifirightside is not same");
	                }
	            }
	        }
	        else{
	            System.err.println("null is passed");
	        }

	        return false;
	    }

	}



