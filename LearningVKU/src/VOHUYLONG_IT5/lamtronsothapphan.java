package VOHUYLONG_IT5;

import java.util.Scanner;

public class lamtronsothapphan 
{
public static void main(String[] args) 
	{
	try(Scanner valueIn = new Scanner(System.in))
		{
		System.out.print("Enter valueA  = ");
		int a = valueIn.nextInt();
		System.out.println("valueA  = "+a);
		System.out.print("Enter valueB  = ");
		int b= valueIn.nextInt();
		System.out.println("valueA  = "+b);
		int thuong = (int)a/b;
		System.out.printf("ValueA / ValueB = "+"%.3f",thuong);
		//     ***LƯU Ý***       Dùng printf thay cho print bình thường 
		valueIn.close();
		// System.out.printf("%.2f",valueIn);  // ====> lấy 2 số thập phân sau dấu phẩy
		}
	}
	
}
