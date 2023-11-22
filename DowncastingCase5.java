package mktclass;

class Past
{
	void Pastmethod()
	{
		System.out.println("1");
	}
}
class Present extends Past
{
	void Presentmethod()
	{
		System.out.println("2");
	}
}
public class DowncastingCase5 extends Present
{
	void DowncastingCase5method()
	{
		System.out.println("3");
	}
	public static void main(String[] args)
	{
		Past p1=new DowncastingCase5();
		Present p= new DowncastingCase5();
		DowncastingCase5 d5=(DowncastingCase5) p;
		d5.Pastmethod();
		d5.Presentmethod();
		d5.DowncastingCase5method();
	}

}
