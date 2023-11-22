package mktclass;

import java.util.Scanner;

public class SwitchCaseProgram {

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a case value: ");
		int a=s1.nextInt();
		s1.close();
		switch(a)
		{
		case 1:
			System.out.println("This is case 1");
			break;
		case 2:
			System.out.println("This is case 2");
			break;
		case 3:
			System.out.println("This is case 3");
			break;
		default:
			System.out.println("No case selected. This is a default value as value does not match with case.");
		}
	}

}
