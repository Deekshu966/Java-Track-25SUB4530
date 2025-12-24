package corejava;
import java.util.Scanner;
public class UpdateArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int [] numbers = new int[10];
		numbers[0]= 10;
		numbers[1]= 20;
		numbers[2]= 30;
		numbers[3]= 40;
		
		System.out.println("Enter the index to update (0-9):");
		int indexToUpdate = sc.nextInt();
		System.out.println("Enter the new value:");
		int newValue = sc.nextInt();
		
		if (indexToUpdate < 0 || indexToUpdate >= numbers.length) {
			System.out.println("Invalid index. No update performed.");
		} else {
			numbers[indexToUpdate] = newValue;

			System.out.println("Array after update:");
			for (int num : numbers) {
				System.out.print(num + " ");
			}
		}

	}

}
