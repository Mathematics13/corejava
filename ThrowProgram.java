package mktclass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowProgram {

	public static void main(String[] args) throws ArithmeticException,InputMismatchException
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int a=s1.nextInt();
		s1.close();
		if(a>=18)
			System.out.println("Visit google.com");
		else
			throw new ArithmeticException("Age less than 18");
	}

}
