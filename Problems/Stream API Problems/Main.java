package Arrays.Stream.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		EmployeeClass2 emp1 = new EmployeeClass2("Alice", 101, "New York", 75000.0, "HR");
		EmployeeClass2 emp2 = new EmployeeClass2("Bob", 102, "San Francisco", 85000.0, "Finance");
		EmployeeClass2 emp3 = new EmployeeClass2("Charlie", 103, "Chicago", 92000.0, "IT");
		EmployeeClass2 emp4 = new EmployeeClass2("David", 104, "Boston", 78000.0, "HR");
		EmployeeClass2 emp5 = new EmployeeClass2("Emma", 105, "Seattle", 98000.0, "Finance");

		// Storing employees in a list
		List<EmployeeClass2> emp = Arrays.asList(emp1, emp2, emp3, emp4, emp5);

		long c = emp.stream().filter(e -> e.getCity() == "boston").count();
		System.out.println(c);
		// Printing employees
		// employees.forEach(System.out::println);
		List n = emp.stream().filter(e -> e.getSalary() > 90000).map(e -> e.getEmpName()).toList();
		System.out.println(n);

		List v = emp.stream().map(e -> e.getEmpName().toUpperCase()).sorted().toList();
		System.out.println(v);

		emp.stream().filter(es -> es.getDepartment().equals("HR")).findFirst();
		// System.out.println(e);

		Double d = emp.stream().filter(e -> e.getDepartment().equals("HR")).mapToDouble(e -> e.getSalary()).sum();
		System.out.println(d);

		Map<String, Double> nop = emp.stream()
				.collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.summingDouble(e -> e.getSalary())));
		nop.forEach((k, vs) -> System.out.println(k + " - " + vs));

		Map<String, Double> m = emp.stream()
				.collect(Collectors.toMap(EmployeeClass2::getEmpName, EmployeeClass2::getSalary));
		System.out.println(m);

		List sal = emp.stream().map(e -> e.getSalary()).sorted(Comparator.reverseOrder()).toList();
		System.out.println(sal);

		EmployeeClass2 demo = emp.stream().max(Comparator.comparingInt(e -> e.getEmpName().length())).get();
		System.out.println(demo);
	}
}
