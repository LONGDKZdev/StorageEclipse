package Package_Exercise_2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Exercise_2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btUp, btDown, btRight, btLeft ;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise_2 frame = new Exercise_2();
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
	public Exercise_2() {
		setTitle("Direction Button ");
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setResizable(false);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btUp = new JButton("UP");
		btUp.setBackground(Color.RED);
		btUp.setForeground(new Color(0, 0, 0));
		btUp.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("You clicked button : UP");
			}
		});
		
		JLabel lblNewLabel = new JLabel("Button Direction");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Simplified Arabic Fixed", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 22, 184, 50);
		contentPane.add(lblNewLabel);
		btUp.setBounds(250, 22, 81, 50);
		contentPane.add(btUp);
		
		JButton btDown = new JButton("DOWN");
		btDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				textField.setText("You clicked button : DOWN");
			}
		});
		btDown.setBackground(Color.RED);
		btDown.setForeground(new Color(0, 0, 0));
		btDown.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btDown.setBounds(247, 83, 84, 50);
		contentPane.add(btDown);
		
		JButton btLeft = new JButton("LEFT");
		btLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("You clicked button : LEFT");
			}
		});
		btLeft.setBackground(Color.RED);
		btLeft.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btLeft.setBounds(156, 83, 81, 50);
		contentPane.add(btLeft);
		
		JButton btRight = new JButton("RIGHT");
		btRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("You clicked button : RIGHT");
			}
		});
		btRight.setBackground(Color.RED);
		btRight.setForeground(new Color(0, 0, 0));
		btRight.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btRight.setBounds(340, 83, 84, 50);
		contentPane.add(btRight);
		
		//textField = new JLabel(this.counterModel.getValue()+" ", JLabel.CENTER);
		textField = new JTextField();
		textField.setBackground(Color.CYAN);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField.setBounds(10, 146, 414, 77);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 184, 61);
		contentPane.add(panel);
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}
}
