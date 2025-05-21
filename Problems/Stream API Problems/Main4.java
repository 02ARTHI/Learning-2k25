package stream.day1;



import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        // List of factory employees
        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Emily", 75000),
                new Employee("Michael", 45000),
                new Employee("Sophia", 60000)
        );

        // Sorting employees by salary in descending order
        employees.stream()
                .sorted(Collections.reverseOrder(Comparator.comparingInt(Employee::getSalary)))  // Sorting in descending order
                .forEach(System.out::println);
        
        //both are same 
        
        employees.stream()
        .sorted(Comparator.comparingInt(Employee::getSalary).reversed())  // Sorting in descending order
        .forEach(System.out::println);
        System.out.println("-----------------");
        employees.stream()
        .sorted(Comparator.comparingInt(Employee::getSalary))  // Sorting in descending order
        .forEach(System.out::println);
    }
}

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + ": " + salary;
    }
}
