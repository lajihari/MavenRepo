package ExceptioHandling;

public class Example1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="Laji";
		System.out.println(S);
		try
		{
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
		catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");

}
	}
}
