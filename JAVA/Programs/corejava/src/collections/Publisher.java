package collections;

public class Publisher implements Comparable<Publisher>{
	
	int pubid;
	String pubname;
	
	public Publisher() {

	}

	public Publisher(int pubid, String pubname) {
		super();
		this.pubid = pubid;
		this.pubname = pubname;
	}

	public int getPubid() {
		return pubid;
	}

	public void setPubid(int pubid) {
		this.pubid = pubid;
	}

	public String getPubname() {
		return pubname;
	}

	public void setPubname(String pubname) {
		this.pubname = pubname;
	}

	@Override
	public String toString() {
		return "Publisher [pubid=" + pubid + ", pubname=" + pubname + "]";
	}

	@Override
	public int compareTo(Publisher o) {
		// TODO Auto-generated method stub
		return this.pubname.compareTo(o.pubname);
	}
	
}
