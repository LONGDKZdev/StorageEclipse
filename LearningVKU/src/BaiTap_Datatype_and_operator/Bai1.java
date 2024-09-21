package BaiTap_Datatype_and_operator;

import java.util.Scanner;

public class Bai1 
{
public static void main(String[] args) 
	{
	try (Scanner valueIn = new Scanner(System.in)){
///////////////////////////////////
	System.out.print("Enter valueA  = ");
	int a = valueIn.nextInt();
	System.out.println("valueA  = "+a);
	System.out.print("Enter valueB  = ");
	int b= valueIn.nextInt();
	System.out.println("valueA  = "+b);
	//////////////////////////////////
	int sum = a + b;
	long differnt = a - b;
	float product = a * b;
	double quotient = (double)a/b;
	/////////////////////////////////
	System.out.println("Sum = "+sum);
	System.out.println("differnt = "+differnt);
	System.out.println("product = "+product);
	System.out.printf("quotient = %.2f",quotient);
	valueIn.close();
	}
	
	}
}
//*****1. Nhập vào 2 số a, b. In ra tổng, hiệu, tích, thương (lấy độ chính xác với 2 chữ số sau dấu phẩy). Làm với tất cả các kiểu dữ liệu số đã được học.
