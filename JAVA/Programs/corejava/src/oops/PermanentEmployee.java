package oops;

public class PermanentEmployee extends Employee {
	
	int bonus;
	int deductions;
	int salary;
	public PermanentEmployee() {
		super(9001,"Kishore",45000);
		bonus = 5000;
		deductions = 2000;
		salary=50000;
	}
	
	public void display() {
		super.display();
		System.out.println("Salary of Employee"+super.salary);
		System.out.println("Employee Bonus: " + bonus);
		System.out.println("Employee Deductions: " + deductions);
	}

	@Override
	public String toString() {
		return "PermanentEmployee [bonus=" + bonus + ", deductions=" + deductions + ", salary=" + salary + "]";
	}
	


}
