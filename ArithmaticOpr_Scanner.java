package mktclass;

import java.util.Scanner;

public class ArithmaticOpr_Scanner 
{
	void add(double a,double b)
	{
		double addition=a+b;
		System.out.print("Addition result: ");
		System.out.println(addition);
		
	}
	void sub(double a,double b)
	{
		double subtraction=a-b;
		System.out.print("Subtraction result: ");
		System.out.println(subtraction);
	}
	void mul(double a,double b)
	{
		double multiplication=a*b;
		System.out.print("Multiplication result: ");
		System.out.println(multiplication);
	}
	void div(double a,double b)
	{
		double division=a/b;
		System.out.print("Division result: ");
		System.out.println(division);
	}

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter first number: ");
		double a=s1.nextDouble();
		System.out.print("Enter second number: ");
		double b=s1.nextDouble();
		s1.close();
		ArithmaticOpr_Scanner a1=new ArithmaticOpr_Scanner();
		a1.add(a, b);
		a1.sub(a, b);
		a1.mul(a, b);
		a1.div(a, b);
	}

}
