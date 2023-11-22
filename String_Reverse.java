package mktclass;

public class String_Reverse 
{
	public static void main(String[] args) 
	{
		String a = "India";
		int length=a.length();
		for(int i=length-1;i>=0;i--)
		{
			char c=a.charAt(i);
			System.out.print(c);
		}
	}
}
