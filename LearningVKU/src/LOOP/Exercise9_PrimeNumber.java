//package LOOP;
//
//import java.util.Scanner;
//
//public class Exercise9_PrimeNumber {
//
//	public static void main(String[] args) {
//		Scanner In = new Scanner(System.in);
//		System.out.print("Enter value limit = ");
//		int valueIn = In.nextInt();
//
//		System.out.println("All value is prime number from 1 to " + valueIn + " :");
//
//		for (int i = 2; i < valueIn; i++) {
//			int countValue = 0;
//			for (int j = 2; j <= Math.sqrt(i); j++) {
//				if (i % j == 0) {
//					countValue++;
//					break;
//				}
//			}
//			if (countValue == 0) {
//				System.out.print(i + " ");
//			}
//		}
//
//		In.close();
//	}
//}

package LOOP;

import java.util.Scanner;

public class Exercise9_PrimeNumber {
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.print("Enter value limit = ");
		int valueIn = In.nextInt();

		System.out.println("All prime numbers from 1 to " + valueIn + " are:");

		for (int i = 2; i < valueIn; i++) {
			int divisorCount = 0;

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					divisorCount++;
				}
			}

			if (divisorCount == 2) {
				System.out.print(i + " ");
			}
		}

		In.close();
	}
}
