package mktclass;

interface Singlelevel
{
	void demo();
}

public class Interface_Class implements Singlelevel {

	public static void main(String[] args) 
	{
		Interface_Class i1=new Interface_Class();
		i1.demo();
		
	}

	@Override
	public void demo() {
		System.out.println("This is an implementation of abstract method in interface");
	}

}
