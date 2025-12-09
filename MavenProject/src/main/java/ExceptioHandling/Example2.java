package ExceptioHandling;

import java.util.Scanner;

public class Example2 {
	
	int age;
	public void eligible(int n) throws InvalidException//throws ArithmeticException
	{
		this.age=n;
		if(age<18)
		{
			//System.out.println("Eligible to drive");
			throw new InvalidException("Access Denied");
		}
		else
		{
			System.out.println("Not Eligible to drive");
		}
	}

	public static void main(String[] args) throws InvalidException {
		// TODO Auto-generated method stub
		Example2 obj=new Example2();
		Scanner sc=new Scanner(System.in);
	    obj.eligible(sc.nextInt());

	}

}
