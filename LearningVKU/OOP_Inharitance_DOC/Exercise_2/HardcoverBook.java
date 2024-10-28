package Exercise_2;
import java.util.Scanner;
public class HardcoverBook extends Book {
	private int numberOfPages;

	public HardcoverBook() {
		super();
	}

	public HardcoverBook(int id, String title, String author, long price) {
		super(id, title, author, price);
	}

	public HardcoverBook(int numberOfPages) {
		super();
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

