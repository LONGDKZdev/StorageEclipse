package Exercise_Array;

import java.util.Scanner;

public class Exercise1_Exercise_2_1Dimension_Array {

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
		System.out.print("arrayA" + "[]" + "= " + "{");
		for (int i = 0; i <= n; i++) {
			if (i < n - 1) {
				System.out.print(arrayA[i] + ",");
			}
			if (i == n - 1) {
				System.out.print(arrayA[i] + "}");
			}
		}
		System.out.println();
		//////////////////////////////////////////////////////
		System.out.println("---------------------------------------");
		System.out.println("*** Caculate Sum of arrayA ***");
		// 1.Tính và in ra tổng và trung bình các giá trị của mảng

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arrayA[i];
		}
		System.out.print("sum = " + sum + "\n");

		int average = sum / n;
		System.out.println("average = " + average);

		System.out.println("---------------------------------------");
		// 2. Tìm và in ra phần tử lớn nhất của mảng
		// 3. Tìm và in ra phần tử nhỏ nhất của mảng
		System.out.println("*** Find Min and Max in arrayA ***");

		int min = arrayA[0];
		int max = arrayA[0];

		for (int i = 0; i < n; i++) {
			if (arrayA[i] < min) {
				min = arrayA[i];
			}
			if (arrayA[i] > max) {
				max = arrayA[i];
			}
		}
		System.out.println("Min value in arrayA = " + min);
		System.out.println("Max value in arrayA = " + max);
		System.out.println();
		System.out.println("---------------------------------------");
	}
}
// Cú pháp 
// int [] a;
// a = new int[5];
// hoặc 
//int [] a = new int[5]
