public class Plastic {
    // Instance variables
     int length;
     int width;
     int thickness;
     String color;
     boolean isRecyclable;
     float meltingPoint;
     boolean isTransparent;
 
	 
	 
     static int totalPlasticsProduced;
     static String materialType = "Polymer";
     static double recyclingPercentage = 85.5;
	 
	 
    // Constructor
    public Plastic(int length, int width, int thickness, String color,boolean isRecyclable,
                   long productionDate, float meltingPoint, boolean isTransparent) {
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.color = color;
        this.isRecyclable = isRecyclable;
        this.meltingPoint = meltingPoint;
        this.isTransparent = isTransparent;

				   }     

   public static void main(String[] args){
	   
   
    Plastic obj1 = new Plastic(8,5,3,"white",true, 10,10.5f,false);
	 System.out.println(obj1.color);
	 
	 Plastic obj2 = new Plastic(9,6,2,"blue",false,5,8.5f,true);
	 System.out.println(obj2.thickness);
	 
	 
	 Plastic obj3 = new Plastic(7,2,7,"black",true,6,5.5f,false);
	 System.out.println(obj3.length);
   }
}			   

	 
	 
	 
	 