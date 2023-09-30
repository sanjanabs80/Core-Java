public class Metro
{
String greenline;
String purpleline;
String fromaddress;
String toaddress;
int timing;
int amount;
int voltage;
String platformno;
String waittime;
String logouttime;

Metro(String greenline,String purpleline,String fromaddress,String toaddress,int timing,int amount,int voltage,String platformno,String waittime,String logouttime)
{
this.greenline=greenline;
this.purpleline=purpleline;
this.fromaddress=fromaddress;
this.toaddress=toaddress;
this.timing=timing;
this.amount=amount;
this.voltage=voltage;
this.platformno=platformno;
this.waittime=waittime;
this.logouttime=logouttime;
}
public static void main(String[] args)
{
	Metro metro1=new Metro("nagasandra","mgroad","banashankari","mantri square feet",10,45,650,"2","5mins","30mins");
	System.out.println(metro1.fromaddress);
	
	Metro metro2=new Metro("nagasandra","mgroad","banashankari","mantri square feet",10,45,650,"2","5mins","30mins");
	System.out.println(metro2.toaddress);
	Metro metro3=new Metro("nagasandra","mgroad","banashankari","mantri square feet",10,45,650,"2","5mins","30mins");
	System.out.println(metro3.platformno);
	
	
}
}