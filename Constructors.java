package mktclass;

public class Constructors 
{
	Constructors()
	{
		System.out.println("I am the constructor");
	}
	Constructors(int a,int b)
	{
		int result=a-b;
		System.out.println(result);
	}

	public static void main(String[] args)
	{
		new Constructors();
		new Constructors(654,908);
		
	}

}
