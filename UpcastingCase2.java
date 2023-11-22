package mktclass;

class Upcast2
{
	void Upcast2method()
	{
		System.out.println("1");
	}
	void Upcast2mehtod1()
	{
		System.out.println("2");
	}
}
class Up2 extends Upcast2
{
	void Up2method()
	{
		System.out.println("3");
	}
}
public class UpcastingCase2 extends Up2
{
	void Upcastingmethod()
	{
		System.out.println("4");
	}
	public static void main(String[] args) 
	{
		Up2 u1=new  UpcastingCase2();
		u1.Upcast2mehtod1();
		u1.Up2method();
		u1.Upcast2method();
	}

}
