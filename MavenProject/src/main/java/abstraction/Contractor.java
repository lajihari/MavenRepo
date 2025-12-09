package abstraction;

import java.util.Scanner;

public class Contractor extends Employee {
	
	double salary=0;

	void calculateSalary(int n,double p)
	{
		if(n!=8)
		{
			salary=n*p;
			System.out.println("The Salary is:"+salary);
		}
		else
		{
			salary=8*p;
			System.out.println("The Salary is:"+salary);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the time of work:");
		int t=sc.nextInt();
		System.out.println("Enter the current salary:");
		double s=sc.nextDouble();
		Employee c=new Contractor();
		c.calculateSalary(t, s);

	}

}
