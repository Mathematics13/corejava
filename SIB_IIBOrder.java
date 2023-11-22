package mktclass;

public class SIB_IIBOrder 
{
	SIB_IIBOrder()
	{
		System.out.println("I am the first constructor");
	}
	SIB_IIBOrder(int a)
	{
		int result=a+90;
		System.out.print("Result is : ");
		System.out.println(result);
	}
	static
	{
		System.out.println("First SIB");
	}
	static
	{
		System.out.println("Second SIB");
	}
	{
		System.out.println("First IIB");
	}
	{
		System.out.println("Second IIB");
	}

	public static void main(String[] args) 
	{
		new SIB_IIBOrder();
		new SIB_IIBOrder(90);
		
	}

}
