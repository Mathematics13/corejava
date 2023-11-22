package mktclass;

public class Assgn_LogicalOpr {

	public static void main(String[] args)
	{
		int a=6;
		int b=10;
		if(a>5||b==a)
			System.out.println("Good");
		if(a==b&&b==6)
			System.out.println("Its b");
		if(!(a>5||b==a))
			System.out.println("Bad");
		if(!(a==b&&b==6))
			System.out.println("Its a");	
			
	}

}
