package View;

import javax.swing.JFrame;
import Model.CounterModel;

public class CounterView extends JFrame{
	private CounterModel counterModel;
	private JButtom jbuttom_up;
	private JButtom jbuttom_down ;
	
	
	public CounterView() {
		this.counterModel = new CounterModel();
		this.init();//tự tạo hàm khởi tạo
		this.setVisible(true);
	}
		
	public void init() {
		this.setTitle("Counter");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	

	}
	

}
