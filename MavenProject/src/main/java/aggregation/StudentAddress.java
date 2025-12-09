package aggregation;

import java.util.Scanner;

public class StudentAddress {

	Scanner sc=new Scanner(System.in);
	String address;
	StudentDetails obj;
	
	public StudentAddress(StudentDetails obj)
	{
		System.out.println("Enter your address");
		address=sc.nextLine();
		System.out.println("Your Details are:");
		System.out.println("Name:"+obj.name);
		System.out.println("Roll Number:"+obj.roll_number);
		System.out.println("Address:"+address);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails obj1=new StudentDetails();
		StudentAddress obj2=new StudentAddress(obj1);

	}

}
