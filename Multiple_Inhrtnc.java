package mktclass;
interface facebook
{
	void FB();
}
interface whatsapp
{
	void WA();
}
interface instagram
{
	void IG();
	void WA();
	//void g();
}
public class Multiple_Inhrtnc implements facebook,whatsapp,instagram
{
	public static void main(String[] args) 
	{
		Multiple_Inhrtnc m1=new Multiple_Inhrtnc();
		m1.FB();
		m1.WA();
		m1.IG();
	}
	public void IG() 
	{
		System.out.println("This is Instagram method");
	}
	public void WA() 
	{
		System.out.println("This is Whatsapp method");

	}
	public void FB() 
	{
		System.out.println("This is Facebook method");
	}
}
