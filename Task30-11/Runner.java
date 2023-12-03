package com.xworkz.object;

public class Runner {

	public static void main(String[] args) {
		System.out.println("starting main in runner");
		Guitar guitar=new Guitar(1,100,"wood");
		Guitar guitar1=new Guitar(2,200,"wood");
		boolean same=guitar.equals(guitar1);
        System.out.println("guitar.equals(guitar1):"+same);


        wifiDongle wifiDongle=new wifiDongle("jio","145",27);
        wifiDongle wifiDongle1=new wifiDongle("Airtel","150",27);
        boolean same1=wifiDongle.equals(wifiDongle1);
        System.out.println("wifiDongle.equals(wifiDongle1):"+same1);
        
        Usbhub usbHub=new Usbhub(3,5,0);
        Usbhub usbHub1=new Usbhub(5,4,0);
        boolean same2=usbHub.equals(usbHub1);
        System.out.println("usbhub.equals(usbhub1):"+same2);

        System.out.println("Ending main in Runner");

		
		
		
	}
}
