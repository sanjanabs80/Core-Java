public class Door {
     String color;
     int height;
     int width;
     boolean isOpen;
	 boolean hasHandle;
     int numberOfDoors;
	 int numberOfLockers;
	 static String material="wooden";
     static String defaultColor = "White";
     static boolean isLocked = false;

    Door(String color,int height,int width,boolean isOpen,boolean hasHandle,int numberOfDoors,int numberOfLockers)
	{
		this.color=color;
		this.height=height;
		this.width=width;
		this.isOpen=isOpen;
		this.hasHandle=hasHandle;
		this.numberOfDoors=numberOfDoors;
		this.numberOfLockers=numberOfLockers;
		
	}
	public static void main(String[] args)
	{
		Door door=new Door("brown",6,7,true,true,2,3);
		System.out.println(door.color);
		
		Door door1=new Door("white",4,8,false,true,3,4);
		System.out.println(door1.isOpen);
		
		Door door2=new Door("black",5,2,true,false,6,6);
		System.out.println(door2.numberOfDoors);
		
	}
}