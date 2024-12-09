package Project_2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class Project_2 extends JFrame {

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
					Project_2 frame = new Project_2();
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
	public Project_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOSE YOUR PRINT ");
		lblNewLabel.setForeground(new Color(123, 104, 238));
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(112, 0, 201, 45);
		contentPane.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Print Value A");
		chckbxNewCheckBox.setBounds(6, 47, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox(" Print Value B");
		chckbxNewCheckBox_1.setBounds(6, 73, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Print Value C");
		chckbxNewCheckBox_2.setBounds(6, 99, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		textField = new JTextField();
		textField.setBounds(6, 167, 418, 83);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("PRINT");
		btnNewButton.setBounds(134, 131, 150, 35);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(134, 51, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(134, 77, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(134, 103, 46, 14);
		contentPane.add(lblNewLabel_3);
	}
}
