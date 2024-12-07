package managerOrder;

public class OrderManager {

	private Order[] order;
    private int size;
	
	
	public OrderManager() {
		super();
		this.size=0;
	this.order= new Order[10];
	}

	public OrderManager(Order[] order, int size) {
		this.order = order;
		this.size=size;
	}
	// phương thức tìm kiếm một đơn hàng .
	public Order seachOrder(int orderID) {   // tim kiem trong mang thi phai dung kieu du lieu order chu 
		for (int i=0; i<size; i++) {
			if((order[i].getOrderID())==orderID) {
				return order[i];// khi mà điều kiện đúng thì trả về chính sachs đúng .
			}
		}
		return null;
	}
	
	// them mot đơn hàng .
	public void addOrder(Order orde) {
		if(seachOrder(orde.getOrderID())!= null) {
			System.out.println(" don hang da ton tai .");
		
			}
		/* kiểm tra xem orde có phải là một trường hợp của RetailOrder(đơn hàng bán lẻ ) hay không  */
		else if ( orde instanceof RetailOrder) {
			order[size]= new RetailOrder();
			 return ;
		}
		else {
			order [size]= new WholesaleOrder();
			
		}
	}
	// hiển thị tất cả các dơn hàng .
	public void displayOrders() {
		System.out.println(" danh sách taats cả các đơn hàng :");
		
		for (int i =0 ; i< size; i++) {
		System.out.println(order[i].toString());
		
		}
	}
}
