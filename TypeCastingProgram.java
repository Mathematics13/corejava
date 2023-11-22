package mktclass;

public class TypeCastingProgram {

	public static void main(String[] args) 
	{
		int a=90;
		double a1=a;//implicit type casting-widening
		float a3=(float)a;//explicit type casting-narrowing
		System.out.println(a3);
		System.out.println(a1);
		short a2=(short)a;
		System.out.println(a2);
	}

}
