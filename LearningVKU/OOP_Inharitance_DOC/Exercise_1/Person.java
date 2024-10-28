package Exercise_1;
import java.util.Scanner;
public class Person {
	private String id;
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String ID, String Name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void input() {
		Scanner In =new Scanner(System.in);
		System.out.print("Enter ID: ");
		id = In.nextLine();
		System.out.print("Enter Name: ");
		name = In.nextLine();
		System.out.print("Enter Age: ");
		age = In.nextInt();
		System.out.println("--------------");
	}
	
	public void displayInfo() {
		System.out.print("ID : " + id);
		System.out.print("\nName : " + name);
		System.out.print("\nAge : " + age);
	}
	
}

	

