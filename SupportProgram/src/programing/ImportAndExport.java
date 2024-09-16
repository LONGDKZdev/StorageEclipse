
//**************//
//Chương trình 1
//**************//

package programing;
	
	import java.util.Scanner;

	public class ImportAndExport {
	    
	    public static void main(String[] args) {
	        // Create a Scanner object to take input
	        Scanner input = new Scanner(System.in);

	        // Getting integer input
	        System.out.print("Enter an integer: ");
	        int number = input.nextInt();
	        System.out.println("You entered: " + number);

	        // Getting float input
	        System.out.print("Enter float: ");
	        float myFloat = input.nextFloat();
	        System.out.println("Float entered: " + myFloat);

	        // Getting double input
	        System.out.print("Enter double: ");
	        double myDouble = input.nextDouble();
	        System.out.println("Double entered: " + myDouble);

	        // Getting String input
	        System.out.print("Enter text: ");
	        String myString = input.next();
	        System.out.println("Text entered: " + myString);

	        // Closing the scanner object
	        input.close();
	    }
	}

	


//**************//
//Chương trình 2(Giống nhau)
//**************//
	
//	package programing;
//
//	import java.util.Scanner;
//
//	public class ImportAndExport 
//		{
//		    public static void main(String[] args) 
//		    {
//		    Scanner input = new Scanner(System.in);
//		    System.out.print("Enter an integer: ");
//		    int number = input.nextInt();
//		    System.out.println("You entered " + number);
//		    // Getting float input
//		    System.out.print("Enter float: ");
//		    float myFloat = input.nextFloat();
//		    System.out.println("Float entered = " + myFloat);
//		    // Getting double input
//		    System.out.print("Enter double: ");
//		    double myDouble = input.nextDouble();
//		    System.out.println("Double entered = " + myDouble);
//		    // Getting String input
//		    System.out.print("Enter text: ");
//		    String myString = input.next();
//		    System.out.println("Text entered = " + myString);
//		    // closing the scanner object
//		    input.close();
//		    }
//		}
