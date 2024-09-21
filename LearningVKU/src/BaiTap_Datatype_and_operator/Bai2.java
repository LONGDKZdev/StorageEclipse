package BaiTap_Datatype_and_operator;
import java.util.Scanner;
public class Bai2 {
public static void main(String[] args) {
	
	try (Scanner valueIn = new Scanner(System.in)){
		System.out.print("Enter valueA = ");
		int valueA = valueIn.nextInt();
		System.out.print("Enter valueB = ");
		int valueB = valueIn.nextInt();
		//////////////////////////////////////////////////////////
		System.out.println(" valueA / valueB = "+valueA / valueB);
		System.out.println(" valueA % valueB = "+valueA % valueB);
		//////////////////////////////////////////////////////////
		valueIn.close();
		}
	}
}
//*****2. Nhập 2 số nguyên a, b từ bàn phím. In ra phần nguyên, phần dư của phép chia 2 số a, b.
//   quotient : chia
