package corejava;

import java.util.Scanner;

public class ArraySearchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[10];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30; // replace with 500
		numbers[3] = 40;
		boolean isFound=false;
		int index =0;
		System.out.println("Enter the Value to search");
		int valueToSearch = sc.nextInt();
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == valueToSearch) {
				isFound=true;
				index=i;
				break;
			}
		}
		
		if(isFound) 
            System.out.println("Value found at index: " + index);
        else
            System.out.println("Value not found in the array.");

	}

}
