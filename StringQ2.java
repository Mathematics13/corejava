package mktclass;

public class StringQ2 {

	public static void main(String[] args) 
	{
		String s="My name is Gokul";
		String s1=s.substring(0, 2);
		for(int i=0;i<s1.length();i++)
		System.out.println(s1.charAt(i));
		String s2=s.substring(3, 7);
		for(int i=0;i<s2.length();i++)
		System.out.println(s2.charAt(i));
		String s3=s.substring(8, 10);
		for(int i=0;i<s3.length();i++)
		System.out.println(s3.charAt(i));
		String s4=s.substring(11);
		for(int i=0;i<s4.length();i++)
		System.out.println(s4.charAt(i));
	}

}
