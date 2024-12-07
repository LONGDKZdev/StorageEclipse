package Method;

import java.util.Scanner;

public class Exercise7_Return_To_Sum {

	public static int valueSum(int valueIn1, int valueIn2) {
		int sum = valueIn1 + valueIn2;
		return sum;
	}

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.print("Enter value 1 : ");
		int valueIn1 = In.nextInt();
		System.out.print("Enter value 2 : ");
		int valueIn2 = In.nextInt();

		System.out.print("Value of sum = " + valueSum(valueIn1, valueIn2));
		In.close();
	}

}
