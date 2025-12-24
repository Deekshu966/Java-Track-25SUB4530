package corejava;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee emp1 = new Employee();
		emp1.display();
		
	//	Employee emp2 = new Employee(101, "Alice", "HR");
	//	emp2.display();
		
		Employee emp3 = new Employee(1001);
		emp3.display();
		
		Employee.test();
		emp1.test();
		emp3.test();
	}

}
