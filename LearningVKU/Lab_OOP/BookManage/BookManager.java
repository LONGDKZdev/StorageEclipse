package BookManage;
public class BookManager {
	protected  Book[] books;
	protected int size;

	// Cấp phát vùng nhớ lưu trữ
	//Quản lý sách lưu động
	public BookManager() {//Đây là hàm khởi tạo 
		books = new Book[100];//Quản lý tối đa 100 cuốn sách
		size =0;
	}
	
	public BookManager(Book[] books, int size) {
		this.books = books;
		this.size = size;
	}


	
//		
//		
//		if(b != null) {
//			System.out.println("Sách này đã tồn tại !");
//			return;
//		}
	public void addBook(Book book){
		if(searchByID(book.getId()) != null) {
			System.out.println("Sách đã tồn tại ");
			return ;
		}
		
		if(book instanceof HardcoverBook) {
		books[size] = new HardcoverBook();
		}
		else {
		books[size] = new EBook();
		}
		books[size] = book;
		size++;
	}
	
	public Book searchByID(int id) {
		//id là tham số truyền vào
		/*nếu quyển sách thứ i có ID == với ID đang 
		tìm thì trả về sách đó*/
		for(int i =0; i < size; i++) {
			if(books[i].getId() == id ) {
				return books[i];
			}
		}
		//Nếu không tìm thấy thì trả về null
		// Bắt buộc phải có null
		System.out.println("Không tìm thấy sách có id " + id);
		return null;

	}
	
	public void displayBook() {
		System.out.println("-------------LIST BOOKS-------------");
		for(int i =0; i < size; i++) {
			System.out.println(books[i].toString());
			System.out.println("--------------------------------");
		}
	}
	
	public long totalPrice() {
		long totalPrice = 0;
		for(int i =0; i < size; i++) {
			totalPrice += books[i].getPrice();
		}
		return totalPrice;
	}
	
	public double getTotalFileSize() {
		double total = 0;
		for(int i = 0; i < size; i++) {
			if(books[i] instanceof EBook)//Kiểm tra xem book có phải là EBook không
			{
				total = total + ((EBook)books[i]).getFileSizeMB();
				//Ép kiểu (EBook) ép từ books về EBook(điều kiện đúng thì mới ép kiểu )
			}
		}
		return total;
	}
	
	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	
	
	


	
	
}
