package oops;

public class Employee extends Object{
	
	int empid;
	
	String name;
	
	int salary;
	
	Employee(int empid, String name, int salary) {
		this.empid = empid;
		this.name =name;
		this.salary=salary;
	}

	
	public void display() {
		System.out.println("Employee ID: " + empid);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Salary: " + salary);
	}
	

}
