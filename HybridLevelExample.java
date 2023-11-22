package mktclass;
class noida
{
	void noidacity()
	{
		System.out.println("Method in noida class");
	}
	
}
class gurgaon extends noida
{
	void gurgaoncity()
	{
		System.out.println("Method in gurgaon class");
	}
}
class delhi extends gurgaon
{
	void delhicity()
	{
		System.out.println("Method in delhi class");
	}
	
}
public class HybridLevelExample extends noida
{
	void example()
	{
		System.out.println("Method in HybridLevelExample class");
	}
	public static void main(String[] args) 
	{
		delhi d1=new delhi();
		d1.delhicity();
		d1.gurgaoncity();
		d1.noidacity();
		HybridLevelExample h1=new HybridLevelExample();
		h1.example();
	}
}
