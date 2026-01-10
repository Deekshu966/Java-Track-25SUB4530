package flightcrudproject.service;


import java.util.List;

import flightcrudproject.model.Flight;
import flightcurdproject.dao.FlightDaoDatabaseImpl;
import flightcurdproject.dao.FlightDaoImpl;



public class FlightServiceImpl implements FlightService {
	
	FlightDaoDatabaseImpl flightDao;
	
	public FlightServiceImpl() {
		flightDao = new FlightDaoDatabaseImpl();
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
	public int deleteFlight(int flightid) {
		// TODO Auto-generated method stub
		return flightDao.deleteFlight(flightid);
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