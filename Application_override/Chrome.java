public class Chrome extends Browser{
	
	
	Chrome(String[] downloads,String[] browsingHistorySites,int size,String compatiblewith,Os os,int id,String name,ApplicationType type,
	double version,String developer,String date){
		super(downloads,browsingHistorySites,size,compatiblewith,os,id,name,type,version,developer,date);
	}
	@override
	
	 void run(){
	 System.out.println("application running in chrome");
 }
 @override
 void stop(){
	 System.out.println("stop running application in chrome");
	
 }
 @override
 void execute(){
	 System.out.println("application execute in chrome");
	 
 }
 @override 
 void consumeMemory(){
		System.out.println("application consumeMemory in chrome");
	
	}
	@override
	void connectInternet(){
		System.out.println("application consumeInternet in chrome");
	}
	@override
 void collectInfo(){
	 System.out.println("application collects the information");
 }
 @override
 void displayInfo(){
	 System.out.println("display info");
	 
 } 
 @override
	  
	 void sendUsage(){
		 System.out.println("send usage in chrome");
	 }

	 @override
void settings(){
		System.out.println("application settings");
		
	}
	@override
	void displayHistory(){
		System.out.println("display history in chrome");
	}
	


}