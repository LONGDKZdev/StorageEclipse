package Exercise_2;

public class BookManager {
	private  Book[] books;
	private int size;

	// Cấp phát vùng nhớ lưu trữ
	//Quản lý sách lưu động
	public BookManager() {
		books = new Book[100];//Quản lý tối đa 100 cuốn sách
		size =0;
	}

	public BookManager(Book[] books, int size) {
		super();
		this.books = books;
		this.size = size;
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
	
	public void addBook(Book book){
		//Phương thức thêm sách
		Book b = searchBook(book.getId());
		//Tìm kiếm sách ngta truyền 
		//vào đã có trong ds chưa
		
		/*if(b != null) {
			System.out.println("Sách này đã tồn tại !");
			return;
		}*/
		
		books[size] = book;
		size++;
	}
	
	public Book searchBook(int id) {
		//id là tham số truyền vào
		for(int i =0; i < size; i++) {
			/*nếu quyển sách thứ i có ID == với ID đang 
			tìm thì trả về sách đó*/
			if(books[i].getId() == id ) {
				return books[i];
			}
		}
		//Nếu không tìm thấy thì trả về null
		// Bắt buộc phải có null
		System.out.println("Không tìm thấy sách có id " + id);
		return null;
	}
	
}
