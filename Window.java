public class Window {
  
     int width;
     int height;
     String color;
     boolean isOpen;
     double opacity;
     float xPosition;
     float yPosition;
	  int numberOfWindows;
	  static String shape;
	  static String material;
	  static boolean isSoundproof;
    
static{
     shape="rectangle";
   material = "Glass";
 isSoundproof = true;

}
    public Window(int width, int height, String color, boolean isOpen, double opacity,
                   float xPosition, float yPosition,int numberOfWindows ) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.isOpen = isOpen;
        this.opacity = opacity;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
		this.numberOfWindows=numberOfWindows;
				   }
    public static void main(String[] args){
		Window window=new Window(10,6,"blue",true,5,3.5f,5.6f,2);
		System.out.println(window.width);
		
		
		Window window1=new Window(8,5,"white",false,6,4.5f,7.6f,4);
		System.out.println(window1.color);
		
		
		Window window2=new Window(7,3,"white",true,8,9.5f,6.6f,6);
		System.out.println(window2.width);
		
	}
}