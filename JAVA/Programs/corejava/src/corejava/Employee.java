package corejava;

public class Employee {
	
	int empid;
	String name;
	String department; // Instance Variables
	static String org="ABC Corp"; // Static Variable"
	/*
	Employee(){
		empid=1;
		name="Anil";
		department="IT";
	}
	*/
	Employee(int empid, String name, String department) {
		this.empid = empid;
		this.name = name;
		this.department = department;
	}
	
	Employee(int empid){
		this.empid = empid;
		this.name="General user";
		this.department="Not Assigned";
	}
	Employee(){
		this.empid=0;
		this.name="Default user";
		this.department="Not Assigned";
	}
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void display() {
		System.out.println("Employee ID: " + empid);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Department: " + department);
		System.out.println("Organization: " + org);
	}
	
	public static void test() {
		System.out.println("Static method in Employee class");
		System.out.println("Organization: " + org);
	}

}
