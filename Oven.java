public class Oven {
     int temperature;
     boolean isOn;
     int timer;
     boolean isPreheated;
     String color;
     int numberOfButtons;
	 int numberOfWires;
	  static String mode;
	   static int maxTemperature;
		    static String manufacturer;
	 
	 static{
     mode="bake";
     maxTemperature = 300;
     manufacturer = "LG";
	 }
	 Oven(int temperature,boolean isOn,int timer,boolean isPreheated,String color,int numberOfButtons,int numberOfWires){
		 this.temperature=temperature;
		 this.isOn=isOn;
		 this.timer=timer;
		 this.isPreheated=isPreheated;
		 this.color=color;
		 this.numberOfButtons=numberOfButtons;
		 this.numberOfWires=numberOfWires;
		 	 }

    public static void main(String[] args){
		Oven oven = new Oven(102,true,10,true,"black",5,1);
		System.out.println(oven.temperature);
		
		Oven oven1 = new Oven(98,false,8,true,"blue",6,2);
		System.out.println(oven1.isPreheated);
		
		
		Oven oven2 = new Oven(85,true,6,false,"black",7,4);
		System.out.println(oven2.numberOfButtons);
	}
}
	