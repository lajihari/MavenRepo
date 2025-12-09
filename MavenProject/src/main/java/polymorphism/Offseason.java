package polymorphism;

import java.util.Scanner;

public class Offseason extends Onseason{
	
	public void discount(double v)
	{
		super.discount(v);
		System.out.println("Offseason");
		discountvalue=(v*15)/100;
		System.out.println("Discount value is:"+discountvalue);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount");
        double value=sc.nextDouble();
        Offseason obj=new Offseason();
        obj.discount(value);
        
	}

}
