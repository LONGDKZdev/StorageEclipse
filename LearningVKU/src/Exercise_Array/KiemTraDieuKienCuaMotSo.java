package Exercise_Array;

import java.util.Scanner;

public class KiemTraDieuKienCuaMotSo {
	// Kiểm tra số chẳn lẻ
	// Số nguyên tố
	// Số

	public static void isEven(int n) {
		if (n % 2 == 0) {
			System.out.println(n + " is even number ");
		}
		if (n % 2 != 0) {
			System.out.println(n + " isn't even number ");
		}
	}

	public static void isPrimeNumber(int n) {
		System.out.println("All prime numbers from 1 to " + n + " are:");
		for (int i = 2; i < n; i++) {
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
	}

/////////////////////////////////////////////////
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.print("Enter number = ");
		int n = In.nextInt();
		isEven(n);
		System.out.println();
		isPrimeNumber(n);

		In.close();
	}

}
