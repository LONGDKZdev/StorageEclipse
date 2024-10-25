package Exercise_1;

import java.util.Scanner;

public class Student extends Person {
	private double gpa;
	
	public Student() {
		super();
	}
	public Student(String iD, String name, int age) {
		super(iD, name, age);
		this.gpa =gpa;//thuộc tính = giá trị truyền vào
	}
	
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	public void input() {
		super.input();
		Scanner In =new Scanner(System.in);
		System.out.print("Enter gpa(from 1 to 4): ");
		gpa = In.nextDouble();
		while(gpa < 1 && )
		
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.print("\nGPA = "+gpa);
	}
	
	//       //
	// cách 1//
	//       //
	
	public void getAcademicPerformance() {
		 String Test = (gpa >=3.6) ? "Grade A" :( 
			 	(gpa >=3.2 && gpa <3.6 ) ? 	"Grade B" :(	
			 	(gpa >=2.5 && gpa <3.2 ) ? 	"Grade C" :(
			 	(gpa >=2.0 && gpa <2.5 ) ? 	"Grade D" :	
			 								"Grade F" )));
	}
	
	
	//       //
	// cách 2//
	//       //
	
//	public String getAcademicPerformance( ) {
//		 	if (gpa >=3.6)  return "A" ;
//		 	else if (gpa >=3.2 && gpa <3.6 )  	return "B" ;	
//		 	else if (gpa >=2.5 && gpa <3.2 )  	return "C" ;
//		 	else if (gpa >=2.0 && gpa <2.5 )  	return "D" ;	
//		 	else 								return "F";
//	}
	
}