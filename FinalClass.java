package mktclass;

final class class1
{
	static void add()
	{
		System.out.println("Add method in parent class");
	}
}

public class FinalClass extends class1
{
	
	public static void main(String[] args)
	{
		add();
	}

}
