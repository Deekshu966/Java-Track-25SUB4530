package dateapi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatter = 
				DateTimeFormatter.ofPattern("yyyy dd MMMM");
		String formattedDate = today.format(formatter);
		System.out.println("Formatted Date: "+formattedDate);
		//LocalDate ld = LocalDate.of(formattedDate);
		
		DateTimeFormatter formatter2 = 
				DateTimeFormatter.ofPattern("HH:mm:ss a");
	    String formattedTime = currentTime.format(formatter2);
	    System.out.println("Formatted Time: "+formattedTime);

	}

}
