package mktclass;

public class LogicalOperators {

	public static void main(String[] args) 
	{
		int a=6;
		int b=10;
		if(a>5 || b==a)
			System.out.println("Control is in first if block");
		if(a==b && b==6)
			System.out.println("Control is in second if block");
		if(!(a>5 || b==a))
			System.out.println("Control is in third if block");
		if(!(a==b && b==6))
			System.out.println("Control is in fourth if block");
	}

}
