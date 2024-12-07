package Method;

import java.util.Scanner;

public class Exercise_7_FlipNumber123_321 {

	public static int FlipNumber(int StringIn) {
		int StringOut = 0;
		while (StringIn != 0) {
			int digit = StringIn % 10;
			StringOut = StringOut * 10 + digit;
			StringIn /= 10;
		}
		return StringOut;

	}

//                                                  //
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.print("Enter number you want flip : ");
		int value = In.nextInt();
		System.out.print("Result = " + FlipNumber(value));

		In.close();
	}

}
