public class Test
{
public static void main(String[] args)
{
eat();
work();
 int returnint=marks();
  System.out.println(returnint);
  short returnshort=sub();
  System.out.println(returnshort);
  boolean returnboolean=example();
  System.out.println(returnboolean);
  char returnchar=alpha();
  System.out.println(returnchar);
  float returnfloat=decimal();
  System.out.println(returnfloat);
  long returnlong=num();
  System.out.println(returnlong);
  byte returnbyte=index();
  System.out.println(returnbyte);
  double returndouble=deci();
  System.out.println(returndouble);
}
 static void  eat()
 {
 System.out.println("dog is eating");
 }

	 static void work()
	 {
		 System.out.println("laptop is working properly");
	 }
 
 
 
 static int marks()
 {
	 int a=10;
	 int b=20;
	 int c=a+b;
	 return c;
	
	 
 }
 static short sub()
 {
	 short a=157;
	 
	 
	 return a;
	 
 }

 static  boolean  example()
 {
	 boolean a=true;
	 return true;
 }
  static char alpha()
  {
  char e='A';
  return e;
  
  }  
  
  static float decimal()
  {
	  float value=5.6f;
	  return value;
  }

  static long num()
  {
	  long no=12000;
	  return no;
  }
static byte index()
{
	byte i=9;
	return i;
}
static double deci()
{
	double d=18.567;
	return d;
}
}
 