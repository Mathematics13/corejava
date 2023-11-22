package mktclass;

class Updemo4
{
	void updemo4method()
	{
		System.out.println("1");
	}
}
class Up4 extends Updemo4
{
	void up4method()
	{
		System.out.println("2");
	}
}
public class UpcastingCase4 extends Up4
{
	void case4()
	{
		System.out.println("4");
	}
	public static void main(String[] args)
	{
		Updemo4 u4=new Up4();
		u4.updemo4method();
	}

}
