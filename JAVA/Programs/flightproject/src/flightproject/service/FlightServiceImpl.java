package flightproject.service;

import java.util.List;

import flightproject.dao.FlightDaoImpl;
import flightproject.model.Flight;

public class FlightServiceImpl implements FlightService {
	
	FlightDaoImpl flightDao;
	
	public FlightServiceImpl() {
		flightDao = new FlightDaoImpl();
	}

	@Override
	public boolean addFlight(Flight flight) {
		// TODO Auto-generated method stub
		return flightDao.addFlight(flight);
	}

	@Override
	public List<Flight> searchFlights(String source, String destination) {
		// TODO Auto-generated method stub
		return flightDao.searchFlights(source, destination);
	}

	@Override
	public void deleteFlight(int flightid) {
		// TODO Auto-generated method stub
		flightDao.deleteFlight(flightid);
	}

	@Override
	public List<Flight> getAllFlights() {
		// TODO Auto-generated method stub
		return flightDao.getAllFlights();
	}

	@Override
	public boolean updateFlight(int flightid, Flight flight) {
		// TODO Auto-generated method stub
		return flightDao.updateFlight(flightid, flight);
	}

}
