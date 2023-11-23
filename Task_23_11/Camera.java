public class Camera{
	String brand;
	Color color;
	String pixel;
	String batteryDuration;
	
	
	Camera(){
		System.out.println("Camera no arg const");
		
	}
	Camera(String brand,String pixel,String batteryDuration){
		this.brand=brand;
		this.pixel=pixel;
		this.batteryDuration=batteryDuration;
	}

}