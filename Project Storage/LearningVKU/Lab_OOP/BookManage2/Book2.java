package BookManage2;

public abstract class Book2 {

	protected int id;
	protected String title;
	protected String author;
	protected long price;

	public Book2() {
	}

	public Book2(int id, String title, String author, long price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public abstract String toString2();
	public abstract void input2();


}
