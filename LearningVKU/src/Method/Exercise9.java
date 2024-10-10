package Method;

public class Exercise9 {
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
		///////////////////////////////
		System.out.println();
		System.out.println(Sum(25, 25));
		System.out.println(Sum(25, 25, 25));
		System.out.println(Sum(25.0, 25.0));
	}
	////////////////////////////////////////////////////

	// tham số

}
