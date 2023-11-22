package mktclass;
class Encap2
{
	private String username="mangalgunjan@gmail.com";
	private String password="mail@1234";
	private int dob =20102000;
	
public void set_username(String username)
{
          this.username=username;
}
public void set_password(String password)
{
	      this.password=password;
}
public int get_dob()
{
            return dob;
}
public String get_username()
{
           return username;
}
public String get_password()
{
           return password;
}
public void set_dob(int dob)
{
	       this.dob=dob;
}
}
public class EncapsulationSamplePRog 
{
	

	public static void main(String[] args)
	{
		Encap2 e1=new Encap2();
		e1.set_username("Gunjan@email.com");
		e1.set_password("gunjan@123");
		e1.set_dob(10102000);
		System.out.println(e1.get_username());
		System.out.println(e1.get_password());
		System.out.println(e1.get_dob());
	}

}
