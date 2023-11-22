package mktclass;

import java.util.Scanner;

public class MathClassProgram {

	public static void main(String[] args)
	{
		System.out.println(Math.PI);
		System.out.println(Math.random());
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter a value for variable a: ");
		int a=s1.nextInt();
		System.out.print("Enter a value fopr b: ");
		int b=s1.nextInt();
		s1.close();
		int maximum= Math.max(a, b);
		System.out.println("Maximum value is:"+maximum);
		System.out.println("Adding a and b: ");
		System.out.println(Math.addExact(a, b));
	}

}