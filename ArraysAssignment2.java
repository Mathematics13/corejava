package mktclass;
public class ArraysAssignment2 {

	public static void main(String[] args)
	{
		String stud[]=new String[3];
		stud[0]="Student 1";
		stud[1]="Student 2";
		stud[2]="Student 3";
		String name[]=new String[3];
		name[0]="Name 1";
		name[1]="Name 2";
		name[2]="Name 3";
		int age[]=new int[3];
		age[0]=30;
		age[1]=28;
		age[2]=29;
		long mob[]=new long[3];
		mob[0]=98762234;
		mob[1]=99855664;
		mob[2]=78923451;
		String email[]=new String[3];
		email[0]="name1@email.com";
		email[1]="name2@email.com";
		email[2]="name3@email.com";
		for(int i=0;i<=2;i++)
		{
			System.out.println(stud[i]);
			System.out.println("------");
			System.out.println(name[i]);
			System.out.println(age[i]);
			System.out.println(mob[i]);
			System.out.println(email[i]);
			System.out.println(" ");
		}
	}

}
