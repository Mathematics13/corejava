package mktclass;

import java.util.Scanner;

class Encap
{
	private String userid="abcd9081";
	private String password="90233abdfh";
	private int dob=10102000;
	
	public void set_userid(String user_id)
	{
		this.userid=user_id;
	}
	public void set_password(String paswrd)
	{
		this.password=paswrd;	
	}
	public void set_dob(int d)
	{
		this.dob=d;
	}
	public String get_userid()
	{
		return userid;
	}
	public String get_password()
	{
		return password;
	}
	public int get_dob()
	{
		return dob;
	}
}

public class Encapsulation_Program 
{

	public static void main(String[] args)
	{
		Encap e1=new Encap();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter user id: ");
		String usr=s1.next();
		System.out.println("Enter password: ");
		String pswd=s1.next();
		System.out.println("Enter dob: ");
		int dob=s1.nextInt();
		s1.close();
		e1.set_userid(usr);
		e1.set_password(pswd);
		e1.set_dob(dob);
		System.out.println("Encapsulation done");
		System.out.println("Entered details are listed below :");
		System.out.println(e1.get_userid());
		System.out.println(e1.get_password());
		System.out.println(e1.get_dob());
	}

}
