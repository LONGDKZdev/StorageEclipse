package ExerciseForm;
import java.util.Scanner;
public class Quadratic_Equation {

	public static void main(String[] args) {
		try(Scanner valueIn = new Scanner(System.in)){
			System.out.print("Enter value A = ");
			int A = valueIn.nextInt();
			System.out.println("value A = "+A);
			
			System.out.print("Enter value B = ");
			int B = valueIn.nextInt();
			System.out.println("value B = "+B);
			
			System.out.print("Enter value C = ");
			int C = valueIn.nextInt();
			System.out.println("value C = "+C);
			System.out.println("------------------------------");
	///////////////////////////////////////////////////////////////
			if(B > 0 && C >0) 
				System.out.println(A+"x^2 "+"+"+B+"x "+"+"+C+" = 0");
			else if(B < 0 && C < 0)
				System.out.println(A+"x^2 "+B+"x "+C+" = 0");
			else if(B > 0 && C < 0)
				System.out.println(A+"x^2 "+"+"+B+"x "+C+" = 0");
			else if(B < 0 && C > 0)
				System.out.println(A+"x^2 "+B+"x "+"+"+C+" = 0");
			System.out.println("------------------------------");
	///////////////////////////////////////////////////////////////	
			int B2 = B/2;
			int delta = (int)Math.pow(B2,2) - A*C;
			
			if(delta < 0)
				System.out.println("vô nghiệm");
				else if(delta == 0) 
				{
					int value1 ;
					value1  = (-B / 2*A);
					System.out.println("phương trình có 2 nghiệm bằng nhau = "+value1); 
				}
				else if(delta > 0) 
				{
					int value3 = (int)(-B-Math.sqrt(delta))/2*A;
					int value4 = (int)(-B+Math.sqrt(delta))/2*A;
					System.out.println("phương trình có 2 nghiệm phân biệt ");
					System.out.printf("value1 = "+" %.3f \n",value3);
					System.out.printf("value2 = "+" %.3f \n",value4);
				}
		valueIn.close();
		}
	
		}
		
}
//Bài tập cắn bậc 2 