package LOOP;

import java.util.Scanner;

public class Exercise2_Tinh_Giai_Thua {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.print("Enter value n to caculate n! = ");
		int n = In.nextInt();

		if (n < 0) {
			while (n < 0) {
				System.out.print("ERROR!!!, enter again! = ");
				n = In.nextInt();
			}
		}
		int ans = 1;
		for (int i = 1; i <= n; i++) {
			ans *= i;
		}
		System.out.print(n + "! = " + ans);
		In.close();
	}

}
