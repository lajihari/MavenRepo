package SuperKeyword;

public class SuperMethodC extends SuperMethodP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethodC obj=new SuperMethodC();
		obj.draw();

	}
	public void draw()
	{
		System.out.println("Child Class");
		super.display();
		super.get();
	}

}
