<<<<<<< HEAD
public class CameraRunner{
	public static void main(String[] args){
		
		Camera cam=new Camera();
	
		
		Camera camera=new Camera("sony","10x","1hr");
		System.out.println(camera.brand);
		System.out.println(camera.pixel);
		System.out.println(camera.batteryDuration);
		
		
		DigitalCamera dc=new DigitalCamera();
		System.out.println(dc.pixel);
		
		HandCamera hc=new HandCamera(5d);
		System.out.println(hc.weight);
	}
=======
public class CameraRunner{
	public static void main(String[] args){
		
		Camera cam=new Camera();
	
		
		Camera camera=new Camera("sony","10x","1hr");
		System.out.println(camera.brand);
		System.out.println(camera.pixel);
		System.out.println(camera.batteryDuration);
		
		
		DigitalCamera dc=new DigitalCamera();
		System.out.println(dc.pixel);
		
		HandCamera hc=new HandCamera(5d);
		System.out.println(hc.weight);
	}
>>>>>>> e0c7387980d7e838e134572a393292ceb5db324b
}