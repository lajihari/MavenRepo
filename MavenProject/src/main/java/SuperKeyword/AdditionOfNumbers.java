package SuperKeyword;

import java.util.Scanner;

public class AdditionOfNumbers {

	int a;
	int b;
	int total;
	public int Addition()
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the first number:");
			a=sc.nextInt();
			System.out.println("Enter the second number:");
			b=sc.nextInt();
		}
		total=a+b;
		return total;
	}
}
