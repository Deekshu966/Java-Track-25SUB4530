package collections.usecases;
/*
 * Student Marks Management
-------------------------

A faculty wants to store student marks for a subject

Requriments:

1. Marks can be duplicate ( many students can get same marks)
2. Order is imp ( marks entered in exam order)
3. Ability to Add marks, display all marks, update marks, cal total average

 */
import java.util.ArrayList;
import java.util.List;

public class StudentsMarksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> marks = new ArrayList<>();
		marks.add(85);
		marks.add(92);
		marks.add(76);
		marks.add(88);
		marks.add(95);
		marks.add(88);
		System.out.println("Students Marks: " + marks);
		
		// update the marks of the student at index 2
		marks.set(2, 80);
		
		System.out.println("After updating marks at index 2: " + marks);
		
		// calculate the average marks
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		
		double average = sum / (double) marks.size();
		System.out.println("Sum of Marks: " + sum);
		System.out.println("Average Marks: " + average);
		
		

	}

}
