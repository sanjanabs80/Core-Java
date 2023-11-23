public class HandCamera extends Camera{
	double weight;
	
	
		HandCamera(){
			super(brand,pixel,batteryDuration);
			
		}
		HandCamera(double weight){
		this.weight=weight;
		System.out.println("weight of a camera");
		}
	}
	
