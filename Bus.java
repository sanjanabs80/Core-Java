public class Bus{
	int busNo;
	String color;
	int numberofSeats;
	String busType;
	
	Bus(int busNo,String color,int numberofSeats,String busType){
		this(busNo,color,numberofSeats);
		this.busType=busType;
	}
	Bus(int busNo,String color,int numberofSeats){
		this(busNo,color);
		this.numberofSeats=numberofSeats;
	}
	Bus(int busNo,String color){
		this(busNo);
		this.color=color;
	}
	Bus(int busNo){
		this.busNo=busNo;
	}
	public static void main(String[] args)
	{
		Bus bus=new Bus(500,"red",45,"bmtc");
		Bus bus1=new Bus(25,"blue",30,"volvo");
		if(bus!=null && bus1!=null){
		
		System.out.println(bus.color);
		System.out.println(bus1.busType);
		
		
		Bus bus2=new Bus(25,"blue",30,"volvo");
		System.out.println(bus.numberofSeats);
	    System.out.println(bus1.color);
		

	
	}
	}
	
}

