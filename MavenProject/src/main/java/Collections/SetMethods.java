package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> obj=new HashSet<String>();
		obj.add("Green");
		obj.add("Yellow");
		obj.add("Red");
		obj.add("Black");
		System.out.println(obj);
		
		Set<String> obj1=new TreeSet<String>();
		obj1.add("Apple");
		obj1.add("Orange");
		obj1.add("Grape");
		obj1.add("Guava");
		System.out.println(obj1);
		System.out.println("Add All:");
        obj.addAll(obj1);
        System.out.println(obj);
        System.out.println(obj1);
        System.out.println("Contains All:");
        System.out.println(obj.containsAll(obj1));
        System.out.println("Remove All:");
        obj.removeAll(obj1);
        System.out.println(obj);
	}

}
