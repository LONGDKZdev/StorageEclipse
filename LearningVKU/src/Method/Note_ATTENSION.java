package Method;

import java.util.Scanner;

public class Note_ATTENSION {

	public static void Value1(int valueA) {
		System.out.println("A");
	}

	public static int Value2(int valueB) {
		int value = valueB;
		return value;
	}
// hàm void ===> tách riêng phần in chứ và tên phương thức ra
// hàm có return ==> nối lại bằng dấu +

	public static void main(String[] args) {

		// use System.out.ptint();
		// Value1(valueA);
		Scanner In = new Scanner(System.in);
		System.out.print("Enter valueA = ");
		int valueA = In.nextInt();
		Value1(valueA);

		// use System.out.ptint(+Value2(valueB));
		System.out.print("Enter valueB = ");
		int valueB = In.nextInt();
		System.out.print("B = " + Value2(valueB));
		In.close();
	}

}
