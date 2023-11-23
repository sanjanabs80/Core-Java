<<<<<<< HEAD
 public class ProjectRunner{
	
	public static void main(String... values){
		
		Person person = new Person();
		
		Developer developer = new Developer();
		
		Tester tester = new Tester();
		
		BusinessAnalyst businessAnalyst = new BusinessAnalyst();
		
		ProductOwner productowner = new ProductOwner();
		
		DataBaseDeveloper database = new DataBaseDeveloper();
		
		Devops devops = new Devops();
		
		System.out.println("--------------------------------------------");
		
		Project project = new Project();
		project.validate(person);
		project.validate(developer);
		project.validate(tester);
		project.validate(businessAnalyst);
		project.validate(productowner);
		project.validate(database);
		project.validate(devops);
	}
=======
 public class ProjectRunner{
	
	public static void main(String... values){
		
		Person person = new Person();
		
		Developer developer = new Developer();
		
		Tester tester = new Tester();
		
		BusinessAnalyst businessAnalyst = new BusinessAnalyst();
		
		ProductOwner productowner = new ProductOwner();
		
		DataBaseDeveloper database = new DataBaseDeveloper();
		
		Devops devops = new Devops();
		
		System.out.println("--------------------------------------------");
		
		Project project = new Project();
		project.validate(person);
		project.validate(developer);
		project.validate(tester);
		project.validate(businessAnalyst);
		project.validate(productowner);
		project.validate(database);
		project.validate(devops);
	}
>>>>>>> e0c7387980d7e838e134572a393292ceb5db324b
}