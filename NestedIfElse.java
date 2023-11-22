package mktclass;

public class NestedIfElse {

	public static void main(String[] args) 
	{
		String a="Gokul Krishna";
		String b="B S";
		int age=30;
		if(age==30)
		{
			if(a=="Gokul Krishna")
			{
				if(b=="BS")
					System.out.println("Your candidate id is 3421");
				else
					System.out.println("This is not the person youa are looking for");
			}
			else
				System.out.println("Try another name");
		}
		else
			System.out.println("Try with another age ");
				
			
		}
	}

