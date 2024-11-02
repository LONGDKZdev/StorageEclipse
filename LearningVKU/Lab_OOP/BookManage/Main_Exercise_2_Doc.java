package BookManage;
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
			System.out.println("-------------------------");
			System.out.println("|1. Add hard cover book |");
			System.out.println("|2. Add Ebook 			|");
			System.out.println("-------------------------");
			System.out.print("Enter your choice: ");
			int subchoice = In.nextInt();
			if(subchoice == 1) {
				HardcoverBook hardcoverBook = new HardcoverBook();
				hardcoverBook.input();
				books.addBook(hardcoverBook);
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
			Book book = books.searchByID(id);
			
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
// Note
}


