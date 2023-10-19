public class Computer{
	int displaySize;
	int date;
	String keyBoard;
	boolean system;
	int numberOfWires;
	Seasons season;
	static int camera;
	static int volume;
	static int brightness;
	static int battery;
	static int wifiConnection;
	byte[] num={4,5,6,7};
	String computerName="hp";
	


	static{
	   camera=1;
	  volume=100;
	   brightness=100;
	   battery=100;
  wifiConnection=1;

	}

Computer(int displaySize,int date,String keyBoard,boolean system,int numberOfWires,Seasons season)
{
	this(displaySize,date,keyBoard,system,numberOfWires);
	this.season=season;
}

Computer(int displaySize,int date,String keyBoard,boolean system,int numberOfWires){
	this(displaySize,date,keyBoard,system);
	this.numberOfWires=numberOfWires;
	
}
Computer(int displaySize,int date,String keyBoard,boolean system){
	this(displaySize,date,keyBoard);
	this.system=system;
}
Computer(int displaySize,int date,String keyBoard){
	this(displaySize,date);
	this.keyBoard=keyBoard;
}

Computer(int displaySize,int date){
	this(displaySize);
	this.date=date;
	
}
Computer(int displaySize)
{
	this.displaySize=displaySize;
}

void printAllMethod(){
	System.out.println(displaySize);
	System.out.println(date);
	System.out.println(keyBoard);
	System.out.println(system);
	System.out.println(numberOfWires);
	System.out.println(season);
	System.out.println(camera);
	System.out.println(volume);
	System.out.println(brightness);
	System.out.println(battery);
	System.out.println(wifiConnection);
}
void printValuesOfArray(){
	for(int a=0;a<num.length;a++)
		System.out.println(num[a]);
}

String getComputerName(){
	return computerName;
}
}

	


