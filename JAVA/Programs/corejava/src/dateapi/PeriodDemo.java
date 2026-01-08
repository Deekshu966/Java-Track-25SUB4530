package dateapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		LocalDate dob = LocalDate.of(1979, 1, 19);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("Today is: "+ldt);
		Period age = Period.between(dob, today);
		System.out.println(age);
		//System.out.println("Age is: "+age.getYears()+" years "+age.getMonths()+" months "+age.getDays()+" days");
		System.out.println("Years : "+age.getYears());
		System.out.println("Months : "+age.getMonths());
		System.out.println("Days : "+age.getDays());
		
		Period p = age.plusYears(3);
		System.out.println("After Adding 3 years: "+p);
		

	}

}
