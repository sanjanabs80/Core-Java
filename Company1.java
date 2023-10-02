public class Company1{
String companyname;
String location;
int numberofstaffs;
String employeename;
int empid;
String designation;
long salary;
String qualification;
long phoneno;
String skills;

Company1(String companyname,String location,int numberofstaffs,String employeename,int empid,String designation,long salary,String qualification,long phoneno,String skills)
{
	this.companyname=companyname;
	this.location=location;
	this.numberofstaffs=numberofstaffs;
	this.employeename=employeename;
	this.empid=empid;
	this.designation=designation;
	this.salary=salary;
	this.qualification=qualification;
	this.phoneno=phoneno;
	this.skills=skills;
}
public static void main(String[] args){
	Company1 cmp=null;
		if(cmp!=null)
		{
	//Company1 cmp=new Company1("TCS","banglore",200,"asha",101,"developer",25000,"BE",876235672,"java");
	//System.out.println(cmp.companyname);
	Company1 cmp1=new Company1("TCS","banglore",200,"asha",101,"developer",25000,"BE",876235672,"java");
	System.out.println(cmp1.location);
	Company1 cmp2=new Company1("TCS","banglore",200,"asha",101,"developer",25000,"BE",876235672,"java");
	System.out.println(cmp2.salary);
	}
		else
		{
			System.out.println("null");
		}
	
	
	
}



}