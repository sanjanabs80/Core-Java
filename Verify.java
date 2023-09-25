public class Verify
{
	static void traffic(String signal)
	{
		if( signal == "red")
		{
			System.out.println("stop");
		}
		else if(signal=="green")
		{
			System.out.println("you can go");
		}
	
		
		}

	

	
	static void number(int a)
	{
		
		{
		if(a==5)
		{
			System.out.println("Your number is equal to 5");
		}
			else if(a<=5)
			{
				System.out.println("Your number is not equal to 5");
			}
		}
	}
	
	
	
	static void tax(int n)
	{
		
		{
		if(n>=10000)
		{
			System.out.println("10% of gst will be added to your bill");
		}
			else if(n<=5000)
			{
				System.out.println("no gst is added to your bill");
			}
		}
	}
	
	
	
		static void shopping(long l)
	{
		
		{
		if(l>=1000)
		{
			System.out.println("105 search results");
		}
			else if(l<=500)
			{
				System.out.println("50 search results");
			}
		}
	}
	
	
	
	static void age(int c)
	{
		
		{
		if(c>=22)
		{
			System.out.println("graduation is completed");
		}
			else if(c<=20)
			{
				System.out.println("still pursuing garduation");
			}
		}
	}

public static void main(String[] args)
{
	traffic("red");
	number(4);
	tax(11000);
	shopping(400);
	age(19);
}
	}

	

	