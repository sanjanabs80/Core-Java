public class Triangle{
int side1;
int side2;
int side3;
int sum;

Triangle(){
System.out.println("no parameter");
}
Triangle(int side1){
	this();
System.out.println("single parameter");
}
Triangle(int side1,int side2){
	this(11);

System.out.println("two parameter");
}
Triangle(int side1,int side2,int side3){
	this(side1,20);
System.out.println("three parameter");
}
Triangle(int side1,int side2,int side3, int sum){
	this(side1,side2,5);
	System.out.println("four parameter");
	
}
public static void main(String[] args)
{
	new Triangle(13,23,22,10);
	
}
}