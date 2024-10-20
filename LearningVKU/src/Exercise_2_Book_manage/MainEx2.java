//package Exercise_2_Book_manage;
//import java.util.*;
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner In = new Scanner(System.in);
//		BookManagement books = new BookManagement();
//
//		boolean ok = true;
//		
//	while(ok) {
//		System.out.println("==============MENU=============");
//		System.out.println("1. Nhập danh sách các cuốn sách");
//		System.out.println("2. Nhập danh sách các cuốn sách");
//		System.out.println("3. Nhập danh sách các cuốn sách");
//		System.out.println("4. Nhập danh sách các cuốn sách");
//		System.out.println("===============================");
//		
//		System.out.println("Nhập lựa chọn của bạn: ");
//		int choice = In.nextInt();
//		
//		switch(choice) {
//		case 1:
//			books.inputs();
//			break;
//		case 2:
//			books.outputs();
//			break;
//		case 3 :
//			System.out.print("Nhập vào ID sách muốn tìm kiếm: ");
//			int ID = In.nextInt();
//			Book book = books.searchByID(ID);
//			System.out.println(book.toString());
//			break;
//		default:
//			ok = false;
//			}
//		}
//	In.close();
//	}
//
//}

package Exercise_2_Book_manage;
import java.util.Scanner;

public class MainEx2 {

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        BookManagement books = new BookManagement();
        boolean ok = true;
        
        while(ok) {
            System.out.println("==============MENU=============");
            System.out.println("1. Nhập danh sách các cuốn sách (Input book list)");
            System.out.println("2. Xuất danh sách các cuốn sách (Output book list)");
            System.out.println("3. Tìm kiếm sách theo ID (Search book by ID)");
            System.out.println("4. Thoát (Exit)");
            System.out.println("===============================");
            
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = In.nextInt();
            
            switch(choice) {
                case 1:
                    books.inputs(); 
                    break;
                case 2:
                    books.outputs(); 
                    break;
                case 3:
                    System.out.print("Nhập vào ID sách muốn tìm kiếm: ");
                    int ID = In.nextInt();
                    Book book = books.searchByID(ID); 
                    if (book != null) {
                        System.out.println(book.toString());
                    } else {
                        System.out.println("Không tìm thấy sách với ID này.");
                    }
                    break;
                case 4:
                    ok = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
        In.close();
    }
}

