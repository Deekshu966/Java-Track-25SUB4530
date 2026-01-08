package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List ar = new ArrayList();
		//List ar = new LinkedList();
		
		ar.add(100);
		ar.add(200);
		ar.add("India");
		ar.add("China");
		ar.add(3.12345f);
		ar.add(false);
		ar.add("India");
		ar.add(3.12345f);
		ar.add(null);
		System.out.println(ar);
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		ar.add(3, "America");
		ar.set(2, "Germany");
		System.out.println(ar);
		
	}

}
