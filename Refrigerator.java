public class Refrigerator {

   
     int width;
     int height;
     int capacity;
     String color;
     boolean isDoubleDoor;
     boolean hasFreezer;
     double price;
	 int numberOfRefrigerators;
	 static  String brand;
	 static String companyName;
	 static int maxCapacity; ;

   static{
	    brand="haier";
     companyName = "Cool Appliances";
      maxCapacity = 1000;

   }
    public Refrigerator(int width, int height, int capacity, String color, boolean isDoubleDoor,
                        boolean hasFreezer, double price, int numberOfRefrigerators) {
        this.width = width;
        this.height = height;
        this.capacity = capacity;
        this.color = color;
        this.isDoubleDoor = isDoubleDoor;
        this.hasFreezer = hasFreezer;
        this.price = price;
        this.numberOfRefrigerators = numberOfRefrigerators;

    }

   public static void main(String[] args){
	   Refrigerator obj1=new Refrigerator(5,10,6,"red",true,true,56000,10);
	   System.out.println(obj1.color);
	   
	    Refrigerator obj2=new Refrigerator(6,9,7,"blue",false,true,45000,9);
	   System.out.println(obj2.isDoubleDoor);
	   
	    Refrigerator obj3=new Refrigerator(5,10,6,"violet",true,false,70000,8);
	   System.out.println(obj3.color);
	   
	   
   }
}