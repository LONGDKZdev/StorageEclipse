package LOOP;
import java.util.*;
public class Exercise4_Sum_All_Number_In_String {

	public static void main(String[] args) {
		Scanner In =new Scanner(System.in);
		System.out.print("Enter string number from 0  to +n : ");
		int stringNumber = In.nextInt();
		int valueCaculate = 0;
		
		if(stringNumber < 0) {
			while(stringNumber < 0) {
				System.out.print("Error!, enter again! : ");
				stringNumber = In.nextInt();
			}	
		}
		while(stringNumber > 0) {
			valueCaculate += stringNumber % 10;
			stringNumber /= 10;
		}
		System.out.print("Sum of string number  = "+ valueCaculate );
		
		
	In.close();		
	}
}
