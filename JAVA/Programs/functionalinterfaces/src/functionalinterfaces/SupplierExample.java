package functionalinterfaces;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> s = () -> Math.random();
		System.out.println("Random number1: " + s.get());
		System.out.println("Random number2: " + s.get());

	}

}
