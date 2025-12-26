package oops;

public class Person {
	
	int pid;
	String name;
	Address address; // HAS-A relationship

	Person(int pid, String name, Address address) {
		this.pid = pid;
		this.name = name;
		this.address=address;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
