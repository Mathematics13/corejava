package mktclass;

import java.util.Scanner;

public class ArrayExceptionHandling {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int[]arr=new int[10];
		for(int i=0;i<=10;i++)
		{
			System.out.println("Enter value "+i+": ");
			try
			{
				arr[i]=s1.nextInt();
			}
			catch(ArrayIndexOutOfBoundsException aiob)
			{
				System.out.println("Exception occured and handled here");
			}
		}
		s1.close();
		System.out.println("Stored values in array are: ");
		for(int i=0;i<10;i++)
			System.out.println(arr[i]);
			
	}

}
