package model;

public interface Digital {
	public final static double PI = 3.14;
	
	public boolean isBigBook();
	
	public double getFileSizeMB();
	
	default void demo() {
		System.out.println("Demo");
	}
}
