package mktclass;

public class IfElseIF {

	public static void main(String[] args)
	{
		int EngineCC=101;
		if(EngineCC<100)
			System.out.println("License not required to ride");
		else if(EngineCC>100)
			System.out.println("License required for the rider");
		else if(EngineCC==100)
			System.out.println("License required for rider");
		else
			System.out.println("Apply for driving license");
	}

}
