package mktclass;
class Upcasting
{
	void Highways()
	{
		
	}
	void Railways()
	{
		
	}
}
public class ClassTypeCastingProgram extends Upcasting
{
	static void State()
	{
		
	}
	void foreign()
	{
		
	}
	public static void main(String[] args) 
	{
		Upcasting u1=new ClassTypeCastingProgram();//implicit upcasting
		Upcasting u2=(Upcasting) new ClassTypeCastingProgram();//explicit upcasting
		u2.Highways();
		u1.Railways();
	}

}
