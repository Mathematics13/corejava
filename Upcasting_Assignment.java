package mktclass;
class Country
{
	void countrymethod()
	{
		System.out.println("This is country method");
	}
}
class State extends Country
{
	void Statemethod()
	{
		System.out.println("This is state method");
	}
}
class City extends State
{
	void Citymethod()
	{
		System.out.println("This is city method");
	}
}

public class Upcasting_Assignment extends City
{
	void Upcastingmethod()
	{
		System.out.println("This is upcasting method");
	}
	public static void main(String[] args)
	{
		Country c1=new City();//upcasting
		c1.countrymethod();
		City c2=(City) c1;
		c2.Citymethod();
		c2.countrymethod();
		
		
	}

}
