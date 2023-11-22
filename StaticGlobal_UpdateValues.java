package mktclass;

public class StaticGlobal_UpdateValues 
{
	int a=1000;
	String b="Gokul";
	void updatedvalue()
	{
		a=350;
		System.out.println(a);
	}
	void updatedval2()
	{
		b="Johnson";
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		StaticGlobal_UpdateValues s1 = new StaticGlobal_UpdateValues();
		s1.updatedvalue();
		s1.updatedval2();
	}

}
