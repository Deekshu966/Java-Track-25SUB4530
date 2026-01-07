package functionalinterfaces;

import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer,Integer,Integer> f = (a,b) -> a+b;
		BiFunction<String,String,Integer> f2 = (s1,s2) -> s1.length()+s2.length();
		BiFunction<Integer,Integer,Integer> f3 = (length,breadth) -> length*breadth;
		
		System.out.println("Sum: " + f.apply(10, 20)); // 30
		System.out.println("Total length of both strings: " + f2.apply("hello", "world")); // 10
		System.out.println("Area of rectangle: " + f3.apply(10, 20)); // 200

	}

}
