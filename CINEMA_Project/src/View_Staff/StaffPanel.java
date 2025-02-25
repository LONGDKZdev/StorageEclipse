package View_Staff;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
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
        lblId.setBounds(30, 20, 80, 25);
        add(lblId);

        txtId = new JTextField();
        txtId.setBounds(120, 20, 150, 25);
        add(txtId);

        JLabel lblName = new JLabel("Tên:");
        lblName.setBounds(30, 60, 80, 25);
        add(lblName);

        txtName = new JTextField();
        txtName.setBounds(120, 60, 150, 25);
        add(txtName);

        JLabel lblDob = new JLabel("Ngày sinh:");
        lblDob.setBounds(30, 100, 80, 25);
        add(lblDob);

        txtDob = new JTextField();
        txtDob.setBounds(120, 100, 150, 25);
        add(txtDob);

        JLabel lblAge = new JLabel("Tuổi:");
        lblAge.setBounds(300, 20, 50, 25);
        add(lblAge);

        txtAge = new JTextField();
        txtAge.setBounds(360, 20, 50, 25);
        add(txtAge);

        JLabel lblGender = new JLabel("Giới tính:");
        lblGender.setBounds(300, 60, 70, 25);
        add(lblGender);

        cmbGender = new JComboBox<>(new String[]{"Male", "Female", "Other"});
        cmbGender.setBounds(360, 60, 100, 25);
        add(cmbGender);

        JLabel lblHometown = new JLabel("Quê quán:");
        lblHometown.setBounds(300, 100, 70, 25);
        add(lblHometown);

        txtHometown = new JTextField();
        txtHometown.setBounds(370, 101, 150, 25);
        add(txtHometown);

        JLabel lblPosition = new JLabel("Chức vụ:");
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
        btnAdd.setBackground(new Color(128, 255, 128));
        btnAdd.setBounds(30, 140, 100, 25);
        add(btnAdd);

        JButton btnEdit = new JButton("Sửa");
        btnEdit.setBackground(new Color(255, 255, 0));
        btnEdit.setBounds(150, 140, 100, 25);
        add(btnEdit);

        JButton btnUpdate = new JButton("Cập nhật");
        btnUpdate.setBackground(new Color(0, 128, 255));
        btnUpdate.setBounds(260, 140, 100, 25);
        add(btnUpdate);

        JButton btnDelete = new JButton("Xóa");
        btnDelete.setBackground(new Color(0, 255, 128));
        btnDelete.setBounds(380, 140, 100, 25);
        add(btnDelete);

        JButton btnReset = new JButton("Reset");
        btnReset.setBackground(new Color(0, 128, 0));
        btnReset.setBounds(490, 140, 100, 25);
        add(btnReset);

        JButton btnSearch = new JButton("Tìm kiếm");
        btnSearch.setBackground(new Color(0, 255, 255));
        btnSearch.setBounds(600, 140, 100, 25);
        add(btnSearch);

        // Load dữ liệu từ SQL Server
        loadStaffData();

        // Event Handlers
        btnAdd.addActionListener(e -> addStaff());
        btnEdit.addActionListener(e -> editStaff());
        btnUpdate.addActionListener(e -> updateStaff());
        btnDelete.addActionListener(e -> deleteStaff());
        btnReset.addActionListener(e -> resetFields());
        btnSearch.addActionListener(e -> searchStaff());
    }

    private void addStaff() {
        try {
            System.out.println("➡ Đang thêm nhân viên...");

            String name = txtName.getText().trim();
            String dob = txtDob.getText().trim();
            String ageStr = txtAge.getText().trim();
            String gender = cmbGender.getSelectedItem().toString();
            String hometown = txtHometown.getText().trim();
            String position = txtPosition.getText().trim();

            // Kiểm tra dữ liệu nhập
            if (name.isEmpty() || dob.isEmpty() || hometown.isEmpty() || position.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin nhân viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!dob.matches("\\d{4}-\\d{2}-\\d{2}")) {
                JOptionPane.showMessageDialog(this, "Ngày sinh phải có định dạng YYYY-MM-DD!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!gender.matches("Male|Female|Other")) {
                JOptionPane.showMessageDialog(this, "Giới tính phải là Male, Female hoặc Other!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int age;
            try {
                age = Integer.parseInt(ageStr);
                if (age <= 0) {
                    JOptionPane.showMessageDialog(this, "Tuổi phải là số dương!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Tuổi phải là số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Tạo nhân viên mới
            Staff staff = new Staff(null, name, dob, age, gender, hometown, position);

            // Gọi DAO để thêm nhân viên
            if (StaffDAO.addStaff(staff)) {
                JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công!");
                loadStaffData();
                resetFields();
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi khi thêm nhân viên!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }


    private void editStaff() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            txtId.setText(tableModel.getValueAt(selectedRow, 0).toString());
            txtName.setText(tableModel.getValueAt(selectedRow, 1).toString());
            txtDob.setText(tableModel.getValueAt(selectedRow, 2).toString());
            txtAge.setText(tableModel.getValueAt(selectedRow, 3).toString());
            cmbGender.setSelectedItem(tableModel.getValueAt(selectedRow, 4).toString());
            txtHometown.setText(tableModel.getValueAt(selectedRow, 5).toString());
            txtPosition.setText(tableModel.getValueAt(selectedRow, 6).toString());
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nhân viên để chỉnh sửa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void updateStaff() {
        try {
            Staff staff = new Staff(
                    txtId.getText(),
                    txtName.getText(),
                    txtDob.getText(),
                    Integer.parseInt(txtAge.getText()),
                    cmbGender.getSelectedItem().toString(),
                    txtHometown.getText(),
                    txtPosition.getText()
            );

            if (StaffDAO.updateStaff(staff)) {
                JOptionPane.showMessageDialog(this, "Cập nhật nhân viên thành công!");
                loadStaffData();
                resetFields();
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteStaff() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            String staffID = tableModel.getValueAt(selectedRow, 0).toString();
            if (StaffDAO.deleteStaff(staffID)) {
                JOptionPane.showMessageDialog(this, "Xóa nhân viên thành công!");
                loadStaffData();
                resetFields();
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi khi xóa!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nhân viên để xóa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void resetFields() {
        txtId.setText("");
        txtName.setText("");
        txtDob.setText("");
        txtAge.setText("");
        txtHometown.setText("");
        txtPosition.setText("");
    }

    private void searchStaff() {
        String searchId = txtId.getText().trim();
        if (searchId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập ID nhân viên để tìm kiếm!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            if (tableModel.getValueAt(i, 0).toString().equals(searchId)) {
                table.setRowSelectionInterval(i, i);
                JOptionPane.showMessageDialog(this, "Tìm thấy nhân viên: " + tableModel.getValueAt(i, 1), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }

    public void loadStaffData() {
        tableModel.setRowCount(0);
        List<Staff> staffList = StaffDAO.getAllStaff();
        for (Staff staff : staffList) {
            tableModel.addRow(new Object[]{staff.getStaffID(), staff.getName(), staff.getDob(), staff.getAge(),
                    staff.getGender(), staff.getHometown(), staff.getPosition()});
        }
    }
}
