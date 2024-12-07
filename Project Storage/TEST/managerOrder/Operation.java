package managerOrder;
import java.util.Scanner ;
public class Operation {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		OrderManager orderManager= new OrderManager();
		
		boolean yet= true;
		// dùng vòng lặp while để in ra lệnh .
		while(yet) {
			System.out.println("-------------------------------system----------------------------");
			System.out.println("=1.thêm một đơn hàng .");
			System.out.println("=2. tìm kiếm một đơn hàng theo ID .");
			System.out.println("=3. hiển thị tất cả các đơn hàng trong danh sách .");
			System.out.println("=4. thoát chương trình .");
			System.out.println("nhập lựa chọng cuẩ bạn :");
			
		//	Scanner we= new Scanner (System.in);
			int select=sc.nextInt();
			switch(select) {
		case 1:
			System.out.println("chon đơn hàng cần thêm  :");
			System.out.println("/1. them đơn hàng bán lẻ /");
			System.out.println("/2. thêm đơn hàng bán buôn /");
			System.out.println("..............................");
			//Scanner subSelect= new Scanner (System.in);
			int subSelect=sc.nextInt();
		
			
			Order order;
			if(subSelect==1) {
				order= new RetailOrder();
			} 
			else {
				order= new WholesaleOrder();
			}
			order.input();
			orderManager.addOrder(order);
			break ;
			
//			if(subSelect==1) {
//			// khởi tạo đối tượng cho đơn hàng bán lẻ .
//				RetailOrder oder= new RetailOrder();
//				// thêm đơn hàng vào .
//				oder.input();
//				//orderManager.addOrder(oder);
//			}
//			else if(subSelect==2){
//				// khởi tọa đối tượng bán buôn .
//				WholesaleOrder oder= new WholesaleOrder();
//				oder.input();
//				orderManager.addOrder(oder);
//			}else {
//				System.out.println("không tìm thấy đơn hàng . ");
//			}
//			break ;
			// truươnhf hợp 2 .
		case 2:
			System.out.println(" tìm kiếm đơn hàng .");
			int chon=sc.nextInt();
			Order hang=orderManager.seachOrder(chon);
			if(hang==null) {
				System.out.println(" không tim thấy sách cùng id la :"+hang);
			}
			else {
				hang.toString();
				break ;
			}
			
			// trường hợp 3.
		case 3 :
			orderManager.toString();
			break ;
			default : 
				// đừng quyên  kết thúc chương trình để thoát vòng lặp while.
				yet=false;
			}
		}
	}
}
