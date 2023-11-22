package mktclass;

interface demo
{
	void demo1();
	void add();
		
}
abstract class traffic implements demo
{
	abstract void red();
	abstract void green();
	static void rules()
	{
		System.out.println("Follow traffic rules as per state protocols");
	}
	void trafficpolice()
	{
		System.out.println("Traffic police validates citizens are following the rules");
	}
}
public class MultLvl_Intrfc_AC extends traffic
{
	
	static void police()
	{
		System.out.println("Police is responsible for law and order");
	}
	void HomeAffairs()
	{
		System.out.println("Ministry responsible for law and order");
	}
	public static void main(String[] args) 
	{
		
		MultLvl_Intrfc_AC m1= new MultLvl_Intrfc_AC();
		police();
		m1.add();
		m1.demo1();
		m1.green();
		m1.HomeAffairs();
		rules();
	}
	public void demo1() {
		System.out.println("This is implemented method demo1 from interface demo");
	}
	public void add() {
		System.out.println("You can add and implement new traffic rules here");
	}
	void red() {
		System.out.println("You need to stop the vehicle before zebra cross");
		
	}
	void green() {
		System.out.println("You can move forward");
	}
}
