package EmployeeManagementSystem;

public class HRManager {
	protected  Employee[] employees;
	protected int limitEmployee;

	public HRManager() {
		employees = new Employee[100];
		limitEmployee = 0;
	}

	public HRManager(Employee[] employees, int limitEmployee) {
		super();
		this.employees = employees;
		this.limitEmployee = limitEmployee;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public int getLimitEmployee() {
		return limitEmployee;
	}

	public void setLimitEmployee(int limitEmployee) {
		this.limitEmployee = limitEmployee;
	}

	public void addEmployee(Employee e){
		if(searchEmployee(e.getEmployeeID()) != null) {
			System.out.println("Staff already exists");
			return ;
		}
		if(e instanceof FullTimeEmployee) {
		employees[limitEmployee] = new FullTimeEmployee();
		}
		else {
		employees[limitEmployee] = new PartTimeEmployee();
		}
		employees[limitEmployee] = e;
		limitEmployee++;
	}

	public Employee searchEmployee(int employeeID) {
		for(int i =0; i < limitEmployee; i++) {
			if(employees[i].getEmployeeID() == employeeID ) {
				return employees[i];
			}
		}
		System.out.println("Not found employee have ID " + employeeID);
		return null;

	}

	public void displayEmployee() {
		System.out.println("---------------------------------------");
		System.out.println("-------------LIST Employee-------------");
		System.out.println("---------------------------------------");
		for(int i =0; i < limitEmployee; i++) {
			System.out.println(employees[i].toString());
			System.out.println("--------------------------------");
		}
	}

}
