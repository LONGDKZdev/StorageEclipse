package LOOP;
import java.util.*;
public class Exercise4_Sum_All_Number_In_String {

	public static void main(String[] args) {
		Scanner In =new Scanner(System.in);
		System.out.print("Enter String number from 0  to +n : ");
		int StringNumber = In.nextInt();
		int valueCaculate = 0;
		
		if(StringNumber < 0) {
			while(StringNumber < 0) {
				System.out.print("Error!, enter again! : ");
				StringNumber = In.nextInt();
			}	
		}
		while(StringNumber > 0) {
			valueCaculate += StringNumber % 10;
			StringNumber /= 10;
		}
		System.out.print("Sum of String number  = "+ valueCaculate );
		
		
	In.close();		
	}
}
