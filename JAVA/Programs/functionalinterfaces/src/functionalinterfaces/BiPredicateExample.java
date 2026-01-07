package functionalinterfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer,Integer> bp = (a,b) -> (a+b)%2==0;
		BiPredicate<String,String> bp2 = (s1,s2) -> s1.length()==s2.length();
		System.out.println("Is sum even? " + bp.test(10, 20)); // true
		System.out.println("Is sum even? " + bp.test(10, 15)); // false
		System.out.println("Is both string lengths are equal - "+ bp2.test("hello", "world")); // true
		System.out.println("Is both string lengths are equal - "+ bp2.test("hello", "javaworld")); // false

	}

}
