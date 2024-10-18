package OOP_Exercise;

public class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int distance(Point other) {
		return Math.sqrt(Math.pow(other.getX() - this.x,2)+ Math.pow(other.getY()- this.y,2));

	}

}




