public class Company{
Company(String name)
{
	System.out.println("company name is:"+name);
}
Company()
{
	System.out.println(" no parameter is invoked");
}
 public static void main(String[] args){
	new Company("IBM");
}
}
