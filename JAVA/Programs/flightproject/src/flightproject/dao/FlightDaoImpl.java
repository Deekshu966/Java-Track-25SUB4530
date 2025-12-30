package flightproject.dao;

import java.util.ArrayList;
import java.util.List;

import flightproject.model.Flight;

public class FlightDaoImpl implements FlightDao {
	
	List<Flight> flights;
	
	public FlightDaoImpl() {
		flights = new ArrayList<>();
	}

	@Override
	public int addFlight(Flight flight) {
		// TODO Auto-generated method stub
		flights.add(flight);
		return 0;
	}

	@Override
	public List<Flight> searchFlights(String source, String destination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteFlight(int flightid) {
		// TODO Auto-generated method stub
		flights.removeIf(f -> f.getFlightid() == flightid);
	}

	@Override
	public List<Flight> getAllFlights() {
		// TODO Auto-generated method stub
		return flights;
	}

	@Override
	public boolean updateFlight(int flightid, Flight flight) {
		// TODO Auto-generated method stub
		
		//return flights.set(0, flight)
		return false;
	}

}
