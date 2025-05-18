package stream.problems;
import java.util.ArrayList;

public class EmployeeStreamDemo {

	public static void main(String[] args) {
		ArrayList<Employee> emp= new ArrayList<Employee>();
		Employee obj= new Employee("arthi",1,2,50000);
		Employee obj1= new Employee("pappu",1,4,70000);
		Employee obj2= new Employee("charlie",3,2,90000);
		Employee obj3= new Employee("julie",1,5,500000);
		
		emp.add(obj);
		emp.add(obj1);
		emp.add(obj2);
		emp.add(obj3);
		
		emp.stream().filter(emp1->emp1.getExp()>2).map(e->e.getName()).forEach(System.out::println);
		
		//emp.stream().map(e->e.getName()).forEach(System.out::println);
	}

}
