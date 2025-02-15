package view_Use_Account;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import View_Staff.StaffPanel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import connection.SQLServerConnection;

public class MainFrame_Admin extends JFrame {

    private static final long serialVersionUID = 1L;
    private StaffPanel staffPanel;
    private JPanel panel_Manage_Staff;
    private JPanel panel_Manage_Users;
    private JPanel panel_Revenue;

    public MainFrame_Admin() {
        setTitle("Main Frame Admin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 700);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        // Sidebar Panel
        JPanel panel_SideBar = new JPanel();
        panel_SideBar.setBounds(0, 0, 223, 661);
        getContentPane().add(panel_SideBar);
        panel_SideBar.setLayout(null);

        // Admin Icon Panel
        JPanel panel_Icon_Admin = new JPanel();
        panel_Icon_Admin.setBackground(new Color(255, 153, 51));
        panel_Icon_Admin.setBounds(5, 0, 218, 185);
        panel_Icon_Admin.setLayout(null);
        panel_SideBar.add(panel_Icon_Admin);

        JLabel lbAdmin = new JLabel("ADMIN");
        lbAdmin.setOpaque(true);
        lbAdmin.setHorizontalAlignment(SwingConstants.CENTER);
        lbAdmin.setFont(new Font("Tahoma", Font.BOLD, 25));
        lbAdmin.setBackground(new Color(255, 102, 0));
        lbAdmin.setBounds(0, 117, 217, 68);
        panel_Icon_Admin.add(lbAdmin);

        // Side Buttons in sidebar
        JPanel panel_Feature_Button = new JPanel();
        panel_Feature_Button.setBackground(new Color(255, 204, 51));
        panel_Feature_Button.setBounds(5, 196, 218, 465);
        panel_SideBar.add(panel_Feature_Button);
        panel_Feature_Button.setLayout(null);

        // Nút "Manage Staff"
        JButton btnManageStaff = new JButton("Manage Staff");
        btnManageStaff.setFont(new Font("Time New Roman", Font.BOLD, 18));
        btnManageStaff.setBounds(10, 176, 200, 60);
        btnManageStaff.setBackground(new Color(255, 99, 71));
        btnManageStaff.setForeground(Color.WHITE);
        btnManageStaff.setFocusPainted(false);
        panel_Feature_Button.add(btnManageStaff);

        // Nút "Manage Users"
        JButton btnManageUsers = new JButton("Manage Users");
        btnManageUsers.setFont(new Font("Time New Roman", Font.BOLD, 18));
        btnManageUsers.setBounds(10, 30, 200, 60);
        panel_Feature_Button.add(btnManageUsers);

        // Nút "Revenue"
        JButton btnManageRevenue = new JButton("Revenue");
        btnManageRevenue.setFont(new Font("Time New Roman", Font.BOLD, 18));
        btnManageRevenue.setBounds(10, 103, 200, 60);
        panel_Feature_Button.add(btnManageRevenue);

        // Nút "Logout"
        JButton btnLogout = new JButton("LOGOUT");
        btnLogout.addActionListener(e -> {
            dispose();
            new Login().setVisible(true);
        });
        btnLogout.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnLogout.setBounds(10, 249, 200, 60);
        panel_Feature_Button.add(btnLogout);

        // Main Admin Panel
        JPanel panel_Main_Admin = new JPanel();
        panel_Main_Admin.setBounds(228, 0, 956, 661);
        getContentPane().add(panel_Main_Admin);
        panel_Main_Admin.setLayout(null);

        // Khởi tạo StaffPanel trước khi thêm vào GUI
        staffPanel = new StaffPanel();
        panel_Manage_Staff = staffPanel;
        panel_Manage_Staff.setBounds(0, 0, 956, 661);
        panel_Main_Admin.add(panel_Manage_Staff);

        // Panel quản lý người dùng
        panel_Manage_Users = new JPanel();
        panel_Manage_Users.setBounds(0, 0, 956, 661);
        panel_Main_Admin.add(panel_Manage_Users);

        // Panel doanh thu
        panel_Revenue = new JPanel();
        panel_Revenue.setBounds(0, 0, 956, 661);
        panel_Main_Admin.add(panel_Revenue);

        // Chức năng nút Manage Users
        btnManageUsers.addActionListener(e -> switchPanel(panel_Manage_Users));

        // Chức năng nút Manage Staff
        btnManageStaff.addActionListener(e -> {
            if (staffPanel != null) {
                staffPanel.loadStaffData();
                switchPanel(panel_Manage_Staff);
            } else {
                System.out.println("Error: StaffPanel is null!");
            }
        });

        // Chức năng nút Revenue
        btnManageRevenue.addActionListener(e -> switchPanel(panel_Revenue));

        // Hiển thị giao diện mặc định
        switchPanel(panel_Manage_Staff);

        setVisible(true);
    }

    // Phương thức chuyển đổi giữa các panel
    private void switchPanel(JPanel panelToShow) {
        panel_Manage_Staff.setVisible(false);
        panel_Manage_Users.setVisible(false);
        panel_Revenue.setVisible(false);
        panelToShow.setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame_Admin();
    }
}
