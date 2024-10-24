package B3;
import java.util.Scanner;
public class Class1 {
	static void m1C1() {
		System.out.println("This is method 1 of Class1");
	}
	static void m2C1() {
		System.out.println("This is method 2 of Class1");
	}
	static void Caculate() {
		Scanner In = new Scanner(System.in); 
		System.out.print("Enter value to caculate : ");
		int valueIn = In.nextInt();
		int valueOut = valueIn +19231;
		System.out.println("Value after caculate = "+valueOut);
	}
}
