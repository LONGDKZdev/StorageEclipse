package Exercise_2;
import java.util.Scanner;
public class EBook extends Book{
	private String format;
	private double fileSizeMB;
	public EBook() {
		super();
		
	}
	public EBook(int id, String title, String author, long price) {
		super(id, title, author, price);
		this.format = format;
		this.fileSizeMB = fileSizeMB;
		
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public double getFileSizeMB() {
		return fileSizeMB;
	}
	public void setFileSizeMB(double fileSizeMB) {
		this.fileSizeMB = fileSizeMB;
	}
	@Override
	public String toString() {
		return super.toString()
		+ "\nformat: "+format
		+"\nFile Size MB : "+fileSizeMB;
	}
	public void input() {
		Scanner In =new Scanner(System.in);
		super.input();
		System.out.println("Enter format :");
		format = In.nextLine();
		System.out.println("Enter File Size MB :");
		fileSizeMB = In.nextDouble();
	}
	
	public boolean isBigBook() {
		if(fileSizeMB >= 200) return true;
		 return false;
	}
	
	
	
}
