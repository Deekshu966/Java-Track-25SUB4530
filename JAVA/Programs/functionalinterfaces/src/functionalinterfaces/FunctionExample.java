package functionalinterfaces;

import java.util.function.Function;

class Student{
	int id;
	String name;
	int total;
	String grade;

	public Student(int id, String name, int total) {
		super();
		this.id = id;
		this.name = name;
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", total=" + total + ", grade=" + grade + "]";
	}

	
	
}

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Student,Student> f5 = s -> {
			switch(s.getTotal()) {
			case 900,800 -> s.grade="Excellent";
			case 700 -> s.grade="Good";
			case 600 -> s.grade="Average";
			default -> s.grade="Poor";
			}
			return s;
		};
		Function<Student,Integer> f4 = s -> s.getTotal();
		Function<Integer,Integer> f1 = (a) -> a*a; // 25
		Function<Integer,Integer> f6 = n -> n/2; // if 10 --> 5
		Function<Integer,Integer> f2 = x -> {
			int f=1;
			for(int i=1;i<=x;i++) {
                f=f*i;
            }
			return f;
		};
		
		System.out.println("Square: " + f1.apply(5)); // 25
		System.out.println("Factorial: " + f2.apply(5));// factorial
		
		Student s = new Student(101, "Alice", 700);
		int totalMarks = f4.apply(s);
		System.out.println("Total Marks of " + s.getName() + ": " + totalMarks);
		System.out.println("The grade is : "+f5.apply(s));
		
		// Combining the Functions
		
		System.out.println(f6.andThen(f1).apply(5));
		System.out.println(f6.compose(f1).apply(5));
		
	}

}
