package Method;

import java.util.Scanner;

public class recycal_Array_With_Method {

	public static void Imput(int a[], int n) {
		Scanner In = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]= ");
			a[i] = In.nextInt();
		}
		In.close();
	}

	public static void Output(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.print("Enter length of the array A = ");
		int n = In.nextInt();
		int[] a = new int[n];
		Imput(a, n);
		Output(a, n);

	}
}
