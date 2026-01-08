package dateapi;

import java.time.LocalDate;

public class LocalDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate ld = LocalDate.now();
		LocalDate ld3 = LocalDate.now();
		System.out.println("Current Date: "+ld);
		
		LocalDate ld1 = LocalDate.of(2020, 5, 15);
		System.out.println("Specified Date: "+ld1);
		
		System.out.println("Year -"+ld.getYear());
		System.out.println("Month -"+ld.getMonth());
		System.out.println("Day -"+ld.getDayOfMonth());
		System.out.println("Day of Week -"+ld.getDayOfWeek());
		System.out.println("Day of Year -"+ld.getDayOfYear());
		System.out.println("Is Leap Year -"+ld.isLeapYear());
		System.out.println("Length of Month - " +ld.lengthOfMonth());
		
		
		System.out.println("After Adding 2 Years: "+ld.plusYears(2));
		System.out.println("After Adding 3 Months: "+ld.plusMonths(3));
		System.out.println("After Adding 10 Days: "+ld.plusDays(10));
		
		System.out.println("After Subtracting 2 Years: "+ld.minusYears(2));
		System.out.println("After Subtracting 3 Months: "+ld.minusMonths(3));
		System.out.println("After Subtracting 10 Days: "+ld.minusDays(10));
		
		// Comparision Methods
		System.out.println("Is ld equal to ld1? " + ld.equals(ld3));
		System.out.println("Is ld before ld1? " + ld.isBefore(ld1)); // false
		System.out.println("Is ld after ld1? " + ld.isAfter(ld1)); //True
		
		

	}

}
