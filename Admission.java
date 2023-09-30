public class Admission{
	String name;
	int regno;
	long pincode;
	String emailid;
	int passingyear;
	String course;
	String gender;
	String address;
	String fathername;
	String mothername;	
	
	
Admission(String name,int regno,long pincode,String emailid,int passingyear,String course,String gender,String address,String fathername,String mothername)
{	

this.name=name;
this.regno=regno;
this.pincode=pincode;
this.emailid=emailid;
this.passingyear=passingyear;
this.course=course;
this.gender=gender;
this.address=address;
this.fathername=fathername;
this.mothername=mothername;
}

public static void main(String[] args)
{
	Admission obj1=new Admission("sahana",101,577201,"sahana@gmail.com",2022,"BCA","female","Shimoga","gopal","savitha");
	System.out.println(obj1.name);
	Admission obj2=new Admission("sahana",101,577201,"sahana@gmail.com",2022,"BCA","female","Shimoga","gopal","savitha");
	System.out.println(obj1.course);
	Admission obj3=new Admission("sahana",101,577201,"sahana@gmail.com",2022,"BCA","female","Shimoga","gopal","savitha");
	System.out.println(obj1.address);
	
	
}
}

