package collections.set;

import java.util.Set;
import java.util.TreeSet;

import collections.Employee;

public class EmployeeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(1001, "Alice", 50000, "finance");
		Employee emp2 = new Employee(1001, "Bob", 60000, "hr");
		Employee emp3 = new Employee(1003, "Charlie", 70000, "it");
		Employee emp4 = new Employee(1005, "David", 80000, "finance");
		Employee emp5 = new Employee(1006, "Eve", 90000, "it");
		Employee emp6 = new Employee(1006, "Eve", 90000, "it");
		// Employee emp6 = emp5;

		// Set<Employee> employees = new HashSet<>();
		//Set<Employee> employees = new LinkedHashSet<>();
		Set<Employee> employees = new TreeSet<>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		employees.add(emp6);

		System.out.println("Employees in the set:");
		for (Employee emp : employees) {
			System.out.println(emp);
		}

	}

}
