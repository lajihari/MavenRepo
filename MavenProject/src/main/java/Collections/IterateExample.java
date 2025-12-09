package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> obj=new HashSet<String>();
		obj.add("Green");
		obj.add("Yellow");
		obj.add("Red");
		obj.add("Black");
		System.out.println(obj);
		//Iterator<String> i=obj.iterator();
		/*while(i.hasNext())
		{
			System.out.println(i.next());
		}
		i.remove();
		System.out.println(obj);*/
		for(String c:obj)
		{
			System.out.println(c);
		}
	}

}
