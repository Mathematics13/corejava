package mktclass;

class Down4
{
	void down4method()
	{
		System.out.println("1");
	}
}
class Down3 extends Down4
{
	void down3method()
	{
		System.out.println("2");
	}
}
public class DowncastingCase4 extends Down3
{

	public static void main(String[] args)
	{
		Down4 d4=new Down4();
		DowncastingCase4 d=(DowncastingCase4) d4;
		d.down3method();
		d.down4method();
	}

}
