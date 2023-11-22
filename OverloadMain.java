package mktclass;

public class OverloadMain {

	public  void main(String[] args) 
	{
		System.out.println("1");
		main(4);
	}static
	public static void main()
	{
		System.out.println("2");
	}
	public static void main(int a)
	{
		System.out.println("3");
	}
	

}
