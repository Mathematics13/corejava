package mktclass;
class Gunjan
{
	Gunjan()
	{
		
	}
	Gunjan(int a)
	{
		
	}
	void add()
	{
		System.out.println("This is parent method");
	}
}
public class OverridingMethod extends Gunjan
{
	OverridingMethod()
	{
		
	}
	void add(int a)
	{
		System.out.println("This is subclass");
	}
	public static void main(String[] args) 
	{
		OverridingMethod o1=new OverridingMethod();
		o1.add();
		o1.add(8);
	}

}
