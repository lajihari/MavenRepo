package SuperKeyword;

public class Super_Keyword1 extends Super_Keyword{
	
	String color="Yellow";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super_Keyword1 obj=new Super_Keyword1();
		obj.display();
		
	}
	public void display()
	{
		System.out.println("Child Class"+color);
		System.out.println("Parent class"+super.color);
	}

}
