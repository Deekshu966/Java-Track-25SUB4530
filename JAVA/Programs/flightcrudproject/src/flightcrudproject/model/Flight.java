package flightcrudproject.model;
public class Flight {
	
	int flightid;
	String provider;
	String source;
	String destination;
	
	public Flight() {

	}
	
	public Flight(int flightid, String provider, String source, String destination) {
		super();
		this.flightid = flightid;
		this.provider = provider;
		this.source = source;
		this.destination = destination;
	}

	public int getFlightid() {
		return flightid;
	}

	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Flight [flightid=" + flightid + ", provider=" + provider + ", source=" + source + ", destination="
				+ destination + "]";
	}
	

}
