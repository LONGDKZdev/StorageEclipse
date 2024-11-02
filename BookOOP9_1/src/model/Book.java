package model;

public abstract class Book {
	protected int id;
	protected String title;
	protected String author;
	protected long price;
	
	public Book() {
	}

	public Book(int id, String title, String author, long price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	abstract void input();
	
	public abstract String toString();
	
	public void demo() {
		System.out.println("demo");
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
	
}
