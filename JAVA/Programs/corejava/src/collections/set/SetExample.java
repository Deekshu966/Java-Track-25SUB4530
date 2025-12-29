package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<>();
		set.add(10);  //10001
		set.add(25);
		set.add(15);
		set.add(10);  //10001
		set.add(null);
		set.add(30);
		set.add(null);
		System.out.println(set);
		
		Set<Integer> lhs = new LinkedHashSet<>();
		lhs.add(10);  //10001
		lhs.add(25);
		lhs.add(15);
		lhs.add(10);  //10001
		lhs.add(null);
		lhs.add(30);
		lhs.add(null);
		System.out.println(lhs);

		Set<String> names = new TreeSet<>();
		names.add("Gopi");
		names.add("Arun");
		names.add("Balaji");
		names.add("Farhan");
		names.add("Charlie");
		names.add("Zebran");
		names.add("Eshan");
		names.add("Balaji");
		System.out.println(names);
		
		
		
	}

}
