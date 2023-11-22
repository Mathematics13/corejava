package mktclass;

class Downcast
{
	void downcastmethod()
	{
		System.out.println("1");
	}
}
public class DownCastingCase1 extends Downcast
{
	void DownCastingCase1mehtod()
	{
		System.out.println("2");
	}

	public static void main(String[] args) 
	{
		Downcast d1=new DownCastingCase1();
		DownCastingCase1 d2= (DownCastingCase1)d1;
		d2.DownCastingCase1mehtod();
		d2.downcastmethod();
	}

}
