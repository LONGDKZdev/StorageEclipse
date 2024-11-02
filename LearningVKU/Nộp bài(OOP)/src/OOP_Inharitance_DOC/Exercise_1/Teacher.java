package Exercise_1;
import java.util.Scanner;
public class Teacher extends Person {

	protected String subject;
	
	public Teacher() {
		super();
	}

	public Teacher(String ID, String Name, int Age, String subject) {
		super(ID, Name, Age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void input() {
		super.input();
		
//		System.out.println("-----------------------------");
//		System.out.println(" Information Teacher");
//		System.out.println("-----------------------------");
		Scanner In =new Scanner(System.in);
		System.out.print("Enter Subject : ");
		subject = In.nextLine();
		System.out.println("-----------------");
	}
	
	

	public void displayInfo() {
		super.displayInfo();
		System.out.print("\nSubject : "+ subject);
		System.out.println(" ");
	}
	
	
}
