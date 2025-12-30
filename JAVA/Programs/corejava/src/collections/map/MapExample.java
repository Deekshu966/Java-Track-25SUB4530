package collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> states = new HashMap<>();
		states.put("KA", "Karnataka");
		states.put("TG",  "Telengana");
		states.put("TN", "Tamilnadu");
		System.out.println(states);
		
		states.put("KA", "Karnataka-New");
		System.out.println(states);

		System.out.println("Value for key TG: " + states.get("TG"));
		System.out.println("Value for key KA: " + states.get("KA"));
		
		states.remove("TN");
		
		System.out.println(states);
		
		if( states.containsKey("KA"))
			System.out.println("Given State is present");
		else
			System.out.println("Given state is not present");
		
		
		if( states.containsValue("Orrisa"))
			System.out.println("Telengana  is present");
		else
			System.out.println("Telengana state is not present");
		
		System.out.println("The size of states is "+ states.size());
		System.out.println("Keys of states: " + states.keySet());
		System.out.println("Values of states: " + states.values());
		System.out.println("Clearing all states");
		System.out.println("Is states map empty? " + states.isEmpty());
		
		for (Map.Entry<String, String> e : states.entrySet()) {
			System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
			
		}


	}

}
