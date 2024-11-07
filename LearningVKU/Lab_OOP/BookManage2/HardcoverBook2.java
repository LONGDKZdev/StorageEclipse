package BookManage2;
import java.util.Scanner;
public class HardcoverBook2 extends Book2 {
	protected int numberOfPages;

	public HardcoverBook2() {
		super();
	}
	public HardcoverBook2(int id, String title, String author, long price, int numberOfPages) {
		super(id, title, author, price);
		this.numberOfPages =numberOfPages;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}


	@Override
	public void input2() {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter information hard cover Book :");
		System.out.print("Enter ID:");
		super.id = In.nextInt();
		System.out.print("Enter title:");
		super.title = In.nextLine();
		System.out.print("Enter author:");
		super.author = In.nextLine();
		System.out.print("Enter price:");
		super.price = In.nextLong();
		System.out.print("Enter Number Of Pages :");
		numberOfPages = In.nextInt();
	}
	@Override
	public String toString2() {
		return 	"ID :" + super.id
				+"\nYitle : " + super.title
				+"\nAuthor : " + super.author
				+"\nPrice : " + super.price
				+"\nNumberOfPages : " + numberOfPages;
	}





}
