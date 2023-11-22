package mktclass;

public class String_WordReverse {

	public static void main(String[] args) 
	{
		String a="My Name is Gokul";
//		int lword=a.lastIndexOf('G');
//		String G=a.substring(lword);
//		System.out.println(G);
//		int slword=a.lastIndexOf('i');
//		String I=a.substring(slword, lword-1);
//		System.out.println(I);
//		int tlword=a.lastIndexOf('N');
//		String N=a.substring(tlword, slword-1);
//		System.out.println(N);
//		int fword=a.lastIndexOf('M');
//		String M=a.substring(fword, tlword-1);
//		System.out.println(M);
		
		for(int i=a.length()-1;i>=0;i--)
		{
			if(a.charAt(i)==' ')
			{
				System.out.println();
			}
			else
				
				System.out.print(a.charAt(i));
		}
		
	}

}
