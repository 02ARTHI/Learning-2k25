package KodeWala.Interview.questions;

public class Employee {

	private String name;
	private String depart;
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
	
	
	
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String depart, int expid, int exp, int salary) {
		super();
		this.name = name;
		this.depart = depart;
		this.expid = expid;
		this.exp = exp;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", depart=" + depart + ", expid=" + expid + ", exp=" + exp + ", salary="
				+ salary + "]";
	}
	
	
	
}
