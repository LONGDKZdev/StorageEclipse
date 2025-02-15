package View_Staff;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class StaffPanel extends JPanel {
    private JTextField txtId, txtName, txtDob, txtAge, txtPosition, txtHometown;
    private JTable table;
    private DefaultTableModel tableModel;
    private JComboBox<String> cmbGender;

    public StaffPanel() {
        setLayout(null);
        setBackground(new Color(153, 204, 153));

        JLabel lblId = new JLabel("Mã NV:");
        lblId.setFont(new Font("Time new roman", Font.PLAIN, 14));
        lblId.setBounds(30, 20, 80, 25);
        add(lblId);

        txtId = new JTextField();
        txtId.setBounds(120, 20, 150, 25);
        add(txtId);

        JLabel lblName = new JLabel("Tên:");
        lblName.setFont(new Font("Time new roman", Font.PLAIN, 14));
        lblName.setBounds(30, 60, 80, 25);
        add(lblName);

        txtName = new JTextField();
        txtName.setBounds(120, 60, 150, 25);
        add(txtName);

        JLabel lblDob = new JLabel("Ngày sinh:");
        lblDob.setFont(new Font("Time new roman", Font.PLAIN, 14));
        lblDob.setBounds(30, 100, 80, 25);
        add(lblDob);

        txtDob = new JTextField();
        txtDob.setBounds(120, 100, 150, 25);
        add(txtDob);

        JLabel lblAge = new JLabel("Tuổi:");
        lblAge.setFont(new Font("Time new roman", Font.PLAIN, 14));
        lblAge.setBounds(300, 20, 50, 25);
        add(lblAge);

        txtAge = new JTextField();
        txtAge.setBounds(360, 20, 50, 25);
        add(txtAge);

        JLabel lblGender = new JLabel("Giới tính:");
        lblGender.setFont(new Font("Time new roman", Font.PLAIN, 14));
        lblGender.setBounds(300, 60, 70, 25);
        add(lblGender);

        cmbGender = new JComboBox<>(new String[]{"Nam", "Nữ", "Khác"});
        cmbGender.setBounds(360, 60, 100, 25);
        add(cmbGender);

        JLabel lblHometown = new JLabel("Quê quán:");
        lblHometown.setFont(new Font("Time new roman", Font.PLAIN, 14));
        lblHometown.setBounds(300, 100, 70, 25);
        add(lblHometown);

        txtHometown = new JTextField();
        txtHometown.setBounds(370, 101, 150, 25);
        add(txtHometown);

        JLabel lblPosition = new JLabel("Chức vụ:");
        lblPosition.setFont(new Font("Time new roman", Font.PLAIN, 14));
        lblPosition.setBounds(530, 20, 70, 25);
        add(lblPosition);

        txtPosition = new JTextField();
        txtPosition.setBounds(600, 20, 150, 25);
        add(txtPosition);

        // Table
        tableModel = new DefaultTableModel(new Object[][] {},
                new String[] { "Mã NV", "Tên", "Ngày sinh", "Tuổi", "Giới tính", "Quê quán", "Chức vụ" });
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(30, 180, 800, 300);
        add(scrollPane);

        // Buttons
        JButton btnAdd = new JButton("Thêm");
        btnAdd.setBounds(30, 140, 100, 25);
        btnAdd.setBackground(new Color(85, 170, 85));
        add(btnAdd);

        JButton btnEdit = new JButton("Sửa");
        btnEdit.setBounds(150, 140, 100, 25);
        btnEdit.setBackground(new Color(85, 170, 255));
        add(btnEdit);

        JButton btnUpdate = new JButton("Cập nhật");
        btnUpdate.setBounds(260, 140, 100, 25);
        btnUpdate.setBackground(new Color(255, 0, 0));
        add(btnUpdate);

        JButton btnDelete = new JButton("Xóa");
        btnDelete.setBounds(380, 140, 100, 25);
        btnDelete.setBackground(new Color(255, 85, 85));
        add(btnDelete);

        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(490, 140, 100, 25);
        btnReset.setBackground(new Color(255, 255, 102));
        add(btnReset);

        JButton btnSearch = new JButton("Tìm kiếm");
        btnSearch.setBounds(600, 140, 100, 25);
        btnSearch.setBackground(new Color(255, 204, 0));
        add(btnSearch);

        // Load dữ liệu từ SQL Server
        loadStaffData();
    }

    public void loadStaffData() {
        tableModel.setRowCount(0);
        List<Staff> staffList = StaffDAO.getAllStaff();
        for (Staff staff : staffList) {
            tableModel.addRow(new Object[]{
                    staff.getStaffID(), staff.getName(), staff.getDob(), staff.getAge(),
                    staff.getGender(), staff.getHometown(), staff.getPosition()
            });
        }
    }
}
