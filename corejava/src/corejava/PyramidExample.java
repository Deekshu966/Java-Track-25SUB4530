package corejava;

import java.util.Scanner;
public class PyramidExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows for the pyramid:");
		int rows = sc.nextInt(); // 4 
		
		for (int i = 1; i <= rows; i++) {
			// Print spaces
			
			  for (int j = rows; j > i; j--) { 
				  System.out.print(" "); 
			 }
			 
			// Print stars
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			// Move to the next line after each row
			System.out.println();
		}
	}

}
