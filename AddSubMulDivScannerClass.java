package mktclass;

import java.util.Scanner;

public class AddSubMulDivScannerClass 
{
	void addition()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter first value for addition: ");
		int a=s1.nextInt();
		System.out.println("Enter second value for Addition: ");
		int b=s1.nextInt();
		int result=a+b;
		System.out.print("Addition result: ");
		System.out.println(result);
		s1.close();
	}
	void subtraction()
	{
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter first value for subtraction: ");
		int c=s2.nextInt();
		System.out.println("Enter second value for subtraction");
		int d=s2.nextInt();
		int result=c+d;
		System.out.print("Subtraction result is: ");
		System.out.println(result);
		s2.close();
	}
	void multiply()
	{
		Scanner s3=new Scanner(System.in);
		System.out.println("Enter first value for: ");
		int e=s3.nextInt();
		System.out.println("Enter second value for: ");
		int f=s3.nextInt();
		int result=e+f;
		System.out.print("Result for multiplication: ");
		System.out.println(result);
		s3.close();
		
	}
	void divide()
	{
		Scanner s4=new Scanner(System.in);
		System.out.println("Enter first number for division: ");
		int g=s4.nextInt();
		System.out.println("Enter second number for division: ");
		int h=s4.nextInt();
		int result=g+h;
		System.out.print("Result for Division: ");
		System.out.println(result);
		s4.close();
	}
	
	public static void main(String[] args) 
	{
		AddSubMulDivScannerClass a1=new AddSubMulDivScannerClass();
		a1.addition();
		//a1.subtraction();
		a1.multiply();
		a1.divide();
	}

}
