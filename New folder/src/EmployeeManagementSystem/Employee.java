package EmployeeManagementSystem;


public abstract class Employee {
	protected int employeeID ;
	protected String name ;
	protected double salary ;

	public Employee() {

	}
	public Employee(int employeeID, String name, double salary) {
		super();
		this.employeeID = employeeID;
		this.name = name;
		this.salary = salary;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public abstract String toString();
	public abstract void input();


}
