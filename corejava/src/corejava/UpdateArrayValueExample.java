package corejava;

import java.util.Scanner;

public class UpdateArrayValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[10];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30; // replace with 500
		numbers[3] = 40;

		System.out.println("Enter the Value to be updated");
		int valueToUpdate = sc.nextInt();

		System.out.println("Enter the new value:");
		int newValue = sc.nextInt();

		boolean isFound = false;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == valueToUpdate) {
				numbers[i] = newValue;
				isFound = true;
				break;
			}
		}

			if (isFound) {
				System.out.println("Array after update:");
				for (int num : numbers) {
					System.out.print(num + " ");
				}
			} else
				System.out.println("Value not found in the array. No update performed.");
		}
	}


