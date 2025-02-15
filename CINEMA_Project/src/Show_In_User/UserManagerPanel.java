package Show_In_User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.util.ArrayList;

public class UserManagerPanel extends JPanel {
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField txtId, txtName, txtEmail;
    private UserManager userManager;

    public UserManagerPanel(UserManager userManager) {
        this.userManager = userManager;
        initUI();
    }

    private void initUI() {
        setLayout(new BorderLayout());

        // Bảng hiển thị thông tin người dùng
        String[] columnNames = {"ID", "Họ tên", "Email", "Lịch sử mua vé"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Panel nhập thông tin người dùng
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Thông tin người dùng"));

        JLabel labelId = new JLabel("ID:");
        inputPanel.add(labelId);
        txtId = new JTextField();
        inputPanel.add(txtId);

        JLabel labelName = new JLabel("Họ tên:");
        inputPanel.add(labelName);
        txtName = new JTextField();
        inputPanel.add(txtName);

        JLabel labelEmail = new JLabel("Email:");
        inputPanel.add(labelEmail);
        txtEmail = new JTextField();
        inputPanel.add(txtEmail);

        add(inputPanel, BorderLayout.NORTH);

        // Panel nút chức năng (Thêm, Sửa, Xóa)
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton btnAdd = new JButton("Thêm");
        btnAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
        JButton btnUpdate = new JButton("Sửa");
        btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 14));
        JButton btnDelete = new JButton("Xóa");
        btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
        JButton btnReset = new JButton("Reset");
        btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));

        buttonPanel.add(btnAdd);
        buttonPanel.add(btnUpdate);
        buttonPanel.add(btnDelete);
        buttonPanel.add(btnReset);

        add(buttonPanel, BorderLayout.SOUTH);

        // Thêm sự kiện cho các nút
        btnAdd.addActionListener(e -> addUser());
        btnUpdate.addActionListener(e -> updateUser());
        btnDelete.addActionListener(e -> deleteUser());
        btnReset.addActionListener(e -> resetFields());

        // Chọn người dùng trong bảng
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    txtId.setText(tableModel.getValueAt(selectedRow, 0).toString());
                    txtName.setText(tableModel.getValueAt(selectedRow, 1).toString());
                    txtEmail.setText(tableModel.getValueAt(selectedRow, 2).toString());
                }
            }
        });
    }

    private void addUser() {
        String id = txtId.getText();
        String name = txtName.getText();
        String email = txtEmail.getText();

        if (id.isEmpty() || name.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        userManager.addUser(new User(id, name, email));
        tableModel.addRow(new Object[]{id, name, email, ""});
        resetFields();
    }

    private void updateUser() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn người dùng cần sửa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String id = txtId.getText();
        String name = txtName.getText();
        String email = txtEmail.getText();

        if (id.isEmpty() || name.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        userManager.updateUser(selectedRow, new User(id, name, email));
        tableModel.setValueAt(id, selectedRow, 0);
        tableModel.setValueAt(name, selectedRow, 1);
        tableModel.setValueAt(email, selectedRow, 2);
        resetFields();
    }

    private void deleteUser() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn người dùng cần xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        userManager.deleteUser(selectedRow);
        tableModel.removeRow(selectedRow);
        resetFields();
    }

    private void resetFields() {
        txtId.setText("");
        txtName.setText("");
        txtEmail.setText("");
        table.clearSelection();
    }

    // Cập nhật bảng thông tin người dùng
    public void updateUserTable() {
        tableModel.setRowCount(0);  // Xóa hết dữ liệu trong bảng
        for (User user : userManager.getUsers()) {
            StringBuilder historyText = new StringBuilder();
            for (TicketPurchase p : user.getTicketHistory()) {
                historyText.append(p.toString()).append("\n");
            }
            tableModel.addRow(new Object[]{user.getId(), user.getName(), user.getEmail(), historyText.toString()});
        }
    }
}
