package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import collections.Employee;

public class EmployeeListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee(1001, "Alice", 50000,"finance");
		Employee emp2 = new Employee(1002, "Bob", 60000,"hr");
		Employee emp3 = new Employee(1003, "Charlie", 70000,"it");
		Employee emp4 = new Employee(1004, "David", 80000,"finance");
		Employee emp5 = new Employee(1005, "Eve", 90000,"it");
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		
		System.out.println(employees);
		
		employees.removeIf(emp-> emp.getEmpid()>=1004);
		System.out.println("After removing empid >=1004: " + employees);
		
		for(Employee emp: employees)
			System.out.println(emp);
		System.out.println("Using forEach and lambda");
		employees.forEach(emp -> System.out.println(emp));
		
		System.out.println("Using Iterator");
		Iterator itr = employees.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		
		ListIterator empItr = employees.listIterator();
		
		System.out.println("Traversing in forward direction using ListIterator");
		while (empItr.hasNext())
			System.out.println(empItr.next());
		
		System.out.println("Traversing in backward direction using ListIterator");
		while (empItr.hasPrevious())
			System.out.println(empItr.previous());

	}

}
