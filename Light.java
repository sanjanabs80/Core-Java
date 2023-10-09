public class Light {
  
     int brightness;
     boolean isOn;
     String color;
     int intensity;
     boolean isDimmable;
	  int totalLights;
      int totalOnLights;
	  static String brand;
	   static String model;
	    static String defaultColor ;
     
     static{
	  brand="creta";
     model="LED";
     defaultColor = "White";
	 }
    
	Light(int brightness,boolean ison,String color,int intensity,boolean isDimmable,int totalLights,int totalOnLights)
	{
		this.brightness=brightness;
		this.isOn=isOn;
		this.color=color;
		this.intensity=intensity;
		this.isDimmable=isDimmable;
		this.totalLights=totalLights;                    
		this.totalOnLights=totalOnLights;
	}
	
	public static void main(String[] args){
		Light obj1=new Light(8,true,"blue",10,false,10,5);
		System.out.println(obj1.brightness);
		
		
		Light obj2=new Light(7,false,"white",8,true,6,2);
		System.out.println(obj2.color);
		
		Light obj3=new Light(4,true,"red",6,false,7,5);
		System.out.println(obj3.totalOnLights);
	}
		
	}