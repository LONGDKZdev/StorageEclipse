package ExerciseForm;
import java.util.Scanner;
public class print1ToN {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.print("Enter the length string =");
		int valueIn = In.nextInt();
		System.out.println("");
		if(valueIn < 1 ) {
			while (valueIn < 1) {
				
				System.out.println(" Error! Enter again! ");
				valueIn = In.nextInt();
				}
			}
		else {
				System.out.println("lenth of string = "+valueIn);
				System.out.println("");
				for(int value=1; value < valueIn;value++) {
				System.out.print(value+",");
			}
		System.out.println(valueIn);
		}
	In.close();
	}
}
