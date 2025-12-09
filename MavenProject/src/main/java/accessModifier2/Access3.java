package accessModifier2;

import AccessModifier1.Access1;

public class Access3 extends Access1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access3 obj=new Access3();
		obj.Display();//public
		//obj.Display1();//private
		obj.Display2();//protected
		//obj.Display3();//default
		//Access1 obj=new Access1();
		obj.Display();//public
		//obj.Display1();//private
		obj.Display2();//protected
		//obj.Display3();//default
	}

}
