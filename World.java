package mktclass;
public class World {
	World()
	{
		System.out.println("hey I am 1st");
	}
	World(int a)
	{
		System.out.println("hey I am 2nd");
	}
	World(int a,double b,char c,String d)
	{
		System.out.println("hey I am 3rd");
	}
	public static void main(String[] args) 
	{
		World w1=	new World(88,7.54,'v',"MKT");
		World w2=	new World();
		World w3=new World(99);
	}

}
