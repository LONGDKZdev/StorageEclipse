package Exercise_2;
import java.util.Scanner;
public class Main_Exercise_2_Doc {

public static void main(String[] args) {
	BookManager books = new BookManager();
		
	Book book1 = new Book(1,"Java","Nguyễn Thanh", 100);
	Book book2 = new Book(2,"C++","Đổ Công Đức", 150);
	Book book3 = new Book(3,"Database"," Lê Văn Minh", 50);
		
	HardcoverBook hbook = new HardcoverBook(4, "Sách cứng", "Đính", 10, 250);

	books.addBook(book1);
	books.addBook(book2);
	books.addBook(book3);
	books.addBook(hbook);
	// ép kiểu int = (int) long
	
	Scanner In = new Scanner(System.in);
	int in = In.nextInt();
	Book kqBook = books.searchBook(in);
	
//	Book kpBook = books.searchBook(4);
	
	if( kqBook != null) {
		System.out.println(kqBook.toString());
	}
	else {
		System.out.print("Không tìm thấy !");
	}
	
	}



}
