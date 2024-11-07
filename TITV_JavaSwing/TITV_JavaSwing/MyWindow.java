package TITV_JavaSwing;

import javax.swing.JFrame;
import java.util.*;
public class MyWindow extends JFrame{

	public MyWindow() {
			
	}
	//Hàm showWindow bị trùngd tên với lớp khác ==> đổi tên hàm showWindow thành tên bất kì	
	public void showWindow() {
		this.setVisible(true);
	}
	
	public void showWindow(String Title) {
		this.setTitle(Title);
		this.setVisible(true);
	}
	public void showWindow(String Title, int width, int height,int a, int b) {
		this.setTitle(Title);
		this.setSize(width, height);
		this.setLocation(a, b);
		this.setVisible(true);
	}
	
	
	
	//////////////////////////////////
	// Lớp để tùy chỉnh chương trình//
	//////////////////////////////////
//	 	public void InputSetting() {
//		Scanner In = new Scanner(System.in);
//		System.out.print("Set Title for you program :");
//		String Title = In.nextLine();
//		System.out.print("Enter width :");
//		int width = In.nextInt();
//		System.out.print("Enter height :");
//		int height = In.nextInt();
//		System.out.print("Enter a(x) :");
//		int a = In.nextInt();
//		System.out.print("Enter b(y) :");
//		int b = In.nextInt();
//		//Thêm dòng lệnh này để cập nhập 
//		this.setTitle(Title);
//		this.setSize(width,height);
//		this.setLocation(a, b);
//	}
		
	public static void main(String[] args) {
		MyWindow M1 = new MyWindow();
		M1.showWindow("Window 1",300,150,0,100);
		MyWindow M2 = new MyWindow();
		M2.showWindow("Window 2",300,150,300,100);
		MyWindow M3 = new MyWindow();
		M3.showWindow("Window 3",300,150,600,100);
		//đóng chương trình khi ấn exit
		M1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		M2.setDefaultCloseOperation(EXIT_ON_CLOSE);
		M3.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}	
		
		
}

