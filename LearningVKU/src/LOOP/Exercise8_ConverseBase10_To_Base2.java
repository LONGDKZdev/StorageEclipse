package LOOP;

import java.util.Scanner;

public class Exercise8_ConverseBase10_To_Base2 {

	public static void main(String[] args) {
		try (Scanner In = new Scanner(System.in)) {
			System.out.print("Enter value Base 10 = ");
			int Base10 = In.nextInt();
			In.close();
			//////////////////////////////////////////////////////////////////
			// *****Space Caculate***** //
			//////////////////////////////////////////////////////////////////

			int Base2 = 0;
			int power = 1;

			while (Base10 > 0) {

				int Caculate = Base10 % 2;
				Base2 += Caculate * power;
				power *= 10;
				Base10 /= 2;
			}

			System.out.println("Converse from Base10 to Base2 = " + Base2);
			//////////////////////////////////////////////////////////////////
		}
	}

}
