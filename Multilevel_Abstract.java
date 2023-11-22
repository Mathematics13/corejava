package mktclass;
abstract class Mulltparent1
{
	abstract void demo1();
	abstract void demo2();
	static void demo3()
	{
		System.out.println("I am a static method");
	}
	void demo4()
	{
		System.out.println("I ama non static method");
	}
	
}
abstract class Multparent2 extends Mulltparent1
{
	abstract void demo5();
	abstract void demo6();
	static void demo7()
	{
		System.out.println("I am the static method of Multparent2");
	}
	void demo8()
	{
		System.out.println("I am the non static method of Multparent2");
	}
	
}

public class Multilevel_Abstract extends Multparent2
{
	

	public static void main(String[] args) 
	{
		Multilevel_Abstract m1=new Multilevel_Abstract();
		m1.demo1();
		m1.demo2();
		m1.demo4();
		m1.demo5();
		m1.demo6();
		m1.demo8();
		demo3();
		demo7();
	}
	void demo5() {
		System.out.println("I am the implementation of abstract method in Multparent2 class");
		
	}
	void demo6() {
		System.out.println("I am the implementation of abstract method in Multparent2 class");
		
	}
	void demo1() {
		System.out.println("I am the implementation of abstract method in Multparent1 class");
	}
	void demo2() {
		System.out.println("I am the implementation of abstract method in Multparent1 class");
		
	}

}
