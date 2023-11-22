package mktclass;

class Down1
{
	void onemethod()
	{
		System.out.println("1");
	}
}
class Downtwo extends Down1
{
	void twomethod()
	{
		System.out.println("2");
	}
}
public class DowncastingCase3 extends Downtwo
{
	void case3method()
	{
		System.out.println("3");
	}
	public static void main(String[] args) 
	{
		Down1 d1= new DowncastingCase3();
		DowncastingCase3 d3=(DowncastingCase3) d1;
		d3.case3method();
		d3.onemethod();
		d3.twomethod();
	}

}
