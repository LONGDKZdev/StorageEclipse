package VOHUYLONG_IT5;

import java.util.Scanner;

public class caculate
{

	public static void main(String[] args) 
	{
		try(Scanner readInformation = new Scanner(System.in)){
			int valueA = readInformation.nextInt();
			int valueB = readInformation.nextInt();
			int ans =(int)Math.pow(valueA,valueB);
			System.out.println("sum of two value = "+ans);
			readInformation.close();
		}
	}
}
