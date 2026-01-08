package collections.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StudentRegistration {
	public static void main(String args[]) {
		
		HashMap<String,Set> studentReg = new HashMap<>();
		//Add student registrations
		Set<String> courses1 = Set.of("Math", "Physics", "Chemistry");
		Set<String> courses2 = Set.of("Histroy", "Economics", "Commerce");
		
		studentReg.put("Anil", courses1);
		studentReg.put("Bala", courses2);
		
		//Display student registrations
		for (var entry : studentReg.entrySet()) {
			System.out.println("Student: " + entry.getKey() + ", Courses: " + entry.getValue());
		}
		
	}

}
