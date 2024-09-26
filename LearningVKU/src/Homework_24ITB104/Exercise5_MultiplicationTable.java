package Homework;

public class Exercise5_MultiplicationTable 
{

	public static void main(String[] args) 
	{

	for(int valueA =1;valueA<=10;valueA++) 
		{
		for(int valueB=1;valueB<=10;valueB++)
			{
				int product = valueA * valueB;
				System.out.println(valueA + " * " + valueB +" = "+ product);
				if( valueB == 10) 
				{
				System.out.println("==============");
				}
			}
		}
	}

}

