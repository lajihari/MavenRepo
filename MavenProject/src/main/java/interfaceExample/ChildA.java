package interfaceExample;

public class ChildA implements ParentA{

	public void print()
	{
		System.out.println("hello");
		
	}
	public void get()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildA a=new ChildA();
		a.get();
		a.print();
	}

}
