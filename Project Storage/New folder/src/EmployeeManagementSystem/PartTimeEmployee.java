package EmployeeManagementSystem;

import java.util.Scanner;

public class PartTimeEmployee extends Employee implements Manager{
	protected double partTimeRate;


	public PartTimeEmployee() {

	}

	public PartTimeEmployee(int employeeID, String name, double salary, double partTimeRate) {
		super(employeeID, name, salary);
		this.partTimeRate = partTimeRate;
	}

	@Override
	public String toString() {
		return "Employee ID : " + super.employeeID
				+"\nName : " + super.name
				+"\nSalary : " + super.salary
				+"\nPartTime Rate : " + partTimeRate;
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
		System.out.print("Enter PartTime Rate :");
		try {
			partTimeRate = In.nextDouble();
			}
		catch(Exception E) {
			System.out.println("Enter PartTime Rate error  !!!");
			}
	}

	@Override
	public boolean isManager() {
		if(partTimeRate != 0.0 ) {
			return true;
		} else {
			return false;
		}
	}

	public double getPartTimeRate() {
		return partTimeRate;
	}

	public void setPartTimeRate(double partTimeRate) {
		this.partTimeRate = partTimeRate;
	}


}
