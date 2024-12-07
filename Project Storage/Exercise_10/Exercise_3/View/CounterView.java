package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Controller.CounterListener;
import Model.CounterModel;
//thiết lập cách nhìn 
public class CounterView extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//gọi các đối tường 
	private CounterModel counterModel;
	private JButton jbuttom_upA1;
	private JButton jbuttom_upA2;
	private JButton jbuttom_upA3;
	private JButton jbuttom_downB1;
	private JButton jbuttom_downB2;
	private JButton jbuttom_downB3;
	private JLabel jlaybel_value ;

	private JButton jbuttom_reset ;
	
	
	public CounterView() {
		this.counterModel = new CounterModel();
		this.init();//tự tạo hàm khởi tạo
		this.setVisible(true);
	}
		
	public void init() {
		this.setTitle("Counter");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		ActionListener ac = new CounterListener(this); 
		
		jbuttom_upA1 = new JButton("UP 1 VALUE");
		jbuttom_upA1.addActionListener(ac);
		jbuttom_upA2 = new JButton("UP 10 VALUE");
		jbuttom_upA2.addActionListener(ac);
		jbuttom_upA3 = new JButton("UP 100 VALUE");
		jbuttom_upA3.addActionListener(ac);
		jbuttom_downB1 = new JButton("DOWN 1 VALUE");
		jbuttom_downB1.addActionListener(ac);
		jbuttom_downB2 = new JButton("DOWN 10 VALUE");
		jbuttom_downB2.addActionListener(ac);
		jbuttom_downB3 = new JButton("DOWN 100 VALUE");
		jbuttom_downB3.addActionListener(ac);
		jbuttom_reset = new JButton("RESET VALUE");
		jbuttom_reset.addActionListener(ac);
		jlaybel_value = new JLabel(this.counterModel.getValue()+" ", JLabel.CENTER);
		

		JPanel JP_Button_UP = new JPanel(new GridLayout(3,1));
		JP_Button_UP.add(jbuttom_upA1);
		JP_Button_UP.add(jbuttom_upA2);
		JP_Button_UP.add(jbuttom_upA3);
		
		jbuttom_upA1.setBackground(Color.BLUE); 
		jbuttom_upA2.setBackground(Color.BLUE); 
		jbuttom_upA3.setBackground(Color.BLUE); 
		JPanel JP_Button_DOWN = new JPanel(new GridLayout(3,1));
		JP_Button_DOWN.add(jbuttom_downB1);
		JP_Button_DOWN.add(jbuttom_downB2);
		JP_Button_DOWN.add(jbuttom_downB3);
		
		jbuttom_downB1.setBackground(Color.YELLOW); 
		jbuttom_downB2.setBackground(Color.YELLOW); 
		jbuttom_downB3.setBackground(Color.YELLOW);
		
		JPanel JP = new JPanel();
		JP.setLayout(new BorderLayout(20,20));
		
		
		JP.add(JP_Button_UP, BorderLayout.WEST);
		JP.add(JP_Button_DOWN, BorderLayout.EAST);
		JP.add(jlaybel_value, BorderLayout.CENTER);
		JP.add(jbuttom_reset, BorderLayout.SOUTH);
		
		this.setLayout(new BorderLayout());
		this.add(JP, BorderLayout.CENTER);
		
	}
	
	public void increment1() {
		this.counterModel.incresment1();
		this.jlaybel_value.setText(this.counterModel.getValue()+"");
	}
	public void increment10() {
		this.counterModel.incresment10();
		this.jlaybel_value.setText(this.counterModel.getValue()+"");
	}
	
	public void increment100() {
		this.counterModel.incresment100();
		this.jlaybel_value.setText(this.counterModel.getValue()+"");
	}
	
	public void decrement1() {
		this.counterModel.decrement1();
		this.jlaybel_value.setText(this.counterModel.getValue()+"");
	}
	public void decrement10() {
		this.counterModel.decrement10();
		this.jlaybel_value.setText(this.counterModel.getValue()+"");
	}
	public void decrement100() {
		this.counterModel.decrement100();
		this.jlaybel_value.setText(this.counterModel.getValue()+"");
	}
	public void reset() {
		this.counterModel.reset();
		this.jlaybel_value.setText(this.counterModel.getValue()+"");
	}
}
