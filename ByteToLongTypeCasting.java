package mktclass;

public class ByteToLongTypeCasting {

	public static void main(String[] args)
	{
		byte a=45;
		long a1=a;//widening implicitly
		System.out.println("Type casted from byte to long implicitly: "+a1);
		long a2=(long)a;//widening explicitly
		System.out.println("Type casted from byte to long explicitly: "+a2);
	}

}
