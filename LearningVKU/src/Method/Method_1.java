package Method;

public class Method_1 {

	public static void Information() {
		System.out.println("Full Name: VO HUY LONG ");
		System.out.println("Age: 18");

	}

	public static void Information2(String fullName, String Age, String Class) {
		System.out.println("Full Name : " + fullName);
		System.out.println("Age : " + Age);
		System.out.println("Class : " + Class);

	}

	public static int value() {
		return 2024;
	}

//	public static int Sum(int a, int b) {
//		return a + b;
//	}
////////////////////////////////////////////////////////////////////
	public static int Sum(int a, int b) {
		System.out.println("Sum 1");
		return a + b;
	}

	public static int Sum(int a, int b, int c) {
		System.out.println("Sum 2");
		return a + b + c;
	}

	public static double Sum(double a, double b) {
		System.out.println("Sum 3");
		return a + b;
	}

	public static void main(String[] args) {
		Information();
		System.out.println(value());
		///////////////////////////////
		System.out.println();
		Information2("Vo Huy Long 2", "19", "24IT4");
		System.out.println(Sum(25, 25));
		System.out.println(Sum(25, 25, 25));
		System.out.println(Sum(25.0, 25.0));
	}
	////////////////////////////////////////////////////

	// tham số

}
