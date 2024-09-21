package BaiTap_Datatype_and_operator;
import java.util.Scanner;
public class Bai3 {

	public static void main(String[] args) 
	{
	try (Scanner In = new Scanner(System.in)){
	System.out.print("Enter value x =");
	double x = In.nextDouble();// C++ : 4.2 == java : 4,2 //
	double ham_so =  Math.pow(x,3) + 3*Math.pow(x,2) + x + 1;
	System.out.printf("x^3 + 3x^2 + x + 1 = %.4f\n" , ham_so);//làm tròn giá trị 
	System.out.print("giá trị với số nguyên "+"x^3 + 3x^2 + x + 1 = " + (int) ham_so + " là ");//số nguyên 
	In.close();
		}
	}
}
//*****3. Tính f(x) =x^3 + 3x^2 + x + 1. Với giá trị của x được nhập từ bàn phím.
