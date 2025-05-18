package stream.problems;

public class Employee {

	private String name;
	private int expid, exp, salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExpid() {
		return expid;
	}
	public void setExpid(int expid) {
		this.expid = expid;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, int expid, int exp, int salary) {
		super();
		this.name = name;
		this.expid = expid;
		this.exp = exp;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", expid=" + expid + ", exp=" + exp + ", salary=" + salary + "]";
	}
	
	
}
