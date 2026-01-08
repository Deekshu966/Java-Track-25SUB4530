package dateapi;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime lt = LocalTime.now();
		System.out.println("Current Local Time: "+lt);
		LocalTime lt1 = LocalTime.of(14, 30, 45);
		System.out.println("Specific Local Time: "+lt1);
		
		System.out.println("Hour - "+lt.getHour());
		System.out.println("Minute - "+lt.getMinute());
		System.out.println("Second - "+lt.getSecond());
		System.out.println("NanoSecond - "+lt.getNano());
		
		LocalTime lt2 = lt.plusHours(2);
		System.out.println("After Adding 2 Hours: "+lt2);
		LocalTime lt3 = lt.minusMinutes(15);
		System.out.println("After Subtracting 15 Minutes: "+lt3);
		System.out.println("After adding 200 seconds "+lt.plusSeconds(200));
		
		// Comparision Methods
		System.out.println("Is lt equal to lt1? " + lt.equals(lt1)); // false
		System.out.println("Is lt before lt1? " + lt.isBefore(lt1)); // false
		System.out.println("Is lt after lt1? " + lt.isAfter(lt1));// true
		

	}

}
