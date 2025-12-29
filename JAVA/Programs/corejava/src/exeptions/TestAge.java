package exeptions;

import java.util.Scanner;

public class TestAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt(); //
		Vote vote = new Vote();
		
		try {
			vote.checkAge(age);
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		catch (NegativeAgeException e) {
			System.out.println(e.getMessage());
		}

	}

}
