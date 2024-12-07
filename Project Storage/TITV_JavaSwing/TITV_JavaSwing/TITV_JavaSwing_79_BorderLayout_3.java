package TITV_JavaSwing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TITV_JavaSwing_79_BorderLayout_3 extends JFrame {
	
	public TITV_JavaSwing_79_BorderLayout_3() {
		this.setTitle("Test Programing");
		this.setSize(600,400);
		//căn giữa cửa sổ chương trình
		this.setLocationRelativeTo(null);
		
		//set BorderLayout   thiết lập hướng xuất hiện
		BorderLayout BL1 = new BorderLayout();
		BorderLayout BL2 = new BorderLayout(100,100);
		//giản cách theo chiều cao và chiều rộng

		
		//thiết lập kiểu canh lề 
		this.setLayout(BL2);
//		this.setLayout(FL2);
		
		
		JButton Buttom1 = new JButton("NORTH");
		JButton Buttom2 = new JButton("SOUTH");
		JButton Buttom3 = new JButton("WEST");
		JButton Buttom4 = new JButton("EAST");
		JButton Buttom5 = new JButton("CENTER");
		 
		//thêm thành phần
		this.add(Buttom1, BorderLayout.NORTH);
		this.add(Buttom2, BorderLayout.SOUTH);
		this.add(Buttom3, BorderLayout.WEST);
		this.add(Buttom4, BorderLayout.EAST);
		this.add(Buttom5, BorderLayout.CENTER);
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		TITV_JavaSwing_79_BorderLayout_3 VD = new TITV_JavaSwing_79_BorderLayout_3();
	VD.show();
	}
	
	
	
	
}
