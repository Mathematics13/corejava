package mktclass;

class Updemo
{
	void updemomethod()
	{
		System.out.println("This is supermost class method");
	}
}
class Updemo1 extends Updemo
{
	void updemo1method()
	{
		System.out.println("This is subclass 1 method");
	}
}

public class UpcastinCase3 extends Updemo1
{

	public static void main(String[] args) 
	{
		Updemo ud1= new UpcastinCase3();
		ud1.updemomethod();
	}

}
