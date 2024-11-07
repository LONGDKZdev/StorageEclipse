package TITV_JavaSwing;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TITV_JavaSwing_79_GridLayout_2 extends JFrame {
	
	public TITV_JavaSwing_79_GridLayout_2() {
		this.setTitle("Test Programing");
		this.setSize(600,400);
		//căn giữa cửa sổ chương trình
		this.setLocationRelativeTo(null);
		
		//set Gridlayout   bố trí trên lưới (Kích cỡ giống nhau)
		GridLayout GL1 = new GridLayout(4,5);//thiết lập khoảng cách theo chiều dài và rộng	
		GridLayout GL2 = new GridLayout(4,4,25,25);
		GridLayout GL3 = new GridLayout();
		this.setLayout(GL2);
		
//		this.setLayout(FL2);
//		this.setLayout(FL3);
		
		
		JButton Buttom1 = new JButton("I");
		Buttom1.setSize(100,100);
		JButton Buttom2 = new JButton("II");
		Buttom2.setSize(100,100);
		JButton Buttom3 = new JButton("III");
		Buttom3.setSize(100,100);
		 
		//thêm thành phần(thêm thủ công)
//		this.add(Buttom1);
//		this.add(Buttom2);
//		this.add(Buttom3);
		
		//thêm thành phần(dùng vòng lặp)
		//10 là giới hạn số nút thêm
		for(int i = 0; i < 16;i++) {
			
			JButton JB = new JButton(i+" ");
			this.add(JB);
			
			
		}
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		TITV_JavaSwing_79_GridLayout_2 VD = new TITV_JavaSwing_79_GridLayout_2();
	VD.show();
	}
	
	
	
	
}
