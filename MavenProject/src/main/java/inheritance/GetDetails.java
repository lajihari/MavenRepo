package inheritance;

import java.util.Scanner;

public class GetDetails {
	
	Scanner sc = new Scanner(System.in);
	double bp;
	double ded;
	double bonus;
	String name;
	
	public GetDetails()
	{
    System.out.println("Enter your name");
    name=sc.nextLine();
	System.out.println("Enter the Basic Pay");
	bp=sc.nextDouble();
	System.out.println("Enter the Deduction");
	ded=sc.nextDouble();
	System.out.println("Enter the Bonus");
	bonus=sc.nextDouble();
	 
	}

}
