package mktclass;

class superdemo
{
	void add()
	{
		System.out.println("This is add method in super class");
	}
}

public class Super_Inheritance extends superdemo
{
	void add()
	{
		super.add();
		System.out.println("This is add method in sub class");
	}
	public static void main(String[] args)
	{
		Super_Inheritance s1=new Super_Inheritance();
		s1.add();
	}

}
