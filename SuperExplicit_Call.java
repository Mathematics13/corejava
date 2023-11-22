package mktclass;

import java.util.Scanner;

class technology
{
	technology(int a,int b)
	{
		int result=a+b;
		System.out.println("Result is: "+result);
	}
}
public class SuperExplicit_Call extends technology
{
	SuperExplicit_Call(int a, int b)
	{
		super(a, b);
	}
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value for a: ");
		int a=s1.nextInt();
		System.out.println("Enter value for b: ");
		int b=s1.nextInt();
		s1.close();
		new SuperExplicit_Call(a,b);
	}

}
