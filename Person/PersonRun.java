public class PersonRun{
	public static void main(String[] args){
		PersonApp pa=new PersonApp();
		String[] skill={"java","python","HTML"};
		String[] skill1={"mysql","css","c"};
		
		Person ps=new Person("sanjana",21,5.3f,45,skill);
		Person ps1=new Person("asha",22,6.4f,40.5f,skill1);
		Person ps2=new Person("ayan",25,5.7f,50,skill);
		Person ps3=new Person("srujana",18,4.9f,38,skill1);
		Person ps4=new Person("champa",45,5.2f,60.20f,skill);
		Person ps5=new Person("pavan",20,6.4f,42,skill1);
		Person ps6=new Person("sonu",21,6.2f,43.2f,skill);
		Person ps7=new Person("soujanya",29,5.6f,67.3f,skill1);
		Person ps8=new Person("sheetal",21,5.7f,40,skill);
		Person ps9=new Person("sahana",19,5.2f,38.45f,skill1);
		pa.savePersonDetails(ps);
		pa.savePersonDetails(ps1);
		pa.savePersonDetails(ps2);
		pa.savePersonDetails(ps3);
		pa.savePersonDetails(ps4);
		pa.savePersonDetails(ps5);
		pa.savePersonDetails(ps6);
		pa.savePersonDetails(ps7);
		pa.savePersonDetails(ps8);	
		pa.savePersonDetails(ps9);	
	}
}