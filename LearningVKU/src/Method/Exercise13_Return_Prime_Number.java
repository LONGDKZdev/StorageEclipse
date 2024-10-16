package Method;

import java.util.Scanner;

public class Exercise13_Return_Prime_Number {

	public static boolean isPrimeNumber(int valueIn) {
		// Math.sqrt(valueIn) chỉ kiểm tra 1 nữa của valueIn
		if (valueIn < 2)
			return false;
		for (int i = 2; i < Math.sqrt(valueIn); i++) {
			if (valueIn % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.print("Enter value = ");
		int valueIn = In.nextInt();
		for (int i = 0; i < valueIn; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + " ");
			}
		}
		In.close();
	}

}
