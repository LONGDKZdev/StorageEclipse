package Method;

import java.util.Scanner;

public class Exercise5_Print_Your_Information {

	public static void Information(String Name, int Age, String Address, String Mail, int PhoneNumber) {
		System.out.println("Name: " + Name + "\n" + "Age: " + Age + "\n" + "Address: " + Address + "\n" + "Mail: "
				+ Mail + "\n" + "PhoneNumber: " + PhoneNumber + "\n");
	}

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);

		System.out.println("Enter Informatin(Name, Age, Address, Mail, PhoneNumber) : ");
		System.out.print("1. ");
		String Name = In.next();
		System.out.print("2. ");
		int Age = In.nextInt();
		System.out.print("3. ");
		String Address = In.next();
		System.out.print("4. ");
		String Mail = In.next();
		System.out.print("5. ");
		int PhoneNumber = In.nextInt();

		Information(Name, Age, Address, Mail, PhoneNumber);

		In.close();
	}

}
