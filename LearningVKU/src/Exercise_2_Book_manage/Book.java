package Exercise_2_Book_manage;
import java.util.*;
public class Book {
	
	private int ID;
	private String name;
	private double price;
	private int quantity;
	
	
	public Book() {
		name = " ";
	}
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Mã sách: " + ID
				+"\nTên sách: "+ name
				+"\nGiá sách: "+ price
				+"\nSố lượng: "+ quantity;
	}
	public void input() {
	    Scanner In = new Scanner(System.in);
	    System.out.print("Nhập mã sách: ");
	    ID = In.nextInt();
	    In.nextLine();
	    System.out.print("Nhập tên sách: ");
	    name = In.nextLine();
	    System.out.print("Nhập giá sách: ");
	    price = In.nextDouble();
	    System.out.print("Nhập số lượng: ");
	    quantity = In.nextInt();

	}

}




