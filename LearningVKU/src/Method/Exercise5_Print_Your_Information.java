package Method;

import java.util.Scanner;

public class Exercise5_print_Your_Information {

	public static void Information(String Name, int Age, String Address, String Mail, int PhoneNumber) {
		System.out.println("Name: " + Name + "\n" + "Age: " + Age + "\n" + "Address: " + Address + "\n" + "Mail: "
				+ Mail + "\n" + "PhoneNumber: " + PhoneNumber + "\n");
	}

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);

		System.out.println("Enter Informatin(1.Name, 2.Age, 3.Address, 4.Mail, 5.PhoneNumber) : ");
		System.out.print("1. ");
		String Name = In.nextLine();
		System.out.print("2. ");
		int Age = In.nextInt();
		In.nextLine();
		System.out.print("3. ");
		String Address = In.nextLine();
		System.out.print("4. ");
		String Mail = In.nextLine();
		System.out.print("5. ");
		int PhoneNumber = In.nextInt();

		System.out.println("---------------------");
		Information(Name, Age, Address, Mail, PhoneNumber);

		In.close();
	}

}
