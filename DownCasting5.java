package mktclass;

class Downn4
{
	void Down4method()
	{
		System.out.println("1");
	}
}
class Casting extends Downn4
{
	void Castingmethod()
	{
		System.out.println("2");
	}
}
public class DownCasting5 extends Casting 
{
	void Casting5()
	{
		
			System.out.println("3");
	}	
	public static void main(String[] args) 
	{
		Downn4 d4=new Casting();
		Casting c=(Casting) d4;
		c.Castingmethod();
		c.Down4method();	
	}

}
