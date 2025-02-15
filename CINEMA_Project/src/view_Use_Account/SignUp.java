package view_Use_Account;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import connection.SQLServerConnection;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField us;
    private JPasswordField passwordField;
    private JRadioButton rdbtnUser;
    private JRadioButton rdbtnEmployee;
    private JButton btnSignUp;
    private JPasswordField passwordField_1;

    /**
     * Khởi chạy ứng dụng
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                SignUp frame = new SignUp();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Tạo giao diện Đăng Ký
     */
    public SignUp() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setUndecorated(true);
        setBounds(50, 50, 1157, 534);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton Button_Login = new JButton("");
        Button_Login.setIcon(new ImageIcon(SignUp.class.getResource("/Icon/Button_Login .png")));
        Button_Login.setFont(new Font("Times New Roman", Font.BOLD, 25));
        Button_Login.setBackground(new Color(0, 128, 255));
        Button_Login.setBounds(669, 404, 149, 60);
        contentPane.add(Button_Login);
        
        
        Button_Login.addActionListener(e -> {
            // Using the isFrameOpen method phương thức isFrameOpen ở lớp login ngăn chạn việc mở nhiều giao diện 
            if (!Login.getInstance().isFrameOpen(Login.class)) {
                Login.getInstance().setVisible(true);
                dispose(); 
            } else {
                JOptionPane.showMessageDialog(null, "Login window is already open.");
            }
        });
        
        // Tiêu đề và hình ảnh
        JLabel lblNewLabel_3 = new JLabel("WELCOME TO CINEMA ");
        lblNewLabel_3.setForeground(Color.WHITE);
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
        lblNewLabel_3.setBounds(0, 290, 347, 64);
        contentPane.add(lblNewLabel_3);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(SignUp.class.getResource("/Icon/icons8-movie-camera-96.png")));
        lblNewLabel_1.setBounds(551, 164, 96, 96);
        contentPane.add(lblNewLabel_1);

        JLabel lb_Sign_Up_icon = new JLabel("");
        lb_Sign_Up_icon.setHorizontalAlignment(SwingConstants.CENTER);
        lb_Sign_Up_icon.setIcon(new ImageIcon(SignUp.class.getResource("/Icon/Sign Up Icon.png")));
        lb_Sign_Up_icon.setBounds(385, 140, 100, 123);
        contentPane.add(lb_Sign_Up_icon);

        JLabel lblNewLabel = new JLabel("SIGN UP");
        lblNewLabel.setIcon(new ImageIcon(SignUp.class.getResource("/Icon/icons8-sign-up-100.png")));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(48, 140, 255, 115);
        contentPane.add(lblNewLabel);

        // Trường nhập liệu
        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setForeground(Color.WHITE);
        lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
        lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblUsername.setBounds(368, 279, 183, 32);
        contentPane.add(lblUsername);

        us = new JTextField();
        us.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        us.setBounds(561, 271, 232, 32);
        contentPane.add(us);
        us.setColumns(10);

        JLabel lblPassword = new JLabel("confirm password :");
        lblPassword.setForeground(Color.WHITE);
        lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
        lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblPassword.setBounds(368, 361, 183, 32);
        contentPane.add(lblPassword);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        passwordField.setBounds(561, 361, 232, 32);
        contentPane.add(passwordField);
        
        JLabel lblPassword_1 = new JLabel("Password:");
        lblPassword_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblPassword_1.setForeground(Color.WHITE);
        lblPassword_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblPassword_1.setBounds(368, 322, 183, 32);
        contentPane.add(lblPassword_1);
        
        passwordField_1 = new JPasswordField();
        passwordField_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        passwordField_1.setBounds(561, 313, 232, 32);
        contentPane.add(passwordField_1);

        // Radio Button cho User và Employee
        rdbtnUser = new JRadioButton("User");
        rdbtnUser.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        rdbtnUser.setBounds(828, 288, 109, 40);
        contentPane.add(rdbtnUser);

        rdbtnEmployee = new JRadioButton("Employee");
        rdbtnEmployee.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        rdbtnEmployee.setBounds(828, 331, 109, 40);
        contentPane.add(rdbtnEmployee);

        ButtonGroup roleGroup = new ButtonGroup();
        roleGroup.add(rdbtnUser);
        roleGroup.add(rdbtnEmployee);

        JLabel lblRole = new JLabel("Choose Role:");
        lblRole.setForeground(new Color(255, 255, 128));
        lblRole.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblRole.setBounds(822, 243, 135, 38);
        contentPane.add(lblRole);

        
        btnSignUp = new JButton("");
        btnSignUp.setIcon(new ImageIcon(SignUp.class.getResource("/Icon/Button_SignUp.png")));
        btnSignUp.setBackground(new Color(0, 128, 255));
        btnSignUp.setFont(new Font("Times New Roman", Font.BOLD, 25));
        btnSignUp.setBounds(496, 404, 151, 60);
        contentPane.add(btnSignUp);

        
        JLabel lblBackgroundLeft = new JLabel("");
        lblBackgroundLeft.setIcon(new ImageIcon(SignUp.class.getResource("/Background/Background_Red_Black(SignUp).png")));
        lblBackgroundLeft.setBounds(0, 0, 347, 495);
        contentPane.add(lblBackgroundLeft);
        
        JButton button_EXIT = new JButton("EXIT");
        button_EXIT.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.exit(0);
        	}
        });
        button_EXIT.setHorizontalAlignment(SwingConstants.LEADING);
        button_EXIT.setIcon(new ImageIcon(SignUp.class.getResource("/Icon/icons8-exit-96.png")));
        button_EXIT.setFont(new Font("Tahoma", Font.BOLD, 25));
        button_EXIT.setBounds(828, 378, 210, 113);
        contentPane.add(button_EXIT);

        JLabel lblBackgroundRight = new JLabel("");
        lblBackgroundRight.setIcon(new ImageIcon(SignUp.class.getResource("/Background/Background_signUp .png")));
        lblBackgroundRight.setBounds(357, 0, 789, 500);
        contentPane.add(lblBackgroundRight);
    

     // Sự kiện nút Đăng Ký
        btnSignUp.addActionListener(e -> {
            String username = us.getText().trim();
            String password = new String(passwordField.getPassword()).trim();
            String role = rdbtnUser.isSelected() ? "User" : (rdbtnEmployee.isSelected() ? "Employee" : "");

            if (username.isEmpty() || password.isEmpty() || role.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all the information and select a role!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                Connection conn2 = SQLServerConnection.getConnection();
                String sql = "INSERT INTO Users (Username, Password, Role) VALUES (?, ?, ?)";
                PreparedStatement ps = conn2.prepareStatement(sql);
                ps.setString(1, username);
                ps.setString(2, password);
                ps.setString(3, role);
                ps.executeUpdate();
                
                // Hiển thị thông tin đăng ký
                //JtexArea.setText("Username: " + username + "\nRole: " + role);
                JOptionPane.showMessageDialog(null, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database connection error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        Button_Login.addActionListener(e -> {
            dispose();
            Login loginFrame = new Login();
            loginFrame.setVisible(true);
        });
    }
}
