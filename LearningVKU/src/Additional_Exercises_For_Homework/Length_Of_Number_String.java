package Additional_Exercises_For_Homework;
import java.util.Scanner;
public class Length_Of_Number_String {

	public static void main(String[] args) {
		int number = 0;
		Scanner In = new Scanner(System.in);
		
		System.out.print("Enter numner  = ");
		int length = In.nextInt();
		if(length < 0 ) {
			while(length < 0) {
				System.out.println("Enter again! = ");
				length = In.nextInt();	
			}
		}
			while( length != 0) {
				number++;
				length /= 10 ;
			}	
		System.out.println("Length of number string = "+number);
	In.close();
	}

}
