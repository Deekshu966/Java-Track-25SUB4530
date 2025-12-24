package corejava;
import java.util.Scanner;
public class ScannerExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.nextLine();  // read string with blank spaces
		System.out.println("Enter your age:");
		int age = sc.nextInt();		// read the integer value
		System.out.println("Your BMI is calculated as:");
		float bmi = sc.nextFloat(); // read the decimal values
		
		System.out.println("Are you bachelor");
		boolean isBachelor = sc.nextBoolean(); // read the boolean value
		
		System.out.println("BMI: " + bmi);
		System.out.println("Hello, " + name + "!");
		System.out.println("You are " + age + " years old.");
		System.out.println("Bachelor status: " + isBachelor);
		

	}

}
