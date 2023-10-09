public class WashingMachine {

    
     int numberOfWashingMachines;
     String manufacturer;
     int capacity;
     boolean isAutomatic;
     int washPrograms;
    boolean isOn;
	static String brand;
	static String model;
	static double warrantyPeriod;
	
    static{
	 brand="whirlpool";
 model="samsung";
  warrantyPeriod = 2.5;
	}
   
    public WashingMachine(int numberOfWashingMachines, String manufacturer, int capacity, boolean isAutomatic, int washPrograms, boolean isOn) {
        this.numberOfWashingMachines = numberOfWashingMachines;
        this.manufacturer = manufacturer;
        this.capacity = capacity;
        this.isAutomatic = isAutomatic;
        this.washPrograms = washPrograms;
        this.isOn = isOn;
      
    }

    public static void main(String[] args){
		WashingMachine obj1=new WashingMachine(10,"harsha",6,true,8,false);
		System.out.println(obj1.isAutomatic);
		
		WashingMachine obj2=new WashingMachine(9,"pai",7,false,9,true);
		System.out.println(obj2.capacity);
		
		WashingMachine obj3=new WashingMachine(7,"adi",9,true,9,false);
		System.out.println(obj3.washPrograms);
		
		
	}
    }
