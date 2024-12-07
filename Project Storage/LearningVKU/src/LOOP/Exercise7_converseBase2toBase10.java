package LOOP;

import java.util.Scanner;

public class Exercise7_converseBase2toBase10 {
	public static void main(String[] args) {
		//////////////////////////////////////////////////////////////////
		try (Scanner In = new Scanner(System.in)) {
			System.out.print("Enter value Base 2 (Only enter 0 and 1)=");
			int Base2 = In.nextInt();
			In.close();
			//////////////////////////////////////////////////////////////////
			// *****Space Caculate***** //
			//////////////////////////////////////////////////////////////////
			int decimal = 0;
			int power = 0;

			while (Base2 > 0) {
				int lastDigit = Base2 % 10;

				decimal += lastDigit * (int) Math.pow(2, power);

				power++;

				Base2 /= 10;
			}
			//////////////////////////////////////////////////////////////////
			System.out.println("Convers from Base2 to Base10 = " + decimal);
		}
	}
}