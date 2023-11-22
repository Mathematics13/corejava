package mktclass;
class addition
{
	void add()
	{
		System.out.println("This is add function");
	}
}
class subtraction extends addition
{	void sub()
	{
		System.out.println("This is sub function");
	}
}
class multiplication extends subtraction
{
	void mul()
	{
		System.out.println("This is mul function");
	}
}
class division extends multiplication
{
	void div()
	{
		System.out.println("This is div function");
	}
}
public class Arithmatic_Operator extends division
{	public static void main(String[] args)
	{	Arithmatic_Operator a1=new Arithmatic_Operator();
		a1.add();
		a1.div();
		a1.mul();
		a1.sub();
}}
