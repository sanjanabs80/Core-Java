package com.xworkz.object;


	public class Usbhub {

	    int totalPorts;

	    double transferRate;

	    int batteryRequired;

	        public Usbhub(int totalPorts,double transferRate,int batteryRequired){
	            this.totalPorts=totalPorts;
	            this.transferRate=transferRate;
	            this.batteryRequired=batteryRequired;
	            System.out.println("Created id,double,int arg const in UsbHub");
	        }

	        @Override
	        public boolean equals(Object obj) {

	            Usbhub usbLeftSide=this;
	            if(obj!=null){

	                if(obj instanceof Usbhub) {
	                    Usbhub usbRightSide=(Usbhub) obj;

	                    System.out.println("same on both side");

	                    if (usbLeftSide.totalPorts == usbRightSide.totalPorts && usbLeftSide.transferRate == usbRightSide.transferRate && usbLeftSide.batteryRequired==usbRightSide.batteryRequired) {

	                        System.out.println("usbRightSide and usbLightSide is same");
	                        return true;
	                    } else {
	                        System.err.println("usbRightSide and usbLightSide is not same");
	                    }
	                }
	            }
	            else{
	                System.err.println("null is passed");
	            }

	            return false;
	        }
	}



