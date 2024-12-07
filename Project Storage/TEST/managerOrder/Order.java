package managerOrder;
import java.util.Scanner ;
public  abstract class Order {
 
	
	/* can khia bao bang protected trong lop abstract 
	    de cac lop con co the truy cap trong goi .*/
	protected int orderID;
	protected String customerName;
	protected String orderDate ;
	
	public Order() {
		
	}

	public Order(int orderID, String customerName, String orderDate) {
		this.orderID = orderID;
		this.customerName = customerName;
		this.orderDate = orderDate;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID=orderID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	// tao input nhap thong tin don hang .
	public void input () {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("nhap thong tin don hang .");
		System.out.print(" nhap ma don hang :");
		orderID=sc.nextInt();
		sc.nextLine(); // tranh loi troi lenh .
		System.out.print(" nhap thong tin ten khach hang :");
		customerName= sc.nextLine();
		System.out.print("ngay dat hang :");
		orderDate= sc.nextLine();
		
		
	}

	@Override
	public String toString() {
		return " nhap id :"+orderID
				+"\n nhap ten khach hang :"+customerName
				+"\n nhap ngay dat hang :"+orderDate;
	}

	
}
