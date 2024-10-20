package Exercise_2_Book_manage;
import java.util.Scanner;
public class BookManagement {
	private Book[] books;//khai báo
		
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
		for(int i = 0; i < books.length;i++) {
		books[i].input();
		}
	}
	
	public void outputs() {
		System.out.println("Danh sách các cuốn sách : ");
		for(int i = 0; i < books.length;i++) {
			System.out.println(books[i].toString());
			System.out.println("--------------------");
		}
	}
	
	public Book searchByID(int ID) {
		for(int i = 0; i < books.length;i++) {
			if(books[i].getID() == ID ) {
				return books[i];
			}
		}
		return null;
	}
	
}
