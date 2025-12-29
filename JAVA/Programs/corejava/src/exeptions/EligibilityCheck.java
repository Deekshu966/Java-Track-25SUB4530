package exeptions;

import java.util.Scanner;

public class EligibilityCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt(); //
		if (age < 18)
			System.out.println("Not eligible to vote");
		else
            System.out.println("Eligible to vote");

	}

}
