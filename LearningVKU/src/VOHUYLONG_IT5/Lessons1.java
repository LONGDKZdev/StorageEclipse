package VOHUYLONG_IT5;

import java.util.Scanner;

public class Lessons1 {
	
	public static void main(String[] args) {
		
//////////////////////////////////////////////////
	// create an object of Scanner
	//EX:  Scanner input = new Scanner(System.in);
	// take input from the user
	//EX:  int number = input.nextInt();
/////////////////////////////////////////////////		
	System.out.println("Hello world!");
	System.out.println("Võ Huy Long");
	int value1 = 418;
	double value2 =8.5;
	System.out.println("value1 = "+value1);
	System.out.println("valueB = "+value2);
		
////////nhập dữ liệu 
////////import java.util.Scanner;
//////// trực tiếp :VD double value1 = input.nextdouble();
//////// gián tiếp 
	 	Scanner input = new Scanner(System.in);
	 	
	 	System.out.print("Enter valueA = ");
	 	int valueA = input.nextInt();
	 	System.out.println("valueA = "+valueA);
	 	
	 	System.out.print("Enter valueB = ");
	 	int valueB = input.nextInt();
	 	System.out.println("valueB = "+valueB);
	 	
		int tong =valueA + valueB;
		int hieu =valueA - valueB;
		int tich =valueA * valueB;
		int thuong =valueA / valueB;
		int chialaydu = valueA % valueB;
		
		System.out.println("valueA + valueB ="+tong);
		System.out.println("valueA + valueB ="+(valueA+valueB));//hoặc
		
		System.out.println("valueA - valueB ="+hieu);
		System.out.println("valueA * valueB ="+tich);
		System.out.println("valueA / valueB ="+thuong);
		System.out.println("valueA % valueB ="+chialaydu);
		
	}
}
