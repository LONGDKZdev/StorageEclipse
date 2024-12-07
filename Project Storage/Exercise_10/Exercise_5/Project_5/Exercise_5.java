package Project_5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercise_5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise_5 frame = new Exercise_5();
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
	public Exercise_5() {
		setTitle("Programing ? button ");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("??? BUTTON???");
		lblNewLabel.setForeground(new Color(128, 64, 64));
		lblNewLabel.setBackground(new Color(255, 255, 128));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(134, 11, 141, 45);
		contentPane.add(lblNewLabel);
		
		JButton b1 = new JButton("?");
		b1.setFont(new Font("Source Sans Pro SemiBold", Font.BOLD, 15));
		b1.setBackground(new Color(0, 128, 255));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("K");
			}
		});
		b1.setBounds(26, 61, 45, 30);
		contentPane.add(b1);
		
		JButton b2 = new JButton("?");
		b2.setFont(new Font("Source Sans Pro SemiBold", Font.BOLD, 15));
		b2.setBackground(new Color(128, 255, 255));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("U");
			}
		});
		b2.setBounds(75, 62, 45, 30);
		contentPane.add(b2);
		
		JButton b3 = new JButton("?");
		b3.setFont(new Font("Source Sans Pro SemiBold", Font.BOLD, 15));
		b3.setBackground(new Color(255, 255, 0));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("T");
			}
		});
		b3.setBounds(124, 62, 45, 30);
		contentPane.add(b3);
		
		JButton b4 = new JButton("?");
		b4.setFont(new Font("Source Sans Pro SemiBold", Font.BOLD, 15));
		b4.setBackground(new Color(0, 128, 255));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("O");
			}
		});
		b4.setBounds(26, 97, 45, 30);
		contentPane.add(b4);
		
		JButton b5 = new JButton("?");
		b5.setFont(new Font("Source Sans Pro SemiBold", Font.BOLD, 15));
		b5.setBackground(new Color(128, 255, 255));
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("Q");
			}
		});
		b5.setBounds(75, 97, 45, 30);
		contentPane.add(b5);
		
		JButton b6 = new JButton("?");
		b6.setFont(new Font("Source Sans Pro SemiBold", Font.BOLD, 15));
		b6.setBackground(new Color(255, 255, 0));
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("G");
			}
		});
		b6.setBounds(124, 97, 45, 30);
		contentPane.add(b6);
		
		JButton b7 = new JButton("?");
		b7.setFont(new Font("Source Sans Pro SemiBold", Font.BOLD, 15));
		b7.setBackground(new Color(0, 128, 255));
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("8");
			}
		});
		b7.setBounds(26, 133, 45, 30);
		contentPane.add(b7);
		
		JButton b8 = new JButton("?");
		b8.setFont(new Font("Source Sans Pro SemiBold", Font.BOLD, 15));
		b8.setBackground(new Color(128, 255, 255));
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("4");
			}
		});
		b8.setBounds(75, 133, 45, 30);
		contentPane.add(b8);
		
		JButton b9 = new JButton("?");
		b9.setFont(new Font("Source Sans Pro SemiBold", Font.BOLD, 15));
		b9.setBackground(new Color(255, 255, 0));
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("3");
			}
		});
		b9.setBounds(124, 133, 45, 30);
		contentPane.add(b9);
		
		JButton b10 = new JButton("?");
		b10.setFont(new Font("Source Sans Pro SemiBold", Font.BOLD, 15));
		b10.setBackground(new Color(0, 128, 255));
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("1");
			}
		});
		b10.setBounds(26, 168, 45, 30);
		contentPane.add(b10);
		
		JButton b11 = new JButton("?");
		b11.setFont(new Font("Source Sans Pro SemiBold", Font.BOLD, 15));
		b11.setBackground(new Color(128, 255, 255));
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("9");
			}
		});
		b11.setBounds(75, 168, 45, 30);
		contentPane.add(b11);
		
		JButton b12 = new JButton("?");
		b12.setFont(new Font("Source Sans Pro SemiBold", Font.BOLD, 15));
		b12.setBackground(new Color(255, 255, 0));
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
			}
		});
		b12.setBounds(124, 168, 45, 30);
		contentPane.add(b12);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 30));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(222, 67, 164, 131);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("EXIT -->");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
//				System.exit(0);//Thoát chương trình khi ấn nút
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(267, 216, 89, 34);
		contentPane.add(btnNewButton);
	}
}
