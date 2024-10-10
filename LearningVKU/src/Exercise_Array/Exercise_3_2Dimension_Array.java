package Exercise_Array;

import java.util.Scanner;

public class Exercise_3_2Dimension_Array {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		///////////////////////////////////////////////////////////////
		// 1.Viết chương trình khai báo 1 mảng 2 chiều gồm n,m phần tử các số nguyên
		System.out.print("Enter value row : ");
		int valueA = In.nextInt();
		System.out.print("Enter value column : ");
		int valueB = In.nextInt();
		int[][] array2D = new int[valueA][valueB];
		System.out.println("------------------------------");
		////////////////////////////////////////////////////////////////
		// 2.Nhập giá trị cho n,m từ bàn phím
		// 3.Nhập các giá trị cho từng phần tử của mảng
		for (int a = 0; a < valueA; a++) {
			for (int b = 0; b < valueB; b++) {
				System.out.print("coordinates " + "[" + a + "][" + b + "] = ");// coordinates : Tọa độ
				array2D[a][b] = In.nextInt();
			}
		}
		/////////////////////////////////////////////////////////////////
		System.out.println("------------------------------");
		System.out.println("         ***TABLE***          ");
		for (int a = 0; a < valueA; a++) {
			for (int b = 0; b < valueB; b++) {

				System.out.print(array2D[a][b] + "\t");
			}
			System.out.println();
		}

		In.close();
	}

}
// Có 2 phương thức 
//Phương thức có trả về và phương thức không trả về 