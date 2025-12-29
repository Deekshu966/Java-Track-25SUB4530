package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(21);
		list.add(13);
		list.add(4);
		list.add(15);
		
		Collections.sort(list); 
		//Collections.sort(list,(a,b)-> -(a-b));
		// sorts the llist and stores the result 
		// in the same list
		Collections.reverse(list);
		System.out.println("Sorted List in desc order: " + list);
		
		Collections.shuffle(list);
		System.out.println("Shuffled List: " + list);
		
		System.out.println("The maximum element is "+Collections.max(list));
		System.out.println("The maximum element is "+Collections.min(list));

		list.add(40);
		System.out.println("List after adding 40: " + list);
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(21);
		list1.add(13);
		list1.add(4);
		list1.add(15);
		System.out.println("List1: " + list1);
		List list2 = Collections.unmodifiableList(list1);
		//list2.add(100);
		System.out.println("List2: " + list2);
		int index = Collections.binarySearch(list1, 139);
		System.out.println("Index of 13 is: " + index);
		if(index>=0)
			System.out.println("Element found at index: " + index);
		else
			System.out.println("Element not found");
		
		
		

	}

}
