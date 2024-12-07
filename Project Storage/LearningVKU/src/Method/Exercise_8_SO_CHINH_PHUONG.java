package Method;

import java.util.Scanner;

public class Exercise_8_SO_CHINH_PHUONG {
//Số chính phương nếu đuôi của dãy số = 0, 1, 4, 5, 6, 9
// và 2, 3, 7, 8 là ngược lại
	public static void SoChinhPhuong(int value) {
		int valueTest = value % 10;
		switch (valueTest) {
		case 0:
		case 1:
		case 4:
		case 5:
		case 6:
		case 9:
			System.out.print(value + " là số chính phương ");
			break;
		case 2:
		case 3:
		case 7:
		case 8:
			System.out.print(value + " không phải là số chính phương ");
			break;
		}
//                                                         //
	}

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.print("Enter value you want Test = ");
		int valueIn = In.nextInt();
		SoChinhPhuong(valueIn);

		In.close();
	}

}
