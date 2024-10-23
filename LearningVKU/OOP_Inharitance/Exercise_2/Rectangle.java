package Exercise_2;
import java.util.Scanner;
public class Rectangle {
	private int length = 0;
	private int width = 0;

public Rectangle(int length, int width) {
	this.length = length;
	this.width = width;
	}
public double getArea() {
    return length * width;
}
public double getPerimeter() {
    return 2 * (length + width);
	}
}

public class Square extends Rectangle {
	

	 
}
//Scanner In = new Scanner(System.in);
//System.out.print("Enter length :");
//	int length = In.nextInt();
//System.out.print("Enter width :");
//	int width = In.nextInt();