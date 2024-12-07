package TITV_JavaSwing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TITV_JavaSwing_79_FlowLayout_1 extends JFrame {
	
	public TITV_JavaSwing_79_FlowLayout_1() {
		this.setTitle("Test Programing");
		this.setSize(600,400);
		//căn giữa cửa sổ chương trình
		this.setLocationRelativeTo(null);
		
		//set flowlayout   Căn lề
		FlowLayout FL1 = new FlowLayout(FlowLayout.CENTER, 50,50);//thiết lập khoảng cách theo chiều dài và rộng	
		FlowLayout FL2 = new FlowLayout(FlowLayout.LEFT);
		FlowLayout FL3 = new FlowLayout(FlowLayout.RIGHT);
		
		//thiết lập kiểu canh lề 
		this.setLayout(FL1);
//		this.setLayout(FL2);
//		this.setLayout(FL3);
		
		
		JButton Buttom1 = new JButton("I");
		Buttom1.setSize(100,100);
		JButton Buttom2 = new JButton("II");
		Buttom2.setSize(100,100);
		JButton Buttom3 = new JButton("III");
		Buttom3.setSize(100,100);
		 
		//thêm thành phần
		this.add(Buttom1);
		this.add(Buttom2);
		this.add(Buttom3);
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		TITV_JavaSwing_79_FlowLayout_1 VD = new TITV_JavaSwing_79_FlowLayout_1();
	VD.show();
	}
	
	
	
	
}
