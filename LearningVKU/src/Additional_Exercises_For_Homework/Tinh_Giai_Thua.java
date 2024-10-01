package Additional_Exercises_For_Homework;
import java.util.Scanner;
public class Tinh_Giai_Thua {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.print("Enter value n to caculate n! = ");
		int n = In.nextInt();
		int ans = 1;
		for(int i = 1; i <= n;i++) {
			ans *= i;
		}
		System.out.print(n+"! = "+ans);
	In.close();
	}

}
