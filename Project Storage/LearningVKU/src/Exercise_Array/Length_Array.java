package Exercise_Array;

import java.util.Scanner;

public class Length_Array {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.print("Enter length of the array A = ");
		int n = In.nextInt();
		System.out.println("---------------------------------------");
		int[] arrayA = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("arrayA" + "[" + i + "]" + " = ");
			arrayA[i] = In.nextInt();// Cú pháp nhập mảng
		}

		In.close();
		System.out.println("---------------------------------------");
		//////////////////////////////////////////////////////
		System.out.print("arrayA" + "[" + "]" + "= " + "{");
		for (int i = 0; i <= n; i++) {
			if (i < n - 1) {
				System.out.print(arrayA[i] + ",");
			}
			if (i == n - 1) {
				System.out.print(arrayA[i] + "}");
			}
		}
		System.out.println();
		System.out.println("Length of array =" + arrayA.length);// Độ dài mảng
	}

}
