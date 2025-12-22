package corejava;
import java.util.Scanner;
public class ArrayDeleteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int [] numbers = new int[10];
		numbers[0]= 10;
		numbers[1]= 20;
		numbers[2]= 30;
		numbers[3]= 40;
		
		System.out.println("Enter the index to delete (0-9):");
		int indexToDelete = sc.nextInt();
		
		if (indexToDelete < 0 || indexToDelete >= numbers.length) {
			System.out.println("Invalid index. No deletion performed.");
		} else {
			// Shift elements to the left from the index to delete
			for (int i = indexToDelete; i < numbers.length - 1; i++) {
				numbers[i] = numbers[i + 1];
			}
			// Optional: Set the last element to zero or any default value
			numbers[numbers.length - 1] = 0;

			System.out.println("Array after deletion:");
			for (int num : numbers) {
				System.out.print(num + " ");
			}
		}
		
		

	}

}
