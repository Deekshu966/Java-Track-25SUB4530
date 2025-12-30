package collections.usecases;
/*
 * A training institute records course registration from students during online enrollment.

Students may accidently register for the same course multiple times.

The system must:

1. Store all registration (including duplicates)
2. remove duplicate course entires
3. display unique courses
4. preserve insertion order 

 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CourseRegistrationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Course Registration is Open!");
		List<String> courses = new ArrayList<>();
		courses.add("Java Programming");
		courses.add("Data Structures");
		courses.add("Web Development");
		courses.add("Database Management");
		courses.add("Java Programming");
		courses.add("Web Development");
		System.out.println("Available Courses:");
		for (String course : courses) {
			System.out.println(course);
		}
		
		Set<String> uniqueCourses = new HashSet<>(courses);
		System.out.println("\nUnique Courses Registered:");
		for (String course : uniqueCourses) {
			System.out.println(course);
		}

		
		Set<String> orderCourses = new LinkedHashSet<>(courses);
		System.out.println("\nUnique Courses Registered in same order:");
		for (String course : orderCourses) {
			System.out.println(course);
		}
		
		Set<String> sortedCourses = new TreeSet<>(courses);
		System.out.println("\nUnique Courses Registered in sorted order:");
		for (String course : sortedCourses) {
			System.out.println(course);
		}
	}

}
