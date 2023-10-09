public class Mobile {
   
     String model;
	 float timeDisplay;   
     String color;
     boolean isSmartphone;
     float price;
     int totalMobilesSold;
	 int currency;
    static String company = "samsung Mobiles";
     static int screenSize=100;;    
	static String privacy;

    
    public Mobile(String model,float timeDisplay,String color,boolean isSmartphone,float price,int totalMobilesSold,int currency)
	{
		this.model=model;
	this.timeDisplay=timeDisplay;
	this.color=color;
	this.isSmartphone=isSmartphone;
	this.price=price;
	this.totalMobilesSold=totalMobilesSold;
	this.currency=currency;
}
public static void main(String[] args){
	Mobile mobile=new Mobile("A30",5.03f,"blue",true,18000f,20,650);
	System.out.println(mobile.timeDisplay);
	
	

	Mobile mobile1=new Mobile("A20",6.03f,"black",false,15000f,5,550);
	System.out.println(mobile1.model);

	Mobile mobile2=new Mobile("A21s",8.5f,"white",true,20000f,25,1000);
	System.out.println(mobile2.price);
       
}
}    