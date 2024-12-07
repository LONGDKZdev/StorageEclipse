package Login_menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.MENU;
import Main.MENU_Test;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField userText;
	private JPasswordField passText;
	private String userName;
	private String passWord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setFont(new Font("Times New Roman", Font.BOLD, 15));
		setTitle("Login Admin");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Login_menu/Log icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize( 550, 391);
//		setLocationRelativeTo(null);
//		setResizable(false);
		
		
		// Thiết lập chế độ toàn màn hình
	    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	    GraphicsDevice gd = ge.getDefaultScreenDevice();
	    if (gd.isFullScreenSupported()) {
	        setUndecorated(true); // Loại bỏ các viền cửa sổ
	        setResizable(false);   // Không cho phép thay đổi kích thước cửa sổ
	        gd.setFullScreenWindow(this); // Đặt cửa sổ vào chế độ toàn màn hình
	    } else {
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Nếu không hỗ trợ chế độ toàn màn hình, thiết lập đóng cửa sổ thông thường
	        setSize(550, 391); // Kích thước mặc định nếu không hỗ trợ toàn màn hình
	        setLocationRelativeTo(null); // Đặt cửa sổ ở trung tâm màn hình
	    }
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel JL_Login = new JLabel("LOGIN ADMIN");
		JL_Login.setForeground(new Color(0, 128, 255));
		JL_Login.setFont(new Font("Sylfaen", Font.BOLD, 30));
		JL_Login.setHorizontalAlignment(SwingConstants.CENTER);
		JL_Login.setBounds(80, 22, 258, 97);
		contentPane.add(JL_Login);
		
		JLabel JL_UserName = new JLabel("User name:");
		JL_UserName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		JL_UserName.setHorizontalAlignment(SwingConstants.CENTER);
		JL_UserName.setBounds(46, 117, 135, 33);
		contentPane.add(JL_UserName);
		
		JLabel JL_Password = new JLabel("Password:");
		JL_Password.setHorizontalAlignment(SwingConstants.CENTER);
		JL_Password.setFont(new Font("Times New Roman", Font.BOLD, 20));
		JL_Password.setBounds(46, 153, 135, 33);
		contentPane.add(JL_Password);
		
		userText = new JTextField();
		userText.setFont(new Font("Times New Roman", Font.BOLD, 20));
		userText.setBounds(191, 115, 135, 30);
		contentPane.add(userText);
		userText.setColumns(10);
		
		passText = new JPasswordField();
		passText.setFont(new Font("Times New Roman", Font.BOLD, 20));
		passText.setBounds(191, 153, 135, 28);
		contentPane.add(passText);
		
		

		
		JLabel messageLabel = new JLabel("");
		messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		messageLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		messageLabel.setBounds(149, 263, 258, 28);
		contentPane.add(messageLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 userName = userText.getText();
                 passWord = String.valueOf(passText.getPassword());

                // Kiểm tra đăng nhập bằng cách gọi phương thức từ ConnectMySQL
                if (userName.equals("vohuylong")&& passWord.equals("24ITB104")) {
                    messageLabel.setText("Login successful!");

                    MENU_Test menuInterface = new MENU_Test();
                    menuInterface.setVisible(true);
//                    dispose();             
                    
                } else {
                    messageLabel.setText("Invalid username or password.");
                }
			}
		});
		btnNewButton.setBackground(new Color(125, 190, 255));
		btnNewButton.setIcon(new ImageIcon(Login.class.getResource("/Login_menu/LoginButton.png")));
		btnNewButton.setBounds(211, 208, 99, 45);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(128, 255, 128));
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Login_menu/my picture.jpg")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(373, 72, 125, 172);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/Login_menu/Login user .png")));
		lblNewLabel_1.setBounds(67, 196, 93, 91);
		contentPane.add(lblNewLabel_1);
		
		
		
		
		JLabel BackGround = new JLabel("New label");
		BackGround.setIcon(new ImageIcon(Login.class.getResource("/Login_menu/BackgrounLogin.jpg")));
		BackGround.setHorizontalAlignment(SwingConstants.CENTER);
		BackGround.setBounds(0, 0, 541, 354);
		contentPane.add(BackGround);
		
		
	}
}
