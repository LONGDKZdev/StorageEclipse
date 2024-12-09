package View_2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controller_3.MiniCalculatorListener;
import Model_1.MiniCalculatorModel;

public class MiniCalculatorView extends JFrame{
	private MiniCalculatorModel MiniCalculatorModel;
	private JTextField JT_fistValue_In;
	private JTextField JT_secondValue_In;
	private JTextField JT_answer_Out;

	public MiniCalculatorView() {
		this.MiniCalculatorModel = new MiniCalculatorModel();
		this.init();
	}
	
	private void init() {
		this.setTitle("Mini Calculator");
		this.setSize(300,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);;
		//Thiết lập kiểu chữ
		Font fr = new Font("Time new roman", Font.BOLD, 15);
		//thiết lập vị trí
		JLabel JL_fistValue = new JLabel("1st Value");
		JL_fistValue.setFont(fr);
		JLabel JL_secondValue = new JLabel("2st Value");
		JL_secondValue.setFont(fr);
		JLabel JL_answer = new JLabel("Answer");
		JL_answer.setFont(fr);
		
		//đẩy (JTextField) lên biến cục bộ 
		JT_fistValue_In = new JTextField(50);
		JT_fistValue_In.setFont(fr);
		JT_secondValue_In = new JTextField(50);
		JT_secondValue_In.setFont(fr);
		JT_answer_Out = new JTextField(50);
		JT_answer_Out.setFont(fr);
		
		
		JPanel JP_IN = new JPanel();
		JP_IN.setLayout(new GridLayout(3,2,10,50));//3 dòng 2 cột 
		JP_IN.add(JL_fistValue);
		JP_IN.add(JT_fistValue_In);
		JP_IN.add(JL_secondValue);
		JP_IN.add(JT_secondValue_In);
		JP_IN.add(JL_answer);
		JP_IN.add(JT_answer_Out);
		
		
		/////////////////////////////////////////////////////////////////
		MiniCalculatorListener listener = new MiniCalculatorListener(this);
		JButton JB_plus = new JButton("+");
		JB_plus.setFont(fr);
		JB_plus.addActionListener(listener);
		JButton JB_minus = new JButton("-");
		JB_minus.setFont(fr);
		JB_minus.addActionListener(listener);
		JButton JB_multiply = new JButton("*");
		JB_multiply.setFont(fr);
		JB_multiply.addActionListener(listener);
		JButton JB_divide = new JButton("/");
		JB_divide.setFont(fr);
		JB_divide.addActionListener(listener);
		JButton JB_pow = new JButton("^");
		JB_pow.setFont(fr);
		JB_pow.addActionListener(listener);
		JButton JB_mod = new JButton("%");
		JB_mod.setFont(fr);
		JB_mod.addActionListener(listener);
		
		
		JPanel JP_Button = new JPanel();
		JP_Button.setLayout(new GridLayout(2,3));//2 cột 3 dòng
		JP_Button.add(JB_plus);
		JP_Button.add(JB_minus);
		JP_Button.add(JB_multiply);
		JP_Button.add(JB_divide);
		JP_Button.add(JB_pow);
		JP_Button.add(JB_mod);
		//thêm Các đối tượng vào chương trình
		this.setLayout(new BorderLayout(20,20));
		this.add(JP_IN, BorderLayout.NORTH);
		this.add(JP_Button, BorderLayout.CENTER);
		
		
		
		
		this.setVisible(true);
	}
	public void plus() {
		//valueOf giá trị của
		double fistValue = Double.valueOf(JT_fistValue_In.getText());
		double secondValue = Double.valueOf(JT_secondValue_In.getText());
		//Nhận dữ liệu vào
		this.MiniCalculatorModel.setFistValue(fistValue);
		this.MiniCalculatorModel.setSecondValue(secondValue);
		this.MiniCalculatorModel.plus();
		this.JT_answer_Out.setText(this.MiniCalculatorModel.getAnswer()+"");
	}
	
	public void minus() {
		
		double fistValue = Double.valueOf(JT_fistValue_In.getText());
		double secondValue = Double.valueOf(JT_secondValue_In.getText());
				
		this.MiniCalculatorModel.setFistValue(fistValue);
		this.MiniCalculatorModel.setSecondValue(secondValue);
		this.MiniCalculatorModel.minus();
		this.JT_answer_Out.setText(this.MiniCalculatorModel.getAnswer()+"");
	}
	
	public void multiply() {
	
		double fistValue = Double.valueOf(JT_fistValue_In.getText());
		double secondValue = Double.valueOf(JT_secondValue_In.getText());
				
		this.MiniCalculatorModel.setFistValue(fistValue);
		this.MiniCalculatorModel.setSecondValue(secondValue);
		this.MiniCalculatorModel.multiply();
		this.JT_answer_Out.setText(this.MiniCalculatorModel.getAnswer()+"");
	}
	
	public void divide() {
		
		double fistValue = Double.valueOf(JT_fistValue_In.getText());
		double secondValue = Double.valueOf(JT_secondValue_In.getText());
				
		this.MiniCalculatorModel.setFistValue(fistValue);
		this.MiniCalculatorModel.setSecondValue(secondValue);
		this.MiniCalculatorModel.divide();
		this.JT_answer_Out.setText(this.MiniCalculatorModel.getAnswer()+"");
	}
	
	public void pow() {
		
		double fistValue = Double.valueOf(JT_fistValue_In.getText());
		double secondValue = Double.valueOf(JT_secondValue_In.getText());
				
		this.MiniCalculatorModel.setFistValue(fistValue);
		this.MiniCalculatorModel.setSecondValue(secondValue);
		this.MiniCalculatorModel.pow();
		this.JT_answer_Out.setText(this.MiniCalculatorModel.getAnswer()+"");
	}
	public void mod() {
		
		double fistValue = Double.valueOf(JT_fistValue_In.getText());
		double secondValue = Double.valueOf(JT_secondValue_In.getText());
			
		this.MiniCalculatorModel.setFistValue(fistValue);
		this.MiniCalculatorModel.setSecondValue(secondValue);
		this.MiniCalculatorModel.mod();
		this.JT_answer_Out.setText(this.MiniCalculatorModel.getAnswer()+"");
	}
}
