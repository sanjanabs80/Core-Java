public class WebApplication extends Application{
    String[] supportBrowsers;
	boolean free;
	
	
	WebApplication(String[] supportBrowsers,boolean free,int id,String name,ApplicationType type,
	double version,String developer,String date){
		super(id,name,type,version,developer,date);
		this.supportBrowsers=supportBrowsers;
		this.free=free;
	}
     void connectInternet(){
		 System.out.println("connecttInternet");
	 }
	 void sendUsage(){
		 System.out.println("send usage");
	 }

}