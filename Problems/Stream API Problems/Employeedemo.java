package KodeWala.Interview.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employeedemo {

	public static void main(String[] args) {
		List<Employee> n= Arrays.asList(
				new Employee("arthi","science",234,4,50000),
				new Employee("dileep","devops",789,6,90000),
				new Employee("latha","developement",987,8,70000),
				new Employee("selvaraj","back-end",4678,3,110000),
				new Employee("pappu","science",345,5,89000),
				new Employee("charlie","back-end",754,8,90000)
				
				);
		
		Employee es=n.stream().max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(es.getSalary());
		
		Map<String, List<Employee>> collect = n.stream().collect(Collectors.groupingBy(Employee::getDepart));
		
		collect.forEach((k,v)->{System.out.print(k+" \t");
		     System.out.println(v.stream().map(e->e.getName()).toList());
			});

	}

}
