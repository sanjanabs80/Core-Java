public class PersonApp{
	Person[] arr=new Person[10];
	boolean savePersonDetails(Person array){
		for(int index=0;index<10;index++){
			if(arr[index]==null){
				arr[index]=array;
				System.out.println("successfully saved");
				return true;
			}
			else{
				System.out.println("index is not empty,go to next index");
			}
		}
		return false;
		
	}
	
}