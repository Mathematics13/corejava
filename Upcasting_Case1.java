package mktclass;
class Upcast1
{
	void upcast1method()
	{
		System.out.println("1");
	}
}
public class Upcasting_Case1 extends Upcast1
{
	void Upcasting_Case1method()
	{
		System.out.println("2");
	}
	public static void main(String[] args) 
	{
		Upcast1 u1=new Upcasting_Case1();
		u1.upcast1method();
	}

}
