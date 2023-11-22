package mktclass;

import java.util.Scanner;

public class StringQ4 {

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter the first String: ");
		String a=s1.next();
		System.out.println("Enter the second string: ");
		String b=s1.next();
		s1.close();
		int biglenght=Math.max(a.length(), b.length());
		for(int i=0;i<biglenght;i++)
		{
			if(i<a.length())
			System.out.print(a.charAt(i));
			if(i<b.length())
			System.out.print(b.charAt(i));
		}
	}

}
