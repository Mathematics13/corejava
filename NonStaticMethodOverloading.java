package mktclass;

public class NonStaticMethodOverloading 
{
	void multiply(int a,int b)
	{
		int result=a*b;
		System.out.println(result);
	}
	void multiply(double a,double b)
	{
		double result=a*b;
		System.out.println(result);
	}
	void multiply(int a,double b,double c)
	{
		double result=a*b;
		System.out.println(result);
	}

	public static void main(String[] args) 
	{
		NonStaticMethodOverloading nsmo1= new NonStaticMethodOverloading();
		nsmo1.multiply(234.78, 876.90);
		nsmo1.multiply(543, 890);
		nsmo1.multiply(765, 890.98, 7654.99);
	}

}
