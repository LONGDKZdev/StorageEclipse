package Exercise_2_Book_manage;
import java.util.Scanner;
public class BookManagement {
	protected Book[] books;//khai báo

	public BookManagement() {
		int n = inputLengthBooks();
		books = new Book[n];
		for(int i = 0; i < n;i++) {
			books[i] = new Book();// cấp phát
		}
	}

	public BookManagement(Book[] books) {
		this.books = books;
	}
	public int inputLengthBooks() {
		Scanner In =new Scanner (System.in);
		System.out.print("Nhập vào số lượng sách :");
		int n = In.nextInt();
		return n;

	}
	public Book[] getBooks() {
		return books;
	}

	public void inputs() {
		System.out.println("Nhập thông tin cho mảng các sách ");
		for (Book book : books) {
		book.input();
		}
	}

	public void outputs() {
		System.out.println("Danh sách các cuốn sách : ");
		for (Book book : books) {
			System.out.println(book.toString());
			System.out.println("--------------------");
		}
	}

	public Book searchByID(int ID) {
		for (Book book : books) {
			if(book.getID() == ID ) {
				return book;
			}
		}
		return null;
	}

}
