package TEST01;
import java.util.*;
public class TEST2 {
	
		public static void checkScore(int a) {
			
			//"You must enter score < 10 or score > 0"
			if(a< 0 || a > 10 ) {
				throw new IllegalArgumentException();
			}
			else {
			System.out.println("correct");
			}
		}
		public static void main(String[] args) {
			Scanner In = new Scanner(System.in);
			System.out.print("Enter n: ");
			int n = In.nextInt();
			checkScore(n);
			
		}
	}
	
