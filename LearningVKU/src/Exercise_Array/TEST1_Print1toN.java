package Exercise_Array;

import java.util.Scanner;

public class TEST1_print1toN {

	public static void printValue(int n) {
		/////////////////////////////////
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			if (i < n)
				System.out.print(i + ",");
			else if (i == n) {
				System.out.print(i);
			}
			sum = sum + i;
		}
		System.out.println();
		System.out.print("Sum = " + sum);
	}

/////////////////////////////////////////
	public static void TongGiaithua(int n) {
		int Giaithua = 1;
		int TongGiaithua = 0;
		for (int a = 1; a <= n; a++) // Tính giai thừa
		{
			if (a < n)
				System.out.print(a + ",");
			else if (a == n) {
				System.out.print(a);
			}
			Giaithua = Giaithua * a;
			TongGiaithua = TongGiaithua + Giaithua;
		}
		System.out.println();
		System.out.println("Giai thừa = " + Giaithua);
		System.out.println("Tổng giai thừa = " + TongGiaithua);
	}

////////////////////////////////////////////////
//////////         Main Space     //////////////
////////////////////////////////////////////////
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.print("Enter limit value = ");
		int valueIn = In.nextInt();
		printValue(valueIn);
		System.out.println();
		System.out.println("---------------------------------");
//    TÍNH GIAI THỪA DÃY SỐ 
		TongGiaithua(valueIn);
		In.close();
	}
}
