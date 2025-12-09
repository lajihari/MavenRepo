package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> a=new ArrayList();//generic collection
		a.add(2);
		a.add(4);
        List<String> b=new ArrayList();
        b.add("hi");
        b.add("hello");
        System.out.println(a);
        System.out.println(b);
        List<String> fruit=new LinkedList();
        fruit.add("Apple");
        fruit.add("Orange");
        System.out.println(fruit);
        
	}

}
