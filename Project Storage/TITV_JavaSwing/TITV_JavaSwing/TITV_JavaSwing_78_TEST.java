package TITV_JavaSwing;

import javax.swing.JFrame;

public class TITV_JavaSwing_78_TEST {
	
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("Test programing");
//		jf.setSize(600, 400);
//		jf.setLocation(300,300);
		jf.setVisible(true);
//		Hoặc thiết lập thành 
		jf.setBounds(300, 300, 600, 400);
		//đóng chương trình sau khi nhấn nút exit
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		//dòng để thử chương trình đang chạy hay không
		while(true){
			System.out.println("Program runing ");
			}	
		}
}
