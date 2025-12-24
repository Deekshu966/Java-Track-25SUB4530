package corejava;

import java.util.Scanner;

public class SumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// switch is used to calculate the bill
		System.out.println("Enter number to which you want to print even numbers:");
		int n = sc.nextInt(); // n =10
		int sum = 0;
		for (int i =1 ;i<=n;i++) {
			sum = sum + i;
		}
		System.out.println("Sum of first " + n + " numbers is: " + sum);
	}

}
