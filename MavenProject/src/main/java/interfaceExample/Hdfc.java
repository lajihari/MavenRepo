package interfaceExample;

import java.util.Scanner;

public class Hdfc implements RBI{
	
	double tAmount=0;

	public void RecurringDeposit(double amount,int duration)
	{
		tAmount=amount+(amount*duration*r)/100;
		System.out.println("The total amount is:"+tAmount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount:");
		double t=sc.nextDouble();
		System.out.println("Enter the duration:");
		int s=sc.nextInt();
		Hdfc f=new Hdfc();
		f.RecurringDeposit(t, s);
		
	}

}
