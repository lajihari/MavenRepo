package ExceptioHandling;

import java.util.Scanner;

public class Example3 {
	int age;
	
	public void eligible(int n) 
	{
		 try {
	            this.age = n;

	            if (age > 18) {
	                System.out.println("Eligible to drive");
	            } else {
	                System.out.println("Not Eligible to drive");
	            }
	        } catch (Exception e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	}
	

	public static void main(String[] args) throws InvalidException {
		// TODO Auto-generated method stub
		Example2 obj=new Example2();
		try (Scanner sc = new Scanner(System.in)) {
			obj.eligible(sc.nextInt());
		}
	}
 
	

}
