package LOOP;

public class Exercise6_Fibonacci {

	public static void main(String[] args) {
		int F0 =0;
		int F1 =1;
		int i;
		for(  i =1 ; i <=92; i++ ) {
			int F2 = F0 + F1;
			if(i == 92 ) {
			System.out.print(F2);
			}
			else {
			System.out.print(F2+",");
			}
			F0 = F1;
			F1 = F2;
		}
		
	}
}
