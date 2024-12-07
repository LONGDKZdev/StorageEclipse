package BookManage;
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


	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return "ID : " + super.id
				+"\nTitle : " + super.title
				+"\nAuthor : " + super.author
				+"\nPrice : " + super.price
				+"\nNumber Of Pages : "+ numberOfPages;
	}

	@Override
	public void input() {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter Information Hard Book");
		System.out.print("Enter ID : ");
		super.id =In.nextInt();
		In.nextLine();
		System.out.print("Enter Title : ");
		super.title =In.nextLine();
		System.out.print("Enter Auther : ");
		super.author =In.nextLine();
		System.out.print("Enter Price : ");
		super.price =In.nextLong();
		System.out.print("Enter Number Of Pages :");
		numberOfPages = In.nextInt();

	}

}

