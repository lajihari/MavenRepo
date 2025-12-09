package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListInMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> number=new ArrayList();
		number.add(1);
		number.add(2);
		number.add(3);
		System.out.println(number);
		System.out.println(number.get(0));//get elements at specified index
		number.set(1,1);	
		System.out.println(number);
		System.out.println(number.indexOf(3));
		System.out.println(number.indexOf(1));
		System.out.println(number.lastIndexOf(1));
		number.remove(1);
		System.out.println(number);
		System.out.println(number.contains(5));
		System.out.println(number.isEmpty());
		System.out.println(number.size());
	}
	

}
