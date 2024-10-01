package ExerciseForm;

import java.util.Scanner;

public class Exercise1_CaculateForLeapYearAndDayInYear {

	public static void main(String[] args) {
            try (Scanner inValue = new Scanner(System.in)) {
                System.out.print("Enter the year = ");
                
                int year = inValue.nextInt();
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                    System.out.println(year + " is leap year ");
                else
                    System.out.println(year + " isn't leap year ");
                
                System.out.print("Enter number of month from 1 to 12 =");
                int month = inValue.nextInt();
                while(month < 1 || month >12)
                {
                    System.out.print("ERROR! cann't caculate!, enter month again :");
                    month = inValue.nextInt();
                }
                ////////////////////////////////////////////////////////////////////////////////////////
                switch (month)
                {
                    case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Month "+ month + " in year "+year+" have 31 days ");
                    case 4, 6, 9, 11 -> System.out.println("Month "+ month + " in year "+year+" have 30 days ");
                    case 2 ->{
                        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                            System.out.println("Month "+ month + " in year "+year+" have 29 days ");
                        else
                            System.out.println("Month "+ month + " in year "+year+" have 28 days ");
                    }
                    ////////////////////////////////////////////////////////////////////////////////////////
                }
            }
	}

}
