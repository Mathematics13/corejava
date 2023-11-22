package mktclass;
class superparent
{
	superparent()
	{
		System.out.println("I am the constructor of parent class");
	}
	void demo1()
	{
		System.out.println("I am the method of super parent");
	}
}
class subclass3 extends superparent
{
	subclass3()
	{
		System.out.println("I am the constructor of subclass3");
	}
}
class subclass2 extends superparent
{
	subclass2()
	{
		System.out.println("I am the constructor of subclass2");
	}
}
class subclass1 extends superparent
{
	subclass1()
	{
		System.out.println("I am the constructor of subclass1");
	}
	void demo()
	{
		System.out.println("I am method in subclass1");
	}
	static void demo2()
	{
		System.out.println("Static Method in subclass1");
	}
}

public class HierarchialInheritanceExample extends superparent 
{

	public static void main(String[] args) 
	{
		HierarchialInheritanceExample h1=new HierarchialInheritanceExample();
		h1.demo1();
		subclass1 s1=new subclass1();
		s1.demo();
		subclass1.demo2();
		
	}

}
