package mktclass;

public class ThisCallingExample
{
	ThisCallingExample()
	{
		this(100);
		System.out.println("This is non para constructor");
	}
	ThisCallingExample(int a)
	{
		this(10,20);
		System.out.println("This is para constructor with int para");
	}
	ThisCallingExample(double b)
	{
		this(30,40);
		System.out.println("This is para constructor with double para");
	}
	ThisCallingExample(int a,int b)
	{
		//this(33.3);
		System.out.println("this para constructor with two int para");
	}
	public static void main(String[] args)
	{
		new ThisCallingExample();
		soft s1=new soft();
		s1.assign();
		System.out.println(s1.a);
		System.out.println(s1.b);
	}
}

//This keyword
class soft
{
	int a;
	int b;
	void assign()
	{
		int c=20;
		int d=300;
		this.a=c;
		this.b=d;
	}
	
}
