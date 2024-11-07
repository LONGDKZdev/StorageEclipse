package EmployeeManagementSystem;

import java.util.Scanner;

public class FullTimeEmployee extends Employee {
	protected int workHours;

	public FullTimeEmployee() {

	}

	public FullTimeEmployee(int employeeID, String name, double salary, int workHours) {
		super(employeeID, name, salary);
		this.workHours = workHours;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	@Override
	public String toString() {
		return "Employee ID : " + super.employeeID
				+"\nName : " + super.name
				+"\nSalary : " + super.salary
				+"\nWork Hours : " + workHours;
	}

	@Override
	public void input() {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter Information FullTime Employee");
		System.out.print("Enter Employee ID : ");
		try {
			super.employeeID = In.nextInt();
			}
		catch(Exception E) {
			System.out.println("Enter ID error  !!!");
			}
		In.nextLine();
		System.out.print("Enter Name : ");
		super.name =In.nextLine();
		System.out.print("Enter Salary : ");
		try {
			super.salary =In.nextDouble();
			}
		catch(Exception E) {
			System.out.println("Enter salary error  !!!");
			}
		In.nextLine();
		System.out.print("Enter Work Hours :");
		try {
			workHours = In.nextInt();
			}
		catch(Exception E) {
			System.out.println("Enter workHours error  !!!");
			}


	}




}
