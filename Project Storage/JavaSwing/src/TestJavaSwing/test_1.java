package TestJavaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class test_1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPanel;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test_1 frame = new test_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public test_1() {
		setAlwaysOnTop(true);
		setTitle("Caculate");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 315, 400);
		contentPanel = new JPanel();
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(192, 192, 192));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField.setBounds(10, 14, 279, 76);
		textField.setDropMode(DropMode.ON);
		contentPanel.add(textField);
		textField.setColumns(2);
		
		JTextPane txtpnNumber = new JTextPane();
		txtpnNumber.setBounds(79, 44, -41, 20);
		txtpnNumber.setForeground(Color.BLACK);
		txtpnNumber.setText("number");
		contentPanel.add(txtpnNumber);
		
		JButton btnNewButton_2_1 = new JButton("M+");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1.setBounds(178, 101, 55, 35);
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPanel.add(btnNewButton_2_1);
		
		JButton btnNewButton_1_1 = new JButton("M-");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(234, 101, 55, 35);
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPanel.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1_1 = new JButton("MR");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_2_1_1.setBounds(66, 101, 55, 35);
		contentPanel.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("MS");
		btnNewButton_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_1_1_1.setBounds(121, 101, 55, 35);
		contentPanel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton("MC");
		btnNewButton_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_2_1_1_1.setBounds(11, 101, 55, 35);
		contentPanel.add(btnNewButton_2_1_1_1);
		
		JButton btnNewButton_1_1_2_1 = new JButton("=");
		btnNewButton_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnNewButton_1_1_2_1.setBounds(234, 253, 55, 85);
		contentPanel.add(btnNewButton_1_1_2_1);
		
		JButton btnNewButton_2_1_1_1_1 = new JButton("");
		btnNewButton_2_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_2_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_2_1_1_1_1.setBounds(10, 138, 55, 35);
		contentPanel.add(btnNewButton_2_1_1_1_1);
		
		JButton btnNewButton_2_1_1_2 = new JButton("CE");
		btnNewButton_2_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_2_1_1_2.setBounds(65, 138, 55, 35);
		contentPanel.add(btnNewButton_2_1_1_2);
		
		JButton btnNewButton_1_1_1_1 = new JButton("C");
		btnNewButton_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_1_1_1_1.setBounds(121, 138, 55, 35);
		contentPanel.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_2_1_2 = new JButton("M+");
		btnNewButton_2_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_2_1_2.setBounds(177, 138, 55, 35);
		contentPanel.add(btnNewButton_2_1_2);
		
		JButton btnNewButton_1_1_2 = new JButton("M-");
		btnNewButton_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_1_1_2.setBounds(233, 138, 55, 35);
		contentPanel.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_2_1_1_1_1_1 = new JButton("4");
		btnNewButton_2_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1_1_1_1_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnNewButton_2_1_1_1_1_1.setForeground(Color.BLACK);
		btnNewButton_2_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_2_1_1_1_1_1.setBounds(11, 209, 55, 40);
		contentPanel.add(btnNewButton_2_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_2 = new JButton("7");
		btnNewButton_2_1_1_1_2.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnNewButton_2_1_1_1_2.setForeground(Color.BLACK);
		btnNewButton_2_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_2_1_1_1_2.setBounds(10, 173, 55, 35);
		contentPanel.add(btnNewButton_2_1_1_1_2);
		
		JButton btnNewButton_2_1_1_3 = new JButton("8");
		btnNewButton_2_1_1_3.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnNewButton_2_1_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_2_1_1_3.setBounds(65, 173, 55, 35);
		contentPanel.add(btnNewButton_2_1_1_3);
		
		JButton btnNewButton_2_1_1_2_1 = new JButton("5");
		btnNewButton_2_1_1_2_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnNewButton_2_1_1_2_1.setForeground(Color.BLACK);
		btnNewButton_2_1_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_2_1_1_2_1.setBounds(66, 209, 55, 40);
		contentPanel.add(btnNewButton_2_1_1_2_1);
		
		JButton btnNewButton_1_1_1_2 = new JButton("9");
		btnNewButton_1_1_1_2.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnNewButton_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1_1_1_2.setBounds(121, 173, 55, 35);
		contentPanel.add(btnNewButton_1_1_1_2);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("6");
		btnNewButton_1_1_1_1_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnNewButton_1_1_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1_1_1_1_1.setBounds(122, 209, 55, 40);
		contentPanel.add(btnNewButton_1_1_1_1_1);
		
		JButton btnNewButton_2_1_3 = new JButton("/");
		btnNewButton_2_1_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_2_1_3.setBounds(177, 173, 55, 35);
		contentPanel.add(btnNewButton_2_1_3);
		
		JButton btnNewButton_2_1_2_1 = new JButton("*");
		btnNewButton_2_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_2_1_2_1.setBounds(178, 209, 55, 41);
		contentPanel.add(btnNewButton_2_1_2_1);
		
		JButton btnNewButton_1_1_3 = new JButton("%");
		btnNewButton_1_1_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1_1_3.setBounds(233, 173, 55, 35);
		contentPanel.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_1_2_2 = new JButton("1/x");
		btnNewButton_1_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_1_1_2_2.setBounds(234, 209, 55, 41);
		contentPanel.add(btnNewButton_1_1_2_2);
		
		JButton btnNewButton_2_1_1_1_2_1 = new JButton("1");
		btnNewButton_2_1_1_1_2_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnNewButton_2_1_1_1_2_1.setForeground(Color.BLACK);
		btnNewButton_2_1_1_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_2_1_1_1_2_1.setBounds(11, 253, 55, 40);
		contentPanel.add(btnNewButton_2_1_1_1_2_1);
		
		JButton btnNewButton_2_1_1_3_1 = new JButton("2");
		btnNewButton_2_1_1_3_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnNewButton_2_1_1_3_1.setForeground(Color.BLACK);
		btnNewButton_2_1_1_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_2_1_1_3_1.setBounds(66, 253, 55, 40);
		contentPanel.add(btnNewButton_2_1_1_3_1);
		
		JButton btnNewButton_1_1_1_2_1 = new JButton("3");
		btnNewButton_1_1_1_2_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnNewButton_1_1_1_2_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1_1_1_2_1.setBounds(122, 253, 55, 40);
		contentPanel.add(btnNewButton_1_1_1_2_1);
		
		JButton btnNewButton_2_1_2_1_2 = new JButton("-");
		btnNewButton_2_1_2_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_2_1_2_1_2.setBounds(178, 253, 55, 41);
		contentPanel.add(btnNewButton_2_1_2_1_2);
		
		JButton btnNewButton_2_1_2_1_2_1 = new JButton("+");
		btnNewButton_2_1_2_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_2_1_2_1_2_1.setBounds(178, 297, 55, 41);
		contentPanel.add(btnNewButton_2_1_2_1_2_1);
		
		JButton btnNewButton_1_1_1_2_1_1 = new JButton(",");
		btnNewButton_1_1_1_2_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1_2_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_1_1_1_2_1_1.setBounds(122, 297, 55, 40);
		contentPanel.add(btnNewButton_1_1_1_2_1_1);
		
		JButton btnNewButton_2_1_1_1_2_1_1 = new JButton("0");
		btnNewButton_2_1_1_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			
		});
		btnNewButton_2_1_1_1_2_1_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnNewButton_2_1_1_1_2_1_1.setForeground(Color.BLACK);
		btnNewButton_2_1_1_1_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_2_1_1_1_2_1_1.setBounds(11, 297, 110, 40);
		contentPanel.add(btnNewButton_2_1_1_1_2_1_1);
	}
}
