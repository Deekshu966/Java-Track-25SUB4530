package flightcrudproject.controller;

import java.util.List;
import java.util.Scanner;

import flightcrudproject.model.Flight;
import flightcrudproject.service.FlightServiceImpl;

public class FlightController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		FlightServiceImpl flightService = new FlightServiceImpl();

		int choice = 0;
		while (true) {
			System.out.println("1. Add Flight");
			System.out.println("2. Delete Flight");
			System.out.println("3. Show All Flights");
			System.out.println("4. Update Flight");
			System.out.println("5. Search Flights");
			System.out.println("6. Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter flight Id");
				int flightid = sc.nextInt();
				System.out.println("Enter the provider");
				String provider = sc.next();
				System.out.println("Enter the source");
				String source = sc.next();
				System.out.println("Enter the destination");
				String destination = sc.next();
				Flight flight = new Flight(flightid, provider, source, destination);
				boolean isadded = flightService.addFlight(flight);
				if (isadded)
					System.out.println("Flight Added successfully...!");
				else
					System.out.println("Not Added..!");
				break;
			case 2:
				System.out.println("Enter flight Id");
				flightid = sc.nextInt();
				int k = flightService.deleteFlight(flightid);
				if (k > 0)
					System.out.println("Flight Deleted..!");
				else
					System.out.println("Flight not Deleted..!");
				break;
			case 3:
				List<Flight> flights = flightService.getAllFlights();
				for (Flight f : flights)
					System.out.println(f);
				break;
			case 4:
				System.out.println("Enter flight Id to update");
				flightid = sc.nextInt();
				System.out.println("Enter the new provider ");
				provider = sc.next();
				System.out.println("Enter the new source");
				source = sc.next();
				System.out.println("Enter the new destination");
				destination = sc.next();
				flight = new Flight(flightid, provider, source, destination);
				boolean updated = flightService.updateFlight(flightid, flight);
				if (updated)
					System.out.println("Flight Details updated..!");
				else
					System.out.println("Flight details not updated..!");
				break;
			case 5:
				System.out.println("Enter the source");
				source = sc.next();
				System.out.println("Enter the destination");
				destination = sc.next();
				flights = flightService.searchFlights(source, destination);
				if (flights.isEmpty()) {
					System.out.println("No flights found..!");
					break;
				}
				for (Flight f : flights)
					System.out.println(f);
				break;
			case 6:
				break;

			}

		}
	}
}