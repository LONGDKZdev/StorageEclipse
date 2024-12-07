package EmployeeManagementSystem;

import java.util.Scanner;

public class MainMenuEmployee {

	public static void main(String[] args) {
		HRManager HR = new HRManager();

		boolean ok =true;

		while(ok) {
			System.out.println("=================MENU========================");
			System.out.println("|1. Add Employee                            |");
			System.out.println("|2. Renove Employee             	    |");
			System.out.println("|3. Search Employee by  ID             	    |");
			System.out.println("|4. Print list                    	    |");
			System.out.println("|5. EXIR !                                  |");
			System.out.println(" ============================================");

			Scanner In = new Scanner (System.in);
			System.out.print("Enter your choice : ");
			int choice = In.nextInt();

			switch(choice) {
			case 1:
				System.out.println("---------------------------");
				System.out.println("|1. Add FullTime Employee |");
				System.out.println("|2. Add PartTime Employee |");
				System.out.println("---------------------------");
				System.out.print("Enter your choice: ");
				int subchoice = In.nextInt();
				if(subchoice == 1) {
					FullTimeEmployee F = new FullTimeEmployee();
					F.input();
					HR.addEmployee(F);
				}
				else if(subchoice == 2){
					PartTimeEmployee P = new PartTimeEmployee();
					P.input();
					HR.addEmployee(P);
				}
				else {
					System.out.println("ERROR your subchoice !");
				}
				break;
				
			case 2:
				
				
			case 3:
				System.out.print("Enter Employee ID :");
				int employeeID = 0;
				try {
					employeeID = In.nextInt();
					}
				catch(Exception E) {
					System.out.println("Enter ID error  !!!");
					}
				Employee Employee = HR.searchEmployee(employeeID);

				if(Employee == null) {
					System.out.println("Not found !");
				}
				else {
					System.out.println(Employee);
				}
				break;
			case 4:
				HR.displayEmployee();
				break;

			default:
				ok = false;



				}
			}


	}

}
