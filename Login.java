public class Login{
	Login(String username,int password){
		System.out.println("username:"+username+" "+"password:"+password);
	}
	Login(String email)
	{
		System.out.println("email:"+email);
	}
	public static void main(String[] args){
		new Login("sanjana",123);
	}
}
