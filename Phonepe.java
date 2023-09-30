public class Phonepe
{
int accno;
String name;
long phno;
int recharge;
int checkbalanace;
String notification;
String history;
int code;
String sponsoredlink;
String subscriptions;

Phonepe(int accno,String name,long phno,int recharge,int checkbalanace,String notification,String history,int code,String sponsoredlink,String subscriptions)
{
	this.accno=accno;
	this.name=name;
	this.recharge=recharge;
	this.checkbalanace=checkbalanace;
	this.notification=notification;
	this.history=history;
	this.code=code;
	this.sponsoredlink=sponsoredlink;
	this.subscriptions=subscriptions;
}

public static void main(String[] args){
	Phonepe obj1=new Phonepe(212,"reshma",1234768963l,600,1500,"get up200off","bmtcbus",1234,"dominos","amazonprime");
	System.out.println(obj1.checkbalanace);
	Phonepe obj2=new Phonepe(212,"reshma",1234768963l,600,1500,"get up200off","bmtcbus",1234,"dominos","amazonprime");
	System.out.println(obj2.code);
	Phonepe obj3=new Phonepe(212,"reshma",1234768963l,600,1500,"get up200off","bmtcbus",1234,"dominos","amazonprime");
	System.out.println(obj3.subscriptions);
	
	
}

}