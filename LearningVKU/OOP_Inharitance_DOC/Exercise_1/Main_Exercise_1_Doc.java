package Exercise_1;

public class Main_Exercise_1_Doc {

	public static void main(String[] args) {
		Student a = new Student();
		Teacher b = new Teacher();
		
		a.input();
		b.input();
		System.out.println("##### Print Information #####");
		a.displayInfo();
		b.displayInfo();
		System.out.print(a.getAcademicPerformance());
	}

}
