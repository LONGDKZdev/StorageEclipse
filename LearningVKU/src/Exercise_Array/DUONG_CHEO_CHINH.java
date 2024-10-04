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

		for (int a = 0; a < x; a++) {
			for (int b = 0; b < y; b++) {
				if (a != b) {
					System.out.print("0");
				}
				if (a == b) {
					System.out.println("1");
				} else if (a != b) {
					System.out.print("0");
				}
			}
		}

		In.close();
	}

}
