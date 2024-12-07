package managerOrder;

import java.util.Scanner;

// lớp đại diện cho bán buôn .
public class WholesaleOrder extends Order implements Deliverable {

	
	protected double bulkDIscount;
	protected boolean isDelivered;
	
	public WholesaleOrder() {
		
	}
	
	public WholesaleOrder(int bulkDIscount, boolean isDelivered) {
		this.bulkDIscount = bulkDIscount;
		this.isDelivered = isDelivered;
	}
	
	public void input() {
Scanner sc =new Scanner(System.in);
		
		System.out.println("nhap thong tin don hang .");
		System.out.print("nhap ma don hang :");
		super.orderID=sc.nextInt();
		sc.nextLine(); // tranh loi troi lenh .
		System.out.print("nhap thong tin ten khach hang :");
		customerName= sc.nextLine();
		System.out.print("ngay dat hang :");
		orderDate= sc.nextLine();
		System.out.print("nhap gia ban buon :");
		bulkDIscount=sc.nextDouble();
		System.out.print("trang thai giao hang :");
		isDelivered= sc.nextBoolean();
	}
	
	// triển khai phuong thuc deliver từ  interface.
	
	//*** can chu y kiem tra 
//	public boolean  Deliverable() {
//		return isDelivered;
//	}
	
	
	public double getBulkDIscount() {
		return bulkDIscount;
	}
	public void setBulkDIscount(double bulkDIscount) {
		this.bulkDIscount = bulkDIscount;
	}
	public boolean isDelivered() {
		return isDelivered;
	}
	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}

	@Override
	public boolean isDeliverable() {
		// TODO Auto-generated method stub
		return false;
	}
}
