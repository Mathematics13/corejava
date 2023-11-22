package mktclass;

public class IfConditionSample {

	public static void main(String[] args) 
	{
		int age=17;
		if(age>=18)
		{
			System.out.println("Eligilble to vote");
		}
		
		else if(age>=12 && age<=19)
		{
			System.out.println("You are in teen age ");

		}
		else if(age==17)
		{
			System.out.println("Good");
		}
		else
			System.out.println("End of if condition");
	}

}
