package Additional_Exercises_For_Homework;
import java.util.Scanner;
public class Length_Of_Number_String {

	public static void main(String[] args) {
		int number = 0;
		Scanner In = new Scanner(System.in);
		System.out.println("Enter numner  = ");
		int lenth = In.nextInt();
		while( lenth / 10 != 0) {
			number++;
			lenth /= 10 ;
			
		}
			
		
	In.close();
	}

}
