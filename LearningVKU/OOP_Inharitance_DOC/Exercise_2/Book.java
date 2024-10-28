package Exercise_2;
import java.util.Scanner;
public class Book {
	private int id;
	private String title;
	private String author;
	private long price;
	public Book() {
		
	}
	public Book(int id, String title, String author, long price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ID :" + id
				+"\nTitle :" + title
				+"\nAuthor :" + author
				+"\nPrice :" + price;
	}
	
	public void input() {
		Scanner In = new Scanner(System.in);
		System.out.print("Enter ID : ");
		id = In.nextInt();
		In.nextLine();
		System.out.print("Enter Title : ");
		title = In.nextLine();
		System.out.print("Enter Author : ");
		author = In.nextLine();
		System.out.print("Enter Price : ");
		price = In.nextLong();
	}
	

}
