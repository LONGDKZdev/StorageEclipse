package TITV_JavaSwing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TITV_JavaSwing_80_JPanel extends JFrame{
	
	public TITV_JavaSwing_80_JPanel() {
		this.setTitle("My Caculate");
		this.setSize(300, 300);
		//xuất hiện ở giữa màng hình
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JTextField JT = new JTextField(50);
		//thêm
		JPanel JP_Head = new JPanel();
		JP_Head.setLayout(new BorderLayout());
		JP_Head.add(JT, BorderLayout.CENTER);
		
		
		JButton JB_0 = new JButton("0");
		JButton JB_1 = new JButton("1");
		JButton JB_2 = new JButton("2");
		JButton JB_3 = new JButton("3");
		JButton JB_4 = new JButton("4");
		JButton JB_5 = new JButton("5");
		JButton JB_6 = new JButton("6");
		JButton JB_7 = new JButton("7");
		JButton JB_8 = new JButton("8");
		JButton JB_9 = new JButton("9");
		JButton JB_cong = new JButton("+");
		JButton JB_tru = new JButton("-");
		JButton JB_nhan = new JButton("*");
		JButton JB_chia = new JButton("/");
		JButton JB_bang = new JButton("=");
		
		JPanel JP_Button = new JPanel();
		//gom từng thành phần thành 1 gói riêng
		
		JP_Button.setLayout(new GridLayout(5,3));
//		for(int i =0; i < 15;i++) {
//			this.add();
//		}
		
		
		JP_Button.add(JB_0);
		JP_Button.add(JB_1);
		JP_Button.add(JB_2);
		JP_Button.add(JB_3);
		JP_Button.add(JB_4);
		JP_Button.add(JB_5);
		JP_Button.add(JB_6);
		JP_Button.add(JB_7);
		JP_Button.add(JB_8);
		JP_Button.add(JB_9);
		JP_Button.add(JB_cong);
		JP_Button.add(JB_tru);
		JP_Button.add(JB_nhan);
		JP_Button.add(JB_chia);
		JP_Button.add(JB_bang);
		
		this.setLayout(new BorderLayout());
		this.add(JP_Head,BorderLayout.NORTH);
		this.add(JP_Button, BorderLayout.CENTER);
		
		
		this.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new TITV_JavaSwing_80_JPanel();
		}
}
