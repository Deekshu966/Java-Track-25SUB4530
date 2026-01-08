package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TerminalMethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(1,2, 3, 4,5, 7, 9,10);
		//Optional<Integer> n= numbers.stream().findFirst();
		Optional<Integer> n= numbers.stream().findAny();
		System.out.println("First Element: " + n.get());
		
		numbers.stream()
		       .filter(x->x%2==0)
		      // .findFirst()
		       .findAny()
		      .ifPresent(x->System.out.println("First Even Number: " + x));
		
		boolean iseven = numbers.stream().anyMatch(n1 -> n1%10==0);
		System.out.println("Is there any number which is divisible by 10? " + iseven);
		List<Integer> data =List.of(10,20,30,40,50);

		boolean isdivisible = data.stream().allMatch(x ->x%10==0);
		System.out.println("Are all numbers divisible by 10? " + isdivisible);
		
		boolean noneDivisible = data.stream().noneMatch(x -> x%7==0);
		System.out.println("Are there no numbers divisible by 7? " + noneDivisible);
	}

}
