package OOP_Exercise;

public class Point {
	double x, y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double distance(Point other) {
		return Math.sqrt(Math.pow(other.getX() - this.x,2)+ Math.pow(other.getY()- this.y,2));

	}

}




