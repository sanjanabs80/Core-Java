public class Car{
String modelName;
int speed;
String color;

Car(String modelName,int speed,String color){
	this(modelName,speed);
	this.color=color;
}
Car(String modelName,int speed){
	this(modelName);
	this.speed=speed;
	
}
Car(String modelName){
	this.modelName=modelName;
}
public static void main(String[] args)
{
	Car obj1=new Car("benz",180,"red");
	Car obj2=new Car("BMW",100,"white");
	if(obj1!=null && obj2!=null)
	{
	
	
	System.out.println(obj1.modelName);
	System.out.println(obj2.modelName);
	
	System.out.println(obj1.speed);
	System.out.println(obj2.speed);
		
	System.out.println(obj1.color);
	System.out.println(obj2.color);
	
}
}
}