package Additional_Exercises_For_Homework;
import java.util.Scanner;
public class Grades_Table_Java {


	public static void main(String[] args) {
		Scanner inValue = new Scanner (System.in);
		System.out.println("Grades table  include: \n ");
		System.out.println("2 grade lever 1  (gradeA, gradeB)");
		System.out.println("1 grade lever 2  (gradeC)");
		System.out.println("1 grade lever 3  (gradeD)");
		System.out.println("-----------------------------");
///////////////////////////////////////////////////////////////////
		double gradeA, gradeB, gradeC, gradeD;
			System.out.println("***grade lever 1***");
			System.out.print("Enter gradeA = ");
			 gradeA = inValue.nextDouble();
			System.out.print("Enter gradeB = ");
			 gradeB = inValue.nextDouble();
			System.out.println("***grade lever 2***");
			System.out.print("Enter gradeC = ");
			 gradeC = inValue.nextDouble();
			System.out.println("***grade lever 3***");
			System.out.print("Enter gradeD = ");
			 gradeD = inValue.nextDouble();
			System.out.println("-----------------------------");
//////////////////////////////////////////////////////////////////////////////////
////////////// Space (Enter grade again if grade < 0 || grade >10)////////////////
//////////////////////////////////////////////////////////////////////////////////		
			while(gradeA < 0 || gradeA > 10) 
				{
				System.out.println("*******************");
				System.out.println("Error! enter again!");
				System.out.println("*******************");
				System.out.println("***grade lever 1***");
				System.out.print("Enter gradeA again = ");
				gradeA = inValue.nextDouble();
				}
			while (gradeB < 0 || gradeB > 10) 
				{ 
				System.out.println("*******************");
				System.out.println("Error! enter again!");
				System.out.println("*******************");
				System.out.print("Enter gradeB again = ");
				gradeB = inValue.nextDouble();
				}
			while (gradeC < 0 || gradeC > 10) 
				{
				System.out.println("*******************");
				System.out.println("Error! enter again!");
				System.out.println("*******************");
				System.out.println("***grade lever 2***");
				System.out.print("Enter gradeC again = ");
				gradeC = inValue.nextDouble();
				}
			while (gradeD < 0 || gradeD > 10)
				{
				System.out.println("*******************");
				System.out.println("Error! enter again!");
				System.out.println("*******************");
				System.out.println("***grade lever 3***");
				System.out.print("Enter gradeD again = ");
				gradeD = inValue.nextDouble();
				}
//////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////
			
		gradeC *=2;
		gradeD *=3;
		
		double gradeOut = (gradeA + gradeB + gradeC + gradeD)/7;
		System.out.printf("Your score  = %.3f \n",gradeOut);
		 String X =((gradeOut >= 8.5 )?" Your letter grade:  A ": (gradeOut >= 7 && gradeOut < 8.5)?" Your letter grade: B ":(gradeOut < 7 && gradeOut >= 5.5)?" Your letter grade: C ":(gradeOut < 5.5 && gradeOut >= 4.5)?" Your letter grade: D ":" Your letter grade: F ");
		 System.out.println("----------------------------");
		 System.out.println("*********************");
		 System.out.println(X);
		 System.out.println("*********************");
	inValue.close();	
			// Cho biết điểm kiểm tra môn JAVA của 1 sinh viên 
			//(2 con điểm hệ số 1, 1 con điểm hệ số 2, 1 con điểm hệ số 3). 
			//In ra Kết quả học tập môn Java của bạn đó. Nếu điểm tổng kết >=8.5 đạt kết quả A, <8.5 
			//và >=7.0 đạt kết quả B, <7.0 và >=5.5 đạt kết quả C, <5.5 và >=4.0 đạt kết quả D, < 4.0 đạt kết quả F.
	}

}
