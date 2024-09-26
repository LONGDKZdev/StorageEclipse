package Homework;
public class Exercise4_PrimeNumber 
{

	
public static void main(String[] args) 
{
int valueIn=2;
int valueStart =0;
while (valueStart <100 ) {
	if(isPrime(valueIn)) 
		{
		System.out.println(valueIn);
		valueStart++;
		}
	valueIn++;
	} 	
}
	
	public static boolean isPrime(int valueIn) 
	{
		if(valueIn < 1) {
		return false;
		}
			for( int i = 2;i < Math.sqrt(valueIn);i++) 
			{
			if(valueIn % i == 0) {
			return false;
			}
		}
		return true;
	}
}

		
