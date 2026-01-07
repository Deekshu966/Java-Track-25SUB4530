package functionalinterfaces;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Student> s = student -> {
			System.out.println("ID: " + student.id);
			System.out.println("Name: " + student.name);
			System.out.println("Total: " + student.total);
		};
		
		Consumer<Integer> c = n -> {
			int fact = 1;
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial: " + fact);
		};
		
		c.accept(5);
		Student s1 = new Student(101, "Alice", 700);
		s.accept(s1);

	}

}
