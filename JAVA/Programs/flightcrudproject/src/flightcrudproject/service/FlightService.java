package flightcrudproject.service;

import java.util.List;

import flightcrudproject.model.Flight;



public interface FlightService {
	
	public boolean addFlight(Flight flight);
	public List<Flight> searchFlights(String source, String destination);
	public int deleteFlight(int flightid);
	public List<Flight> getAllFlights();
	public boolean updateFlight(int flightid, Flight flight);
	
}
