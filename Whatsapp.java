public class Whatsapp
{
	String name;
	String about;
	long phno;
	int numberofgroup;
	String linkeddevices;
	String settings;
	int password;
	String notification;
	String storage;
	String langauage;
	
	Whatsapp(String name,String about,long phno,int numberofgroup,String linkeddevices,String settings,int password,String notification,String storage,String langauage)
	{
		this.name=name;
		this.about=about;
		this.numberofgroup=numberofgroup;
		this.linkeddevices=linkeddevices;
		this.settings=settings;
		this.password=password;
		this.notification=notification;
		this.storage=storage;
		this.langauage=langauage;
	}
	
	public static void main(String[] args)
	{
		Whatsapp obj1=new Whatsapp("sita","....",8272635491L,8,"windows","privacy",2524,"check msg","8GB","english");
		System.out.println(obj1.name);
		
		Whatsapp obj2=new Whatsapp("sita","....",8272635491L,8,"windows","privacy",2524,"check msg","8GB","english");
		System.out.println(obj2.about);
		Whatsapp obj3=new Whatsapp("sita","....",8272635491L,8,"windows","privacy",2524,"check msg","8GB","english");
		System.out.println(obj3.linkeddevices);
		
	}	
		
	}