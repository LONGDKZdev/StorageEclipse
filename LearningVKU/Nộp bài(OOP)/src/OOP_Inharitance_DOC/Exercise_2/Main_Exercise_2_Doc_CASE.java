package Exercise_2;

public class Main_Exercise_2_Doc_CASE {
	public static void main(String[] args) {
	Book book = new Book();

	HardcoverBook hbook = new HardcoverBook (4, "Sach cung", "Dinh", 10, 250);

	EBook ebook = new EBook (5, "Sach PDF", "Duong", 20, ".pdf", 300.0);

	book = hbook;

	HardcoverBook ketqua = new HardcoverBook();

	if(book instanceof HardcoverBook) {

	System.out.println("This is a hard copy book");

	ketqua = (HardcoverBook)book;
		}
	else { 
		System.out.println("This is an e-book");
		}
	System.out.println(ketqua);
	}
}
