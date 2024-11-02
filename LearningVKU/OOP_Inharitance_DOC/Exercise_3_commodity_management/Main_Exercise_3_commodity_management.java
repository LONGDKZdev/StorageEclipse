package Exercise_3_commodity_management;
import java.util.*;

import BookManage.Book;
import BookManage.EBook;
import BookManage.HardcoverBook;
public class Main_Exercise_3_commodity_management {

	public static void main(String[] args) {
		
		ProductManager PM = new ProductManager();
		
		NonPerishableProduct NPP = new NonPerishableProduct(0, null, null, 0, 0);
//		PP.input();
//		PM.addProductP(PP);
		
		boolean OK = true;
		
		while(OK) {
			System.out.println("===============MENU=============================");
			System.out.println("|1.Add new product							   |");
			System.out.println("|2.Search by ID								   |");
			System.out.println("|3.Print list product					   	   |");
			System.out.println("|4.Total all value product					   |");
			System.out.println("|5.Count the number of expired perishable goods|");
			System.out.println("|6.Exit							 			   |");
			System.out.println("================================================");
			
			Scanner In = new Scanner (System.in);
			System.out.print("Enter your choice : ");
			int choice = In.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("------------------------------");
				System.out.println("1. Add Perishable Product 	  ");
				System.out.println("2. Add Non Perishable Product ");
				System.out.println("------------------------------");
				System.out.print("Enter your choice: ");
				int subchoice = In.nextInt();
				if(subchoice == 1) {
					HardcoverBook HardcoverBook = new HardcoverBook();
					HardcoverBook.input();
					books.addBook(HardcoverBook);
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
				OK = false;
			}
			
			
			}
		
		int Choce;
		
		
	}

}
