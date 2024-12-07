package Project_4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercise_4_SignUp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField confirmPasswordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise_4_SignUp frame = new Exercise_4_SignUp();
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
	public Exercise_4_SignUp() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIGN UP ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(150, 11, 104, 62);
		contentPane.add(lblNewLabel);
		
		JLabel lblUserName = new JLabel("User name:");
		lblUserName.setHorizontalAlignment(SwingConstants.TRAILING);
		lblUserName.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblUserName.setBounds(69, 86, 78, 14);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPassword.setBounds(79, 111, 67, 14);
		contentPane.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.TRAILING);
		lblConfirmPassword.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblConfirmPassword.setBounds(29, 136, 120, 14);
		contentPane.add(lblConfirmPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(169, 109, 145, 20); 
		contentPane.add(passwordField);

		confirmPasswordField = new JPasswordField();
		confirmPasswordField.setBounds(169, 134, 145, 20); 
		contentPane.add(confirmPasswordField);

		textField = new JTextField();
		textField.setBounds(169, 84, 145, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//thiết lập tên đăng nhập và mật khẩu 
				String correctUserName = "Vo Huy Long";
				String correctPassword  = "111";
				
				//dùng để lấy thông tin từ trường văn bản nhập vào
				String userName = textField.getText();
		        String password = new String(passwordField.getPassword());
		        String confirmPassword = new String(confirmPasswordField.getPassword());

		        
		        if (userName.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Please fill in all fields!", "Warning", JOptionPane.WARNING_MESSAGE);
		        }
		        else if (!password.equals(confirmPassword)) {
		            JOptionPane.showMessageDialog(null, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
		        } 
		        else if (userName.equals(correctUserName) && password.equals(correctPassword)) {
		            JOptionPane.showMessageDialog(null, "Sign-Up successful!");
		            dispose();
		        } 
		        else {
		            JOptionPane.showMessageDialog(null, "Invalid username or password!", "Error", JOptionPane.ERROR_MESSAGE);
		        }
                
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(184, 165, 104, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Switch to Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exercise_4_Login loginFrame = new Exercise_4_Login();
		        loginFrame.setVisible(true); 
		        dispose();
			}
		});
		btnNewButton_1.setForeground(Color.CYAN);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(135, 211, 179, 33);
		contentPane.add(btnNewButton_1);
	}

}
