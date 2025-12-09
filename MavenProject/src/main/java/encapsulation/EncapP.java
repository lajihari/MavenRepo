package encapsulation;

public class EncapP {
	
	private int a;
	private String b;
	
	public void set(int num,String S)
	{
		this.a=num;
		this.b=S;
		
	}
	public void get()
	{
		System.out.println(a);
		System.out.println(b);
	}

}
