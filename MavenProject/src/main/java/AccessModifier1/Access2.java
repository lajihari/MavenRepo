package AccessModifier1;

public class Access2 extends Access1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 obj=new Access1();
		obj.Display();
		//obj.Display1();-This is private method
		obj.Display2();
		obj.Display3();
	}

}
