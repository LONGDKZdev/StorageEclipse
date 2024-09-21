package BaiTap_Datatype_and_operator;
import java.util.Scanner;
public class Bai4{

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		
		System.out.print("Enter value r = ");
		float r = In.nextFloat();
		System.out.println("");
		
////////  final double PI = 3.14; ===> cho PI là hằng số 
		
		final double PI = 3.14;
		double C = 2*PI*r;
		double S = PI*r*r;
		//////////////////////////////////
		System.out.printf("C = %.2f\n",C);
		System.out.println("");
		System.out.printf("S = %.2f\n",S);
		//////////////////////////////////
		In.close();
	}
}
////thêm \n vào bất cứ đâu trong " " để xuống dòng
////nối dòng printf là System.out.printf(" valueA  %.4f", valueOut);

//*****4. Nhập bán kính R của hình tròn từ bàn phím. Tính chu vi và diện tích của hình tròn (lấy độ chính xác với 2 chữ số)
