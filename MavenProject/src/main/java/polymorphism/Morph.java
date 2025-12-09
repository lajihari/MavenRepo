package polymorphism;

public class Morph extends Poly {
	
	public void Display(int a)
	{
       super.Display(3);
		System.out.println("Poly");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Morph obj=new Morph();
		obj.Display(0);
		

	}

}
