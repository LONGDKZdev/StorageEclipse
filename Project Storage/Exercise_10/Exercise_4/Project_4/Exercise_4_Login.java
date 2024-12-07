package Project_4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercise_4_Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise_4_Login frame = new Exercise_4_Login();
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
	public Exercise_4_Login() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(new Color(0, 255, 0));
		lblLogin.setBounds(170, 28, 91, 43);
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblLogin);
		
		JLabel lblNewLabel = new JLabel("Email:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(91, 100, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblPassword.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPassword.setBounds(70, 136, 67, 14);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(158, 134, 130, 20);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(158, 98, 130, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String correctEmail = "24IT5@gmail.com";
				String correctPassword  = "111";
			
				String email = textField.getText();
                String password = new String(passwordField.getPassword());
                
                if (email.equals(correctEmail) && password.equals(correctPassword )) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    dispose();
                } 
                else {
                    JOptionPane.showMessageDialog(null, "Invalid email or password!", "Error", JOptionPane.ERROR_MESSAGE);
                }
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(172, 183, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Switch to Sign Up");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exercise_4_SignUp signUpFrame = new Exercise_4_SignUp(); 
		        signUpFrame.setVisible(true); 
		        dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setForeground(new Color(0, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(138, 217, 179, 33);
		contentPane.add(btnNewButton_1);
	}
}
