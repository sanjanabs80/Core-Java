<<<<<<< HEAD
public class Project{
	
	void validate(Person person){
		System.out.println("starting");
		if(person!=null){
			person.eat();
			person.sleep();
			System.out.println(person);
			
			if(person instanceof Developer){
				
				Developer developer = (Developer) person;
				developer.code();
				System.out.println(developer);
				
				if(developer!=null){
				
				  if(developer instanceof Tester){
					Tester tester = (Tester) developer;
					tester.qualityCheck();
					System.out.println(tester);
				  }
				
				  if(developer instanceof DataBaseDeveloper){
					DataBaseDeveloper database = (DataBaseDeveloper) developer;
					database.runScripts();
					System.out.println(database);
				  }
				}
			}
			
			
				if(person instanceof BusinessAnalyst){
					
					BusinessAnalyst business = (BusinessAnalyst) person;
					business.checkRequirement();
					System.out.println(business);
				}
				
				if(person instanceof ProductOwner){
					
					ProductOwner product = (ProductOwner) person;
					product.validate();
					System.out.println(product);
				}
				
				if(person instanceof Devops){
					
					Devops devops = (Devops) person;
					devops.runBuild();
					System.out.println(devops);
		        }
						
		}
	}
=======
public class Project{
	
	void validate(Person person){
		System.out.println("starting");
		if(person!=null){
			person.eat();
			person.sleep();
			System.out.println(person);
			
			if(person instanceof Developer){
				
				Developer developer = (Developer) person;
				developer.code();
				System.out.println(developer);
				
				if(developer!=null){
				
				  if(developer instanceof Tester){
					Tester tester = (Tester) developer;
					tester.qualityCheck();
					System.out.println(tester);
				  }
				
				  if(developer instanceof DataBaseDeveloper){
					DataBaseDeveloper database = (DataBaseDeveloper) developer;
					database.runScripts();
					System.out.println(database);
				  }
				}
			}
			
			
				if(person instanceof BusinessAnalyst){
					
					BusinessAnalyst business = (BusinessAnalyst) person;
					business.checkRequirement();
					System.out.println(business);
				}
				
				if(person instanceof ProductOwner){
					
					ProductOwner product = (ProductOwner) person;
					product.validate();
					System.out.println(product);
				}
				
				if(person instanceof Devops){
					
					Devops devops = (Devops) person;
					devops.runBuild();
					System.out.println(devops);
		        }
						
		}
	}
>>>>>>> e0c7387980d7e838e134572a393292ceb5db324b
}