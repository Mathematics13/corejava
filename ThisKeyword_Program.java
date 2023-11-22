package mktclass;

public class ThisKeyword_Program 
{
	int age;
	String name;
	double salary;
	String companyname;
	void employeedetails(int a,String n,double s,String c)
	{
		this.age=a;
		this.name=n;
		this.companyname=c;
		this.salary=s;
	}
	public static void main(String[] args)
	{
		ThisKeyword_Program t1=new ThisKeyword_Program();
		t1.employeedetails(34, "Gokul", 150000.0,"Infosys");
		System.out.println("Employee name: "+t1.name);
		System.out.println("Employee age: "+t1.age);
		System.out.println("Employee salary: "+t1.salary);
		System.out.println("Employee company: "+t1.companyname);
	}

}
