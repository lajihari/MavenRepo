package AccessModifier1;

public class Access1 {
	
	public void Display()
	{
		System.out.println("Access Modifier-Public");
	}
	private void Display1()
	{
		System.out.println("Access Modifier-Private");
	}
	protected void Display2()
	{
		System.out.println("Access Modifier-Protected");
	}
     void Display3()
	{
		System.out.println("Access Modifier-Default");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 obj=new Access1();
		obj.Display();
		obj.Display1();
		obj.Display2();
		obj.Display3();
	}

}
