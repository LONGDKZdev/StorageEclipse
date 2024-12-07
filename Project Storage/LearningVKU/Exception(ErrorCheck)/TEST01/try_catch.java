package TEST01;
import java.util.Scanner;
public class try_catch {

	public static void main(String[] args) {
		//thêm try catch để tiếp tục hoạt động chứ chương trình
		//không bị sập
		Scanner In =new Scanner(System.in);
		System.out.print("Enter Age : ");
		try {
			int Age = In.nextInt();
		}
		//exception
		catch(Exception e){
			System.out.println("Đầu vào của bạn không hợp lệ!!!");
		}
		System.out.println(" Vẫn hoạt động bình thường ");


	}

}
