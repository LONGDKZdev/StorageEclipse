package Exercise_2;
import java.util.Scanner;
public class HardcoverBook extends Book {
	protected int numberOfPages;

	public HardcoverBook() {
		super();
	}

	public HardcoverBook(int id, String title, String author, long price,int numberOfPages) {
		super(id, title, author, price);
		this.numberOfPages = numberOfPages;
	}

	public String toString() {
		return super.toString()
				+"\nNumber Of Pages : "+ numberOfPages;	
	}
	
	public void input() {
		Scanner In = new Scanner(System.in);
		super.input();
		System.out.print("Enter Number Of Pages :");
		numberOfPages = In.nextInt();
	}
}

