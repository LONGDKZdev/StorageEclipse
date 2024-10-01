package ExerciseForm;

public class Exercise5_MultiplicationTable 
{

	public static void main(String[] args) 
	{
		int valueA;
		for( valueA =1;valueA<=9;valueA++) 
			{
			System.out.print("Product ***"+valueA+"***"+"\t       "+"|");
			}
			
			System.out.print("Product "+valueA+"\t\t");
			System.out.println("");
			for( valueA =1;valueA<=10;valueA++) 
				{
				for(int valueB=1;valueB<=10;valueB++)
				{
					int product = valueA * valueB;
					System.out.print(valueB + " * " + valueA +" = "+ product+"\t       "+"|");
					
				}
			System.out.println("");
			}
		
	}
}


