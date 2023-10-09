public class Cupboard {
	
     int numberOfShelves;  
     String color;
     double height;
    double width;
     boolean isLocked;
    boolean hasDrawers;
     int numberOfDoors;
	   static String material;
	     static String company;
		      static String manufacturer;
    static{
      material="plywood";
   company = "FurnitureCo";
     manufacturer = "carpenter";
	}
    
    public Cupboard(int numberOfShelves, String color, double height, double width,
                    boolean isLocked, boolean hasDrawers, int numberOfDoors ) {
        this.numberOfShelves = numberOfShelves;
        this.color = color;
        this.height = height;
        this.width = width;
        this.isLocked = isLocked;
        this.hasDrawers = hasDrawers;
        this.numberOfDoors = numberOfDoors;
       

       
    }

    public static void main(String[] args){
		Cupboard obj1=new Cupboard(3,"brown",10,5,true,false,2);
		System.out.println(obj1.numberOfDoors);
		
		
		Cupboard obj2=new Cupboard(4,"white",7,6,false,true,4);
		System.out.println(obj2.color);
		
		
		Cupboard obj3=new Cupboard(5,"red",6,3,true,false,10);
		System.out.println(obj3.isLocked);
	}
}

		
		
		
		
		
		
		
	