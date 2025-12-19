package corejava;

import java.util.Scanner;

public class MonthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// switch is used to calculate the bill
		System.out.println("Enter the Month numner(1-12)");
		int month = sc.nextInt();
		
		String monthName = switch(month) {
		case 1 -> "January";
		case 2 -> "February";
		case 3 -> "March";
		case 4 -> "April";
		case 5 -> "May";
		case 6 -> "June";
		case 7 -> "July";
		case 8 -> "August";
		case 9 -> "September";
		case 10 -> "October";
		case 11 -> "November";
		case 12 -> "December";
		default -> "Invalid month";
        };
        
        System.out.println("Month name: " + monthName);
	}
	

	

}
