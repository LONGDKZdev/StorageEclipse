package Exercise_2;
import java.util.*;
public class Main_Exercise_2_Doc {

public static void main(String[] args) {
	BookManager books = new BookManager();

	boolean ok =true;
	
	while(ok) {
		System.out.println("=================MENU======================");
		System.out.println("|1. Thêm sách                             |");
		System.out.println("|2. Tìm kiếm sách theo ID                 |");
		System.out.println("|3. In ra danh sách                       |");
		System.out.println("|4. In ra tổng giá của các cuốn sách      |");
		System.out.println("|5 In ra tổng kích thước file của ebook   |");
		System.out.println("|6. Thoát chương trình !                  |");
		System.out.println(" ==========================================");
		
		Scanner In = new Scanner (System.in);
		System.out.print("Enter your choice : ");
		int choice = In.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("1. Thêm sách cứng ");
			System.out.println("2. Thêm sách điện tử");
			System.out.print("Enter your choice: ");
			int subchoice = In.nextInt();
			if(subchoice == 1) {
				HardcoverBook hbook = new HardcoverBook();
				hbook.input();
				books.addBook(hbook);
			}
			else if(subchoice == 2){
				EBook ebook = new EBook();
				ebook.input();
				books.addBook(ebook);
			}
			else {
				System.out.println("Lựa chọn không hợp lệ !");
			}
			break;
		case 2:
			System.out.print("Enter ID :");
			int id = In.nextInt();
			Book book = books.searchBook(id);
			
			if(book == null) {
				System.out.println("Không tìm thấy !");
			}
			else {
				System.out.println(book);
			}
			break;
		case 3:
			books.displayBook();
			break;
			
		case 4:
			System.out.println("Tổng giá sách: "+ books.totalPrice());
			break;
		case 5:
			System.out.println("Tổng kích thước ebook: "+ books.getTotalFileSize());
			break;
		default:
			ok = false;
		}
		
		
		}
	
	}
}
/*
BookManager books = new BookManager();

//Book book1 = new Book(1,"Java","Nguyễn Thanh", 100);
//Book book2 = new Book(2,"C++","Đổ Công Đức", 150);
//Book book3 = new Book(3,"Database"," Lê Văn Minh", 50);
//	
//HardcoverBook hbook1 = new HardcoverBook(4, "Sách cứng", "Đính", 10, 250);
//
//books.addBook(book1);
//books.addBook(book2);
//books.addBook(book3);
//books.addBook(hbook1);
// ép kiểu int = (int) long

HardcoverBook hbook1 = new HardcoverBook(1, "Java", "Dinh", 10, 250);
HardcoverBook hbook2 = new HardcoverBook(2, "C++", "Duong", 20, 300);

EBook ebook1 = new EBook(3, "DataBase", "Minh", 15, "pdf", 250);
EBook ebook2 = new EBook(4, "Giai tich", "Thinh", 15, "dox", 20);

//Thêm sách vào
books.addBook(hbook1);
books.addBook(hbook2);
books.addBook(ebook1);
books.addBook(ebook2);

System.out.println("Total price: "+ books.totalPrice());

System.out.println("Total file size: "+ books.getTotalFileSize());



//if( kqBook != null) {
//	System.out.println(kqBook.toString());
//}
//else {
//	System.out.print("Không tìm thấy !");
//}

*/

