package Exercise_1;
import java.util.Scanner;
public class Person {
	private String ID;
	private String Name;
	private int Age;
	

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public void input() {
		Scanner In =new Scanner(System.in);
		System.out.print("Enter ID: ");
		ID = In.nextLine();
		System.out.print("Enter Name: ");
		Name = In.nextLine();
		System.out.print("Enter Age: ");
		Age = In.nextInt();
	}
	
	
	public void displayInfo() {
		System.out.print("ID : " + ID);
		System.out.print("Name : " + Name);
		System.out.print("Age : " + Age);
	}
	public class Student extends Person {
		private double gpa;
		
		@Override
		public void input() {
			super.input();
			Scanner In =new Scanner(System.in);
			gpa = In.nextDouble();
		}
	}
}

	

