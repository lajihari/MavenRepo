package encapsulation;

import java.util.Scanner;

public class UserPin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin:");
		int pin=sc.nextInt();
		SetPin p=new SetPin();
		p.set();
		p.validate(pin);

	}

}
