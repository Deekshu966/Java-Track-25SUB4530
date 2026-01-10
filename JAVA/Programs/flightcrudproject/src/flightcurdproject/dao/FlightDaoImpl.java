package flightcurdproject.dao;

import java.util.ArrayList;
import java.util.List;

import flightcrudproject.model.Flight;



public class FlightDaoImpl implements FlightDao {
	
	List<Flight> flights;
	
	public FlightDaoImpl() {
		flights = new ArrayList<>();
	}

	@Override
	public boolean addFlight(Flight flight) {
		// TODO Auto-generated method stub
		return flights.add(flight);
		
	}

	@Override
	public List<Flight> searchFlights(String source, String destination) {
		// TODO Auto-generated method stub
		List<Flight> result	= new ArrayList<>();
		for (Flight f : flights) {
			if (f.getSource().equalsIgnoreCase(source) && f.getDestination().equalsIgnoreCase(destination)) {
				result.add(f);
				
			}
		}
		return result;
	}

	@Override
	public int deleteFlight(int flightid) {
		// TODO Auto-generated method stub
		boolean flag = flights.removeIf(f -> f.getFlightid() == flightid);
		if(flag)
			return 1;
		else
			return 0;
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
		
		for (int i = 0; i < flights.size(); i++) {
			if (flights.get(i).getFlightid() == flightid) {
				flights.set(i, flight);
				return true;
			}
		}
		return false;
	}

}