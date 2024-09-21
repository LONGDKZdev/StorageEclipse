package BaiTap_Datatype_and_operator;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
            try (Scanner In = new Scanner(System.in)) {
                System.out.print("Enter valueA1 = ");
                int valueA1= In.nextInt();
                System.out.print("Enter valueA2 = ");
                int valueA2= In.nextInt();
                System.out.print("Enter valueB1 = ");
                int valueB1= In.nextInt();
                System.out.print("Enter valueB2 = ");
                int valueB2= In.nextInt();
                
                System.out.println(" Coordinates Oxy ");
                System.out.println("x( "+valueA1+","+valueA2+" )");
                System.out.println("y( "+valueB1+","+valueB2+" )");
                
                int valueX = valueB1 - valueA1;
                int valueY = valueB2 - valueA2;
                
                double lenth_from_X_to_Y = Math.sqrt(Math.pow(valueX,2)+Math.pow(valueY,2));
                System.out.printf("lenth from X ---> Y  = %.4f",lenth_from_X_to_Y);
            }
	}
}
//*****5. Tính khoảng cách giữa 2 điểm trong hệ tọa độ Oxy. x(x1, x2) và y(y1, y2). x1, x2, y1, y2 là các số nguyên được nhập từ bàn phím.