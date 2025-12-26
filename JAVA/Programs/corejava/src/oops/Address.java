package oops;

public class Address extends Object{
	
	int dno;
	String street;
	String city;
	String pin;
	Address(){
		dno=10;
        street="MG Road";
        city="Bangalore";
        pin="560001";
    }
	@Override
	public String toString() {
		return "Address [dno=" + dno + ", street=" + street + ", city=" + city + ", pin=" + pin + "]";
	}
	
	
}
