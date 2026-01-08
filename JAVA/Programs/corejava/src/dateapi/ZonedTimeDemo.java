package dateapi;

import java.time.ZonedDateTime;

public class ZonedTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZonedDateTime india = ZonedDateTime.now();
		System.out.println("Current date and time with timezone: "+india);
		
		ZonedDateTime us = 
				ZonedDateTime.now(java.time.ZoneId.of("America/New_York"));
		System.out.println("Current date and time in US: "+us);
		
		ZonedDateTime aus = 
				ZonedDateTime.now(java.time.ZoneId.of("Australia/Sydney"));
		
		System.out.println("Current date and time in Australia: "+aus);

	}

}
