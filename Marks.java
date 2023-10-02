public class Marks{
int sub1java;
int sub2web;
int sub3python;
int sub4unix;
 
 Marks(){
System.out.println("no parameter");
}

Marks(int sub1java){
	this();
System.out.println("single parameter");
}

Marks(int sub1java,int sub2web){
	this(98);
System.out.println("two parameter");
}

Marks(int sub1java,int sub2web,int sub3python){
	this(sub1java,78);
System.out.println("three parameter");
}

Marks(int sub1java,int sub2web, int sub3python,int sub4unix){
	this(sub1java,sub2web,59);
	System.out.println("four parameter");
	
}
public static void main(String[] args)
{
	new Marks(97,82,78,80);
	
}
}