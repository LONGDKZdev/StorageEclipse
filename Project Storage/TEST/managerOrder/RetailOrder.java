package managerOrder;

import java.util.Scanner;


// mô tả lớp đại diện cho cửa hàng bán lẻ .

public class RetailOrder extends Order{
  
	private double totalAmount;
	
	public RetailOrder() {
		
	}
	public RetailOrder(int  order, String cusString, String orderString ,double totalAmount) {
		super( order,  cusString,  orderString );
		this.totalAmount= totalAmount;
	}
	
	public void input() {
		Scanner sc= new Scanner (System.in);
		System.out.println("nhap thong tin don hang ");
		System.out.print("nhap ma id :");
		super.orderID=sc.nextInt();
		sc.nextLine(); // tranh loi troi lenh .
		System.out.print("nhap thong tin ten khach hang :");
		customerName= sc.nextLine();
		System.out.print("ngay dat hang :");
		orderDate= sc.nextLine();
		System.out.print("tong sp tien :");
		totalAmount=sc.nextDouble();
	}
	
	
	
	@Override
	public String toString() {
		return " nhap id :"+orderID
				+"\n nhap ten khach hang :"+customerName
				+"\n nhap ngay dat hang :"+orderDate
				+"\n tong so tien :"+totalAmount;
		
		
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
}
