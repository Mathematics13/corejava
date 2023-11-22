package mktclass;

import java.util.Scanner;

public class CircleArea_FinalVar
{
	final double pi=3.14;
	void area(double r)
	{
		double area=pi*r*r;
		System.out.print("area of circle : ");
		System.out.println(area);
		
	}
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter the radius : ");
		int a=s1.nextInt();
		s1.close();
		CircleArea_FinalVar c1=new CircleArea_FinalVar();
		c1.area(a);
		
	}

}
