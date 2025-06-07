package Arrays.Stream.example;

public class EmployeeClass2 {
    private String empName;
    private int empId;
    private String city;
    private double salary;
    private String department;

    // Constructor
    public EmployeeClass2(String empName, int empId, String city, double salary, String department) {
        this.empName = empName;
        this.empId = empId;
        this.city = city;
        this.salary = salary;
        this.department = department;
    }

    // Getters
    public String getEmpName() {
        return empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getCity() {
        return city;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    // Setters
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // toString() method for easy printing
    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
