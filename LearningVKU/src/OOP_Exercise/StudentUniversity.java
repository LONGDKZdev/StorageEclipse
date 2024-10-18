package OOP_Exercise;
import java.util.*;
public class StudentUniversity {
	
public class student{

	 private int ID;
	 private String Name;
	 private int Age;
	 
	 public student(int ID, String Name, int Age) {
         this.ID = ID;// thêm this để phân biệt thuộc tính hay giá trị 
         this.Name = Name;
         this.Age = Age;
     }
	
	private void output(){
		System.out.println(" Studen ID : "+ ID);
		System.out.println(" Name : " + Name );
		System.out.println(" Age : "+ Age );
	}
	public static void study() {
		System.out.println("Studing ");
		}
		public static void Homework() {
		System.out.println("Do homework ");
		}

		public int getID() {
			return ID;
		}

		public String getName() {
			return Name;
		}

		public int getAge() {
			return Age;
		}

		public void setID(int iD) {
			ID = iD;
		}

		public void setName(String name) {
			Name = name;
		}

		public void setAge(int age) {
			Age = age;
		}
		
		
		
}
	
	public static void main(String[] args) {
	Scanner In =new Scanner(System.in);
	
	System.out.println("Enter Student ID: ");
    int ID = In.nextInt();
    System.out.println("Enter Student Name: ");
    String Name = In.next();
    System.out.println("Enter Student Age: ");
    int Age = In.nextInt();
    StudentUniversity university = new StudentUniversity();
    student a = university.new student(ID, Name, Age);
		a.output();
	
	
		In.close();
		}
}
