package mktclass;

public class ReturnKeyword 
{
	String namereturn(String s)
	{
		return s;
	}

	public static void main(String[] args)
	{
		ReturnKeyword r1=new ReturnKeyword();
		System.out.println(r1.namereturn("AirBus-A 380"));
	}

}
