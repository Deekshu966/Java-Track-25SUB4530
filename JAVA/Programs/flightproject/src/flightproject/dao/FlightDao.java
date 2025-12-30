package flightproject.dao;

import java.util.List;

import flightproject.model.Flight;

public interface FlightDao {
	
	public int addFlight(Flight flight);
	public List<Flight> searchFlights(String source, String destination);
	public void deleteFlight(int flightid);
	public List<Flight> getAllFlights();
	public boolean updateFlight(int flightid, Flight flight);

}
