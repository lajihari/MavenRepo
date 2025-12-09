package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set a=new HashSet();
		a.add("hello");
		a.add(1);
		a.add(1.23);
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a.contains(2));
		a.remove(1);
		System.out.println(a);
		System.out.println(a.toString());
		Set<String> b=new TreeSet();
		b.add("Yellow");
		b.add("Green");
		b.add("Red");
		System.out.println(b);
		System.out.println(b.isEmpty());
		System.out.println(b.size());
		System.out.println(b.contains("black"));
		b.remove("Red");
		System.out.println(b);
		
		
	}

}
