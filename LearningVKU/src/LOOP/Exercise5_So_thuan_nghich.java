package LOOP;

import java.util.Scanner;

public class Exercise5_So_thuan_nghich {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);

		System.out.print("Enter string number : ");
		int StringIn = In.nextInt();
		int StringOut = 0;
//////////////////////////////////////////////////////
		while (StringIn != 0) {
			int digit = StringIn % 10;
			StringOut = StringOut * 10 + digit;
			StringIn /= 10;
		}
		System.out.print("StringOut = " + StringOut);

		In.close();
	}

}
