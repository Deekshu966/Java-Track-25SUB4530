package corejava;

import java.util.Scanner;
//#include<stdio.h>

public class PositiveOrNegativeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		if (number >= 0) {
			System.out.println(number + " is a Positive number.");
		} else {
			System.out.println(number + " is a Negative number.");
		}

	}

}
