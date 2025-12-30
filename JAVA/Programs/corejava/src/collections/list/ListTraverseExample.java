package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTraverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		System.out.println("Numbers List: " + numbers);
		numbers.forEach(num -> {
			int factorial = 1;
			for (int i = 1; i <= num; i++) 
                factorial *= i;
             System.out.println("Factorial of " + num + " is: " + factorial);
		});
		
		// forEach method will take a consumer as an argument
		
		
		//List<String> list2 = new ArrayList();
		List<String> list2 = new LinkedList();
		list2.add("Swedan");
		list2.add("Norway");
		list2.add("Swiss");
		list2.add("Germany");
		System.out.println("List 2: " + list2); // displays as a string
		
		
		// Traversing using for loop
		System.out.println("Traversing using for loop:");
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		
		// Traversing using enhanced for  loop
		System.out.println("Traversing using enchanced for loop:");
		for (String country : list2) {
			System.out.println(country);
		}
		
		
		// Traversing using forEach method
		
		System.out.println("Traversing using forEach method:");
		list2.forEach(country -> System.out.println(country));
		
		System.out.println("Traversing using Iterator:");
		Iterator itr = list2.iterator(); // we can traverse only in forward
		// direction
		while(itr.hasNext())
			System.out.println(itr.next());
		
		//System.out.println(itr.next()); // Exception runtime errro
		
		// list iterator can traverse both in forward and backward
		ListIterator ltr = list2.listIterator();
		// next(), hasNext(), previous(), hasPrevious()
		
		System.out.println("Traversing using ListIterator in forward direction:");
		while (ltr.hasNext())
			System.out.println(ltr.next());
		
		System.out.println("Traversing using ListIterator in backward direction:");
		while (ltr.hasPrevious())
			System.out.println(ltr.previous());
		
		//System.out.println(ltr.previous()); // Exception runtime error

	}

}
