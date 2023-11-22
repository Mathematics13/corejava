package mktclass;

public class DiffElseIF {

	public static void main(String[] args)
	{
		int m=70;
		double p=88.5;
		double b=77.65;
		double c=55.89;
		if(p>=60)
		System.out.println("Apply for BSc Physics");
		else if(c>=70)
			System.out.println("Apply for BSc Chemistry");
		else if(b>=80)
			System.out.println("Apply for MBBS Entrance examination");
		else if(m>=70)
			System.out.println("Apply for BSc Mathematics");
		else
			System.out.println("Apply for some other courses");
		
	}

}
