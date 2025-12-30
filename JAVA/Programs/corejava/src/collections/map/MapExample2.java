package collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<Integer> list1 = new ArrayList<>();
		list1.add(100);
		list1.add(87);
		list1.add(90);
		list1.add(78);
		List<Integer> list2 = new ArrayList<>();
		list2.add(76);
		list2.add(84);
		list2.add(91);
		list2.add(79);
		
		Map<Integer,List> profits = new HashMap<>();
		
		profits.put(2023,  list1);
		profits.put(2024,  list2);
		
		System.out.println("Profits Map: " + profits);
		
		for (Map.Entry<Integer, List> e : profits.entrySet()) {
			System.out.println("Key: " + e.getKey());
			List<Integer> profitsList = e.getValue();
			int i =1;
			for (Integer p : profitsList) {
				System.out.println(" Quarter - " + i +" is "+p);
				i++;
			}
			
		}
		

	}

}
