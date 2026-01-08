package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestEmployeeStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1001, "John Doe", "IT", 75000);
		Employee e2 = new Employee(1002, "Jane Smith", "HR", 65000);
		Employee e3 = new Employee(1003, "Mike Johnson", "Finance", 80000);
		Employee e4 = new Employee(1004, "Emily Davis", "IT", 72000);
		Employee e5 = new Employee(1005, "David Wilson", "Marketing", 68000);
		
		List<Employee> employees = List.of(e1, e2, e3, e4, e5);
		List<Employee> empls = new ArrayList();
		empls.add(e1);
		//empls.add(false);
		
		
		List emps = new ArrayList();
		emps.add(e1);
	//	emps.add(10);
	//	emps.add(false);
		
		
		// Print all employee names
		employees.forEach(System.out::println);
		
		// Print names of employees in IT department
		
		Predicate<Employee> p = emp -> emp.getDept().equals("IT");
		System.out.println("Employee Full Details in IT Department:");
		List<Employee> result = employees.stream()
				 .filter(p)
				 .collect(Collectors.toList());
				// .forEach(System.out::println);
		result.forEach(System.out::println);
		
		System.out.println("Employee Name only in IT Department:");
		List<String> data  = employees.stream()
				 .filter(p)
				 .map(emp->emp.getName())
				 .collect(Collectors.toList());
				// .forEach(System.out::println);
		data.forEach(System.out::println);
		
		
		long count = employees.stream().filter(p).count();
		System.out.println("No of employees in IT Dept : "+count);
	}

}
