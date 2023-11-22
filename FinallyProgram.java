package mktclass;

public class FinallyProgram {

	public static void main(String[] args)
	{
		try
		{
			int c=1/1;
			System.out.println(c);
		}
		catch(ArithmeticException a)
		{
			System.out.println("Denominator cannot be zero");
		}
		finally
		{
			System.out.println("End of the program");
		}
	}

}
