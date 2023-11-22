package mktclass;

public class MathRandomForLoop {

	public static void main(String[] args) 
	{
		double rnd[]=new double[100];
		//double a = 0;
		for(int i=0;i<100;i++)
		{
			rnd[i]=Math.random();
			System.out.println(rnd[i]);
		}
		for(int i=0;i<100;i++)
		{
			try
			{
			if(rnd[i]==rnd[i+1])
				System.out.println("Random values are not Uniqe");
			}
			catch(ArrayIndexOutOfBoundsException aiob)
			{
				System.out.println("Exception occured and handled here");
			}
		}
		System.out.println("Values are unique");
	}

}
