package mktclass;
class forward
{
	forward()
	{
		System.out.println("1");
	}
}
class forward1 extends forward
{
	forward1()
	{
		//super();
		System.out.println("2");
	}
}
public class SuperCalling_Stmnt extends forward1
{
	SuperCalling_Stmnt()
	{
		//super();
		System.out.println("3");
	}
	public static void main(String[] args)
	{
		new SuperCalling_Stmnt();
	}

}
