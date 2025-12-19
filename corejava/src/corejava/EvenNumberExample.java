package corejava;

import java.util.Scanner;

public class EvenNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// switch is used to calculate the bill
		System.out.println("Enter number to which you want to print even numbers:");
		int n = sc.nextInt();  // n =10
		
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
