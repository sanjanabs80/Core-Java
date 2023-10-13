public class Sample{
	TrafficSignal trafficSignal;
	WeekDays weekdays;
	Vowels vowels;
	Semester sem;
	Shape shape;


Sample(TrafficSignal trafficSignal,WeekDays weekdays,Vowels vowels,Semester sem,Shape shape){
	this.trafficSignal=trafficSignal;
	this.weekdays=weekdays;
	this.vowels=vowels;
	this.sem=sem;
	this.shape=shape;
}

void display(){
	System.out.println(trafficSignal);
	System.out.println(weekdays);
	System.out.println(vowels);
	System.out.println(sem);
	System.out.println(shape);
}
}