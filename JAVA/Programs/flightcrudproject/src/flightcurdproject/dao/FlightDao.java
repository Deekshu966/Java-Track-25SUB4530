package flightcurdproject.dao;

import java.util.List;

import flightcrudproject.model.Flight;

public interface FlightDao {
	
	public boolean addFlight(Flight flight);
	public List<Flight> searchFlights(String source, String destination);
	public int deleteFlight(int flightid);
	public List<Flight> getAllFlights();
	public boolean updateFlight(int flightid, Flight flight);

}