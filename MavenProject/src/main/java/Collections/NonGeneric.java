package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List a=new ArrayList();//non-generic collection
		a.add("hello");
		a.add(1);
		a.add(1.1);
		a.add("hi");
		System.out.println(a);
		Set number=new HashSet();
		number.add(1);
		number.add("num");
		number.add(1.1);
		System.out.print(number);
		
	}

}
