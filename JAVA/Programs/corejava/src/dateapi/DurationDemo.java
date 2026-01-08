package dateapi;

import java.time.Duration;
import java.time.LocalTime;

public class DurationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime l1 = LocalTime.of(10, 30, 50);
		LocalTime l2 = LocalTime.of(12, 45, 55);
		
		Duration d = Duration.between(l1, l2);
		System.out.println("Duration between l1 and l2: "+d);
		System.out.println("Duration in Hours: "+d.toHours());
		System.out.println("Duration in Minutes: "+d.toMinutes());
		System.out.println("Duration in Seconds: "+d.getSeconds());

	}

}
