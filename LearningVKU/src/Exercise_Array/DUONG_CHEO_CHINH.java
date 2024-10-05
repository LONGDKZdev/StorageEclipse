package Exercise_Array;

import java.util.Scanner;

public class DUONG_CHEO_CHINH {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.print("Enter value row : ");
		int x = In.nextInt();
		System.out.print("Enter value column : ");
		int y = In.nextInt();
		int[][] arrayIn = new int[x][y];
		for (int a = 0; a < x; a++) {
			for (int b = 0; b < y; b++) {
				System.out.print("coordinates " + "[" + a + "][" + b + "] = "); // coordinates : Tọa độ
				arrayIn[a][b] = In.nextInt();
			}
		}
		System.out.println("---------------------------");
		int a, b;
		int sum = 0;
		System.out.println("Print value in diagonal :");
		for (a = 0; a < x; a++) {
			for (b = 0; b < a; b++) {
				System.out.print("   ");

			}
			System.out.println(arrayIn[a][a]);
			sum += arrayIn[a][a];
		}

		System.out.println("Sum value in diagonal = " + sum);
		In.close();
	}
}
