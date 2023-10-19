public class ComputerStarter{
public static void main(String[] args){
	Computer compt=new Computer(50,16,"enter",true,1,Seasons.WINTER);

	System.out.println(compt.keyBoard);
	System.out.println(compt.displaySize);
	System.out.println(compt.date);
	System.out.println(compt.system);
	System.out.println(compt.numberOfWires);
	System.out.println(compt.season);
	compt.printValuesOfArray();
	compt.getComputerName();
	
	
	
	
			
	 

	}

}



