package B3;

public class MainTest {

	public static void main(String[] args) {
		Class3 C3 = new Class3();


		Class2.m1C2();
		Class2.m2C2();
		Class3.m1C3();
		Class3.m2C3();

		System.out.println("---------------------");
		Class2 C2 = new Class2();

		Class1.m1C1();
		Class1.m2C1();
		Class2.m1C2();
		Class2.m2C2();


		System.out.println("---------------------");
		Class1 In1 = new Class1();
		Class1.Caculate();
	}

}
