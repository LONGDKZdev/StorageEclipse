package model;
import java.util.Scanner;
public class HardCoverBook extends Book{
	private int numberOfPages;
	
	public HardCoverBook() {
		super();
	}

	public HardCoverBook(int id, String title, String author, long price, int numberOfPages) {
		super(id, title, author, price);
		this.numberOfPages = numberOfPages;
	}

	@Override
	void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter: ID");
		super.id = sc.nextInt();
		
		sc.nextLine(); // tránh lỗi trôi lệnh
		
		System.out.println("Enter title: ");
		super.title = sc.nextLine();
		
		System.out.print("Enter author: ");
		super.author = sc.nextLine();
		
		System.out.print("Enter price: ");
		super.price = sc.nextLong();
		
		System.out.print("Enter number of page:");
		numberOfPages = sc.nextInt();
	}

	@Override
	public String toString() {
		
		return null;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
}
