public class Application
{
 int id;
 String name;
 ApplicationType type;
 double version;
 String developer;
 String date;
 
 Application(int id,String name,ApplicationType type,double version,String developer,String date){
	 this.id=id;
	 this.name=name;
	 this.type=type;
	 this.version=version;
	 this.developer=developer;
	 this.date=date;
 }
 void run(){
	 System.out.println("application running");
 }
 void stop(){
	 System.out.println("stop running application");
	
 }
 void execute(){
	 System.out.println("application execute");
	 
 }
 void collectInfo(){
	 System.out.println("application collects the information");
 }
 void displayInfo(){
	 System.out.println("display info");
 }
 
}