package mktclass;

class One
{
	void Onemethod()
	{
		System.out.println("1");
	}
}
class Two extends One
{
	void Twomethod()
	{
		System.out.println("2");
	}
}
public class DownCastingCase2 extends Two
{

	public static void main(String[] args) 
	{
		Two t1=new DownCastingCase2();
		DownCastingCase2 d1=(DownCastingCase2) t1;
		d1.Onemethod();
		d1.Twomethod();
	}

}
