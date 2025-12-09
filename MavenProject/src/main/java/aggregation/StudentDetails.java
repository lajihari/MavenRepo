package aggregation;

import java.util.Scanner;

public class StudentDetails {
	
	Scanner sc=new Scanner(System.in);
	String name;
	int roll_number;
	
	public StudentDetails()
	{
		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("Enter your roll number:");
		roll_number=sc.nextInt();
	}

}
