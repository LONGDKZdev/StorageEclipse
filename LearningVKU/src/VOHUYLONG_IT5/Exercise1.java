package VOHUYLONG_IT5;

import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args) {
		
///////////////////////Bài 1. Viết chương trình khi chạy (run) sẽ in ra chữ VKU
	System.out.println("                                   ");
	System.out.println("                                   ");
	System.out.println("  *        *  *    *   *       *   ");
	System.out.println("   *      *   *  *     *       *   ");
	System.out.println("    *    *    **       *       *   ");
	System.out.println("     *  *     *  *     *       *   ");
	System.out.println("      *       *    *   * * * * *   ");
	System.out.println("                                   ");
	System.out.println("                                           ");
	System.out.println("                                           ");
	System.out.println("-------------------------------------------");
	System.out.println("-------------------------------------------");
	System.out.println("                                           ");
	System.out.println("                                           ");
	
///////////////////////Bài 2:Viết chương trình khai báo các biến và gán (khởi tạo) giá trị cho chúng 
					//(sử dụng tất các kiểu dữ liệu đã giới thiệu), và tính tổng, hiệu, tích, thương của biến số rồi in kết quả.
	int valueA = 51;
	int valueB = 43;
	
	
	
	
//                             ***Type Case***
	
//	int valueOut =  valueA / valueB; //result = 1.0 ====> FIX : extral (int) before value you use 
//EX:===> int valueOut = (int) valueA / valueB;
//khi chia thì trả về kết quả có kiểu dữ liệu lớn nhất VD: (long/int=long) hoặc (int/int=int) 
// kết quả đang là kiểu số nguyên ===> số thực  
//	doubel ===> float ===> long ===> int ===> short ===> byte
	
	
	///////////         Narroe Type Case
	
	int valueOut1 = (int) valueA / valueB;//result = 1.186046511...
	System.out.println(" valueA + valueB = "+(valueA + valueB));
	System.out.println(" valueA - valueB = "+(valueA - valueB));
	System.out.println(" valueA * valueB = "+(valueA * valueB));
	System.out.println(" valueA / valueB = "+ valueOut1);
	
	System.out.println("                                           ");
	System.out.println("                                           ");
	System.out.println("-------------------------------------------");
	System.out.println("-------------------------------------------");
	System.out.println("                                           ");
	System.out.println("                                           ");
//Bài 3. 
//Viết chương trình khai báo các biến tương ứng với tất cả kiểu dữ liệu (không gán giá trị).	
// Nhập giá trị tương ứng cho các biến từ bàn phím và tính tổng, hiệu, tích, thương của biến số rồi in kết quả.

	try(Scanner input = new Scanner(System.in)){
		System.out.print("Enter value1 = ");
		int value1 = input.nextInt();
		System.out.println("value1 = "+value1);
		
		System.out.print("Enter value2 = ");
		int value2 = input.nextInt();
		System.out.println("value2 = "+value2);
	
		int valueOut2 = (int) value1 / value2;
		System.out.println(" valueA + valueB = "+(value1 + value2));
		System.out.println(" valueA - valueB = "+(value1 - value2));
		System.out.println(" valueA * valueB = "+(value1 * value2));
		System.out.println(" valueA / valueB = "+ valueOut2);
	
		input.close();
	}
	

	// Lessons1 ex1 = new Lessons1();
	// ex1.Add();
	
	}

}
