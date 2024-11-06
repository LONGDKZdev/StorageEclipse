package TEST01;

public class TEST1 {

	public static void main(String[] args) {
		int [] arr = new int[5];
		// dùng để bắt lỗi lại để chương trình vẫn hoặc động bình thường
	//chứ không dừng toàn bộ chương trình 
		try 
		{
			double a = 10/0;
			int i = arr[10];
			
			System.out.println("Code 1");
		}
		//bắt các lỗi để chương trình vẫn chạy bình thường 
		
		// gặp lỗi đầu tiên double a = 10/0; ==> nó sẽ không chạy các lệnh
		//	int i = arr[10];
		// và   System.out.println("Code 1");
		// Giải pháp ===> tách ra thành 2 try
		
		catch( ArrayIndexOutOfBoundsException ex) {
			System.out.println("Error i");
		}
		catch( ArithmeticException ex) {
			System.out.println("Error a");
		}
		finally {//luôn thực hiện 
			System.out.println("Code 3");
		}
//		System.out.println("Code 1");
//		System.out.println("Code 2");
		System.out.println("Code 4");
	}
	
	
	
	
	

}
