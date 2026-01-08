package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> odd = new ArrayList<>();
		List<Integer> even = new ArrayList<>();

		for (int n : numbers) {
			if (n % 2 == 0)
				even.add(n);
			else
				odd.add(n);
		}
		System.out.println("Odd Numbers: " + odd);
		System.out.println("Even Numbers: " + even);
		
		Predicate<Integer> p = x -> x%2==0;
		Function<Integer,Integer> f= x -> x+1;
		List<Integer> even1 = numbers.stream()
			    .filter(x -> x%2==0)
		         .collect(Collectors.toList());
		
		System.out.println("Even Numbers using Streams: " + even1);
		
		List<Integer> result = numbers.stream()
			       .map(x -> x+1)
			       .collect(Collectors.toList());

		System.out.println("Incremented by 1 using Streams: " + result);
		
		List<Integer> data = numbers.stream()
   			    					.filter(p)
   			    					.map(f)
   			    					.collect(Collectors.toList());
		System.out.println("Even Numbers Incremented by 1 using Predicate and Function: " + data);


	}

}
