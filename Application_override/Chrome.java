public class Chrome extends Browser{
	
	
	Chrome(String[] downloads,String[] browsingHistorySites,int size,String compatiblewith,Os os,int id,String name,ApplicationType type,
	double version,String developer,String date){
		super(downloads,browsingHistorySites,size,compatiblewith,os,id,name,type,version,developer,date);
	}
	
	 void run(){
	 System.out.println("application running in chrome");
 }
 void stop(){
	 System.out.println("stop running application in chrome");
	
 }
 void execute(){
	 System.out.println("application execute in chrome");
	 
 }
 
 void consumeMemory(){
		System.out.println("application consumeMemory in chrome");
	
	}
	void connectInternet(){
		System.out.println("application consumeInternet in chrome");
	}
 void collectInfo(){
	 System.out.println("application collects the information");
 }
 void displayInfo(){
	 System.out.println("display info");
	 
 } 
	  
	 void sendUsage(){
		 System.out.println("send usage in chrome");
	 }

void settings(){
		System.out.println("application settings");
		
	}
	
	void displayHistory(){
		System.out.println("display history in chrome");
	}
	


}