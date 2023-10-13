public class Sample1{
public static void main(String[] args){
	Sample obj1=new Sample(TrafficSignal.RED,WeekDays.THURSDAY,Vowels.A,Semester.SIXTH,Shape.CIRCLE);
	
	Sample1.TrafficSignal(obj1);
	Sample1.WeekDays(obj1);
	Sample1.Vowels(obj1);
	Sample1.Semester(obj1);
	Sample1.Shape(obj1);

}	

public static void TrafficSignal(Sample obj1){

	if(obj1.trafficSignal.value=="stop"){
		System.out.println("signal is Red");
	}
	else
	{
		System.out.println("signal is not red");
	}
	}



public static void WeekDays(Sample obj1){
	

	if(obj1.weekdays.value==4){
		System.out.println("thursday is four");
	}
	else
	{
		System.out.println("thursday is not four");
	}
	}





public static void Vowels(Sample obj1){
	if(obj1.vowels.character=='a'){
		System.out.println("it returns A");
	}
	else
	{
		System.out.println("it not return A");
	}
	}

public static void Semester(Sample obj1){
	
	if(obj1.sem.num==6){
		System.out.println("sixth semester ");
	}
	else
	{
		System.out.println("not a sixth semester");
	}
	}


public static void Shape(Sample obj1){
	
	if(obj1.shape.number==1.5f){
		System.out.println("shape is circle" );
	}
	else
	{
		System.out.println("shape is not circle");
	}
	}
}



