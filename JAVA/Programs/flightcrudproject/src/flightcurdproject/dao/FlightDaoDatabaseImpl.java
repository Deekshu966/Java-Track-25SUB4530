package flightcurdproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import flightcrudproject.model.Flight;
import flightcrudproject.utils.FlightDbUtils;

public class FlightDaoDatabaseImpl implements FlightDao {

	@Override
	public boolean addFlight(Flight flight) {
		// TODO Auto-generated method stub
		Connection con = FlightDbUtils.getConnection();
		PreparedStatement pst = null;
		String sql = "insert into flights values(?,?,?,?)";
		int rows = 0;
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, flight.getFlightid());
			pst.setString(2, flight.getProvider());
			pst.setString(3, flight.getSource());
			pst.setString(4, flight.getDestination());
			rows = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (rows > 0)
			return true;
		else
			return false;
	}

	@Override
	public List<Flight> searchFlights(String source, String destination) {
		// TODO Auto-generated method stub
		Connection con = FlightDbUtils.getConnection();
		PreparedStatement pst = null;
		String sql = "select * from flights where source=? and destination=?";
		List<Flight> flights = new ArrayList<>();
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, source);
			pst.setString(2, destination);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Flight flight = new Flight(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				flights.add(flight);
			}
			return flights;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public int deleteFlight(int flightid) {
		// TODO Auto-generated method stub
		Connection con = FlightDbUtils.getConnection();
		String sql = "delete from flights where flightid=?";
		PreparedStatement pst = null;
		int k =0;
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, flightid);
			k=pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return k;

	}

	@Override
	public List<Flight> getAllFlights() {
		// TODO Auto-generated method stub
		Connection con = FlightDbUtils.getConnection();
		String sql = "select * from flights";
		List<Flight> flights = new ArrayList<>();
		Statement st = null;
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				Flight flight = new Flight(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				flights.add(flight);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flights;
	}

	@Override
	public boolean updateFlight(int flightid, Flight flight) {
		// TODO Auto-generated method stub
		return false;
	}
}
