package functionalinterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer <Integer,Integer> bc = 
				(a,b) -> System.out.println("Sum: " + (a+b));
				
		BiConsumer<String, String> bc2 = 
				(s1, s2) -> System.out.println("Concatenated String: " + (s1 + s2));
				
		bc.accept(10, 20); // Sum: 30
		bc2.accept("Hello ", "World!"); // Concatenated String: Hello World!

	}

}
