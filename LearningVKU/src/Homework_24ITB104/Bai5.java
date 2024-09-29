package Homework_24ITB104;

public class Bai5 {
public static void main(String[] args) {
	for (int i = 1; i < 100 ;  i++)
	{
		System.out.print(i+ ",\t");
		
		if (i % 10 == 0) {
			System.out.println("");
		}
	}
	System.out.println("100");
}
}
