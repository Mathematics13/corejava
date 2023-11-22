package mktclass;

public class GlobalSample
{	
	int a=100;//declaration and initialisation is happening
	int b; //global declaration
	int c;
	//c=90;//not possible
	void sample()
	{
		a=55;
		b=100;//local initilisation
		System.out.print("Sample method a value: "+a);
	}
	void demo()
	{
		a=20;
		c=100;
		System.out.print("Demo method a value: "+a);
	}

	public static void main(String[] args) 
	{
		GlobalSample g1=new GlobalSample();
		System.out.println(g1.a);
		g1.sample();
		System.out.println();
		g1.demo();
	}

}
