package samples;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseRegistration cr = new CourseRegistration();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of courses to register:");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter course ID to register:");
			int courseId = scanner.nextInt();
			cr.addCourseId(courseId);
		}
		
		System.out.println("Registered course IDs: " + cr.getRegisteredCourses());
	
	}

}
