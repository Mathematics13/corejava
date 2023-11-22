package mktclass;

public class StaticMethodOverloading
{
	static void add(int a,int b)
	{
		int result=a+b;
		System.out.println(result);
	}
	static void add(double a,double b)
	{
		double result=a+b;
		System.out.println(result);

	}
	static void add(int a,int b,double c)
	{
		double result=a+b+c;
		System.out.println(result);

	}
	public static void main(String[] args) 
	{
		add(987,980);
		add(765.99,2319.765);
		add(5673,9890,876.90);
	}

}
