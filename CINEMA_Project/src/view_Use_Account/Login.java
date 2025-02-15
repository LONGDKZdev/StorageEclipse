package view_Use_Account;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;

public class Login extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField tfu;
    private JPasswordField tfps;
    private JButton btnNewButton;
    private JButton button_Login;
    private JRadioButton choiceAdmin, choiceEmployee, choiceUser;
    private JLabel BackGround;
    private JLabel lblLogin;

    private static Login instance;

    // Singleton Pattern
    public static Login getInstance() {
     if (instance == null) {
         instance = new Login();
     }
     return instance;
 }
    
    public Login() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setUndecorated(true);
        setBounds(50, 50, 437, 518);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setForeground(new Color(255, 255, 255));
        lblUsername.setFont(new Font("Dialog", Font.BOLD, 20));
        lblUsername.setBounds(313, 11, 102, 30);
        contentPane.add(lblUsername);

        tfu = new JTextField();
        tfu.setFont(new Font("Dialog", Font.PLAIN, 20));
        tfu.setBounds(188, 40, 227, 30);
        contentPane.add(tfu);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setForeground(new Color(255, 255, 255));
        lblPassword.setFont(new Font("Dialog", Font.BOLD, 20));
        lblPassword.setBounds(315, 72, 100, 30);
        contentPane.add(lblPassword);

        tfps = new JPasswordField();
        tfps.setFont(new Font("Dialog", Font.PLAIN, 20));
        tfps.setBounds(188, 101, 227, 30);
        contentPane.add(tfps);

        JLabel lblRole = new JLabel("Choose Role:");
        lblRole.setForeground(new Color(255, 0, 0));
        lblRole.setFont(new Font("Dialog", Font.PLAIN, 20));
        lblRole.setBounds(14, 101, 150, 30);
        contentPane.add(lblRole);

        choiceAdmin = new JRadioButton("Admin");
        choiceAdmin.setFont(new Font("Times New Roman", Font.BOLD, 12));
        choiceAdmin.setBounds(47, 125, 80, 30);
        contentPane.add(choiceAdmin);

        choiceEmployee = new JRadioButton("Employee");
        choiceEmployee.setFont(new Font("Times New Roman", Font.BOLD, 12));
        choiceEmployee.setBounds(10, 153, 79, 30);
        contentPane.add(choiceEmployee);

        choiceUser = new JRadioButton("User");
        choiceUser.setFont(new Font("Times New Roman", Font.BOLD, 12));
        choiceUser.setBounds(91, 153, 52, 30);
        contentPane.add(choiceUser);

        ButtonGroup group = new ButtonGroup();
        group.add(choiceAdmin);
        group.add(choiceEmployee);
        group.add(choiceUser);

        button_Login = new JButton("Login");
        button_Login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String enteredUsername = tfu.getText().trim();
                String enteredPassword = new String(tfps.getPassword()).trim();
                String selectedRole = "";

                if (choiceAdmin.isSelected()) {
                    selectedRole = "Admin";
                } else if (choiceEmployee.isSelected()) {
                    selectedRole = "Employee";
                } else if (choiceUser.isSelected()) {
                    selectedRole = "User";
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a role.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String dbUsername = "sa"; 
                String dbPassword = "123"; 
                String serverName = "DESKTOP-12FN1VC"; 
                String databaseName = "CINEMA_Project";
                String url = "jdbc:sqlserver://" + serverName + ":1433;databaseName=" + databaseName
                            + ";encrypt=true;trustServerCertificate=true";

                String sqlQuery = "SELECT * FROM Users WHERE Username = ? AND Password = ? AND Role = ?";

                try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
                     PreparedStatement stmt = conn.prepareStatement(sqlQuery)) {

                    stmt.setString(1, enteredUsername);
                    stmt.setString(2, enteredPassword);
                    stmt.setString(3, selectedRole);

                    ResultSet rs = stmt.executeQuery();

                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Login successful as " + selectedRole);
                        switch (selectedRole) {
                            case "Admin":
                                new MainFrame_Admin().setVisible(true);
                                break;
                            case "Employee":
                                new MainFrame_Employee().setVisible(true);
                                break;
                            case "User":
                                new MainFrame_User().setVisible(true);
                                break;
                        }
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid credentials or role selected!", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Database connection error!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button_Login.setFont(new Font("Times New Roman", Font.BOLD, 25));
        button_Login.setBackground(new Color(0, 128, 255));
        button_Login.setBounds(177, 142, 118, 57);
        contentPane.add(button_Login);
        
        lblLogin = new JLabel("Login Account");
        lblLogin.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
        lblLogin.setBounds(0, 0, 174, 91);
        lblLogin.setBorder(new LineBorder(new Color(0, 255, 128), 5));
        contentPane.add(lblLogin);
        
        JButton buttonReturn_Signup = new JButton("Return SignUp");
        buttonReturn_Signup.setIcon(new ImageIcon(Login.class.getResource("/Frame_Login/icons8-back-50.png")));
        buttonReturn_Signup.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose(); 
                new SignUp().setVisible(true);
        		
        	}
        });
        buttonReturn_Signup.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonReturn_Signup.setBounds(47, 217, 267, 57);
        contentPane.add(buttonReturn_Signup);
        
        BackGround = new JLabel("");
        BackGround.setIcon(new ImageIcon(Login.class.getResource("/Background/Login_Cinema.png")));
        BackGround.setBounds(0, 0, 421, 479);
        contentPane.add(BackGround);
    }

    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Login frame = new Login();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    
    boolean isFrameOpen(Class<?> frameClass) {
        for (Frame frame : JFrame.getFrames()) {
            if (frameClass.isInstance(frame) && frame.isVisible()) {
                frame.toFront();
                return true;
            }
        }
        return false;
    }
}
