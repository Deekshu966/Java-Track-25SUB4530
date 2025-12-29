package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<Integer> list3 = new ArrayList<>();
		List<Integer> list3 = new LinkedList<>();
		
		list3.add(10);
		list3.add(25);
		list3.add(48);
		list3.add(51);
		list3.add(16);
		
		for(int i =0;i<list3.size();i++) {
			if(list3.get(i)%5==0)
				list3.remove(list3.get(i));
		}
		
		System.out.println("List3 after removing elements divisible by 5: " + list3);
		
		List list1 = new ArrayList();
		list1.add("India");
		list1.add("China");
		list1.add("Japan");
		list1.add("America");
		System.out.println("List 1: " + list1);
		
		List list2 = new ArrayList();
		list2.add("Swedan");
		list2.add("Norway");
		list2.add("Swiss");
		list2.add("Germany");
		System.out.println("List 2: " + list2);
		
		list1.addAll(list2); // list1 = list1 + list2
		System.out.println("After adding List2 to List1: " + list1);
		System.out.println("Size of List1: " + list1.size());
		
		list1.remove("China");
		System.out.println("After removing China from List1: " + list1);
		
		list1.removeAll(list2);// remove all elements of list2 from list1
		System.out.println("After removing List2 from List1: " + list1);
		
		if (list1.contains("Germany") )
			System.out.println("India is present in List1");
		else
			System.out.println("India is not present in List1");
		
		System.out.println("Size of List1: " + list1.size());
		
		list2.remove(2);
		System.out.println("After removing element at index 2 from List2: " + list2);
		

		List<Integer> list4 = new ArrayList();
		list4.add(1);
		list4.add(4);
		list4.add(16);
		list4.add(9);
		list4.add(13);
		
		list4.removeIf(x -> x%4==0);
		System.out.println("List4 after removing elements divisible by 4: " + list4);
			
	
	}

}
