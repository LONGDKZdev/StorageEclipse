package View_Staff;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import java.awt.Toolkit;

class Staff_old {
	private String id;
    private String name;
    private String dob;
    private int age;
    private String gender;
    private String hometown;
    private String position;

    public Staff_old(String id, String name, String dob, int age, String gender, String hometown, String position) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.gender = gender;
        this.hometown = hometown;
        this.position = position;
    }

 
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getHometown() {
        return hometown;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAge(int age) {
        this.age = age;
    }
   

    public void setId(String id) {
        this.id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

public class view_staff extends JFrame{

    
    private JTextField txtId, txtName, txtDob, txtAge, txtPosition, txtHometown;
    private JTable table;
    private DefaultTableModel tableModel;
    private ArrayList<Staff> staffList;
    private JPanel panel;
	private JComboBox<String> cmbGender;
	private JFrame frame;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                view_staff window = new view_staff();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public view_staff() {
        staffList = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(view_staff.class.getResource("/Icon/icons8-account-50.png")));
        frame.setBounds(100, 100, 900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);  

        panel = new JPanel();
        panel.setBackground(new Color(153, 204, 153));  
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblId = new JLabel("Mã NV:");
        lblId.setFont(new Font("Time new roman", Font.PLAIN, 14));
        lblId.setBounds(30, 20, 80, 25);
        panel.add(lblId);

        txtId = new JTextField();
        txtId.setBounds(120, 20, 150, 25);
        panel.add(txtId);

        JLabel lblName = new JLabel("Tên:");
        lblName.setFont(new Font("Time new roman", Font.PLAIN, 14));
        lblName.setBounds(30, 60, 80, 25);
        panel.add(lblName);

        txtName = new JTextField();
        txtName.setBounds(120, 60, 150, 25);
        panel.add(txtName);

        JLabel lblDob = new JLabel("Ngày sinh:");
        lblDob.setFont(new Font("Time new roman", Font.PLAIN, 14));
        lblDob.setBounds(30, 100, 80, 25);
        panel.add(lblDob);

        txtDob = new JTextField();
        txtDob.setBounds(120, 100, 150, 25);
        panel.add(txtDob);

        JLabel lblAge = new JLabel("Tuổi:");
        lblAge.setFont(new Font("Time new roman", Font.PLAIN, 14));
        lblAge.setBounds(300, 20, 50, 25);
        panel.add(lblAge);

        txtAge = new JTextField();
        txtAge.setBounds(360, 20, 50, 25);
        panel.add(txtAge);

        JLabel lblGender = new JLabel("Giới tính:");
        lblGender.setFont(new Font("Time new roman", Font.PLAIN, 14));
        lblGender.setBounds(300, 60, 70, 25);
        panel.add(lblGender);

        cmbGender = new JComboBox<>(new String[]{"Nam", "Nữ", "Khác"});
        cmbGender.setBounds(360, 60, 100, 25);
        panel.add(cmbGender);

        JLabel lblHometown = new JLabel("Quê quán:");
        lblHometown.setFont(new Font("Time new roman", Font.PLAIN, 14));
        lblHometown.setBounds(300, 100, 70, 25);
        panel.add(lblHometown);

        txtHometown = new JTextField();
        txtHometown.setBounds(370, 101, 150, 25);
        panel.add(txtHometown);

        JLabel lblPosition = new JLabel("Chức vụ:");
        lblPosition.setFont(new Font("Time new roman", Font.PLAIN, 14));
        lblPosition.setBounds(530, 20, 70, 25);
        panel.add(lblPosition);

        txtPosition = new JTextField();
        txtPosition.setBounds(600, 20, 150, 25);
        panel.add(txtPosition);

        JButton btnAdd = new JButton("Thêm");
        btnAdd.setBackground(new Color(85, 170, 85));  
        btnAdd.setForeground(Color.BLACK);
        btnAdd.setBounds(30, 140, 100, 25);
        panel.add(btnAdd);

        JButton btnEdit = new JButton("Sửa");
        btnEdit.setBackground(new Color(85, 170, 255));  
        btnEdit.setForeground(Color.BLACK);
        btnEdit.setBounds(150, 140, 100, 25);
        panel.add(btnEdit);
        
        JButton btnUpdate = new JButton("Cập nhật");
        btnUpdate.setBounds(260, 137, 100, 30);
        btnUpdate.setForeground(Color.BLACK);
        btnUpdate.setBackground((new Color(255,0,0)));
        panel.add(btnUpdate);
        
        JButton btnDelete = new JButton("Xóa");
        btnDelete.setBackground(new Color(255, 85, 85));  
        btnDelete.setForeground(Color.BLACK);
        btnDelete.setBounds(380, 140, 100, 25);
        panel.add(btnDelete);

        JButton btnReset = new JButton("Reset");
        btnReset.setBackground(new Color(255, 255, 102));  
        btnReset.setBounds(490, 140, 100, 25);
        panel.add(btnReset);

        JButton btnSearch = new JButton("Tìm kiếm");
        btnSearch.setBackground(new Color(255, 204, 0));  
        btnSearch.setBounds(600, 140, 100, 25);
        panel.add(btnSearch);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10)); // Khoảng cách giữa các thành phần
        mainPanel.setBackground(new Color(245, 245, 245)); // Màu xám nhạt

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(30, 180, 800, 300);
        panel.add(scrollPane);
        
        btnAdd.setBackground(new Color(60, 179, 113)); 
        btnAdd.setForeground(Color.WHITE); // Chữ trắng
        btnAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnAdd.setFocusPainted(false); // Loại bỏ viền khi nhấn

        btnSearch.setBackground(new Color(70, 130, 180)); 
        btnSearch.setForeground(Color.WHITE);
        btnSearch.setFont(new Font("Time new roman", Font.BOLD, 14));
        btnSearch.setFocusPainted(false);
        
        

        table = new JTable();
        tableModel = new DefaultTableModel(new Object[][] {},
                new String[] { "Mã NV", "Tên", "Ngày sinh", "Tuổi", "Giới tính", "Quê quán", "Chức vụ" });
        table.setModel(tableModel);
        scrollPane.setViewportView(table);
        
     // Tùy chỉnh bảng
        table.setFont(new Font("Time new roman", Font.PLAIN, 14));
        table.setRowHeight(25);
        table.setGridColor(Color.LIGHT_GRAY);
        table.setSelectionBackground(new Color(135, 206, 250));
        table.setSelectionForeground(Color.BLACK);


        JLabel lblMessage = new JLabel("");
        lblMessage.setBounds(30, 490, 800, 25);
        lblMessage.setFont(new Font("Arial", Font.ITALIC, 14));
        lblMessage.setForeground(new Color(255, 0, 0));  
        panel.add(lblMessage);

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String id = txtId.getText().trim();
                    String name = txtName.getText().trim();
                    String dob = txtDob.getText().trim();
                    int age = Integer.parseInt(txtAge.getText().trim());
                    String gender = (String) cmbGender.getSelectedItem();
                    String hometown = txtHometown.getText().trim();
                    String position = txtPosition.getText().trim();

                    staffList.add(new Staff(id, name, dob, age, gender, hometown, position));
                    updateTable();
                    clearFields();
                    lblMessage.setText("");
                } catch (Exception ex) {
                    lblMessage.setText("");
                }
            }
        });

        // Edit Button Listener
        btnEdit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
             
                    Staff staff = staffList.get(selectedRow);

                  
                    txtName.setText(staff.getName());
                    txtDob.setText(staff.getDob());
                    txtAge.setText(String.valueOf(staff.getAge()));
                    txtHometown.setText(staff.getHometown());
                    txtPosition.setText(staff.getPosition());
                    cmbGender.setSelectedItem(staff.getGender());
                } else {
                    lblMessage.setText("");
                }
            }
        });

     // Thêm ActionListener cho nút Cập nhật
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    try {
                 
                        String id = txtId.getText().trim();
                        if (!id.matches("\\d+")) { 
                            JOptionPane.showMessageDialog(null, "Bạn đã nhập sai dữ liệu: ID phải là số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        String name = txtName.getText().trim();
                        if (name.matches(".*\\d.*")) { 
                            JOptionPane.showMessageDialog(null, "Tên không được chứa số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                     
                        String dob = txtDob.getText().trim();
                        if (!dob.matches("\\d{2}/\\d{2}/\\d{4}")) {  
                            JOptionPane.showMessageDialog(null, "Bạn đã nhập sai dữ liệu: Ngày sinh phải có định dạng dd/MM/yyyy!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                       
                        String ageStr = txtAge.getText().trim();
                        int age = Integer.parseInt(ageStr);
                        if (age <= 0) {
                            JOptionPane.showMessageDialog(null, "Bạn đã nhập sai dữ liệu: Tuổi phải là một số dương!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

             
                        String gender = (String) cmbGender.getSelectedItem();
                        if (gender == null || gender.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Bạn đã nhập sai dữ liệu: Vui lòng chọn giới tính!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                 
                        String hometown = txtHometown.getText().trim();
                        if (hometown.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Bạn đã nhập sai dữ liệu: Quê quán không được để trống!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        String position = txtPosition.getText().trim();
                        if (position.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Bạn đã nhập sai dữ liệu: Chức vụ không được để trống!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                       
                        Staff staff = staffList.get(selectedRow);
                        staff.setStaffID(id);
                        staff.setName(txtName.getText().trim());
                        staff.setDob(dob);
                        staff.setAge(age);
                        staff.setGender(gender);
                        staff.setHometown(hometown);
                        staff.setPosition(position);

                        // Cập nhật bảng
                        updateTable();

                        // Làm sạch các trường thông tin sau khi cập nhật
                        clearFields();

                    
                        JOptionPane.showMessageDialog(null, "Cập nhật thông tin nhân viên thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Bạn đã nhập sai dữ liệu: Vui lòng nhập đúng kiểu dữ liệu (ví dụ: Tuổi phải là số).", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    } catch (IllegalArgumentException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên cần cập nhật.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        // Delete Button Listener
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    staffList.remove(selectedRow);
                    updateTable();
                    lblMessage.setText("");
                } else {
                    lblMessage.setText("");
                }
            }
        });

        // Reset Button Listener
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearFields();
                lblMessage.setText("");
            }
        });

        // Search Button Listener
        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String searchId = txtId.getText().trim();
                for (int i = 0; i < staffList.size(); i++) {
                    if (staffList.get(i).getStaffID().equalsIgnoreCase(searchId)) {
                        table.setRowSelectionInterval(i, i);
                        lblMessage.setText("Tìm thấy nhân viên: " + staffList.get(i).getName());
                        return;
                    }
                }
                lblMessage.setText("Không tìm thấy nhân viên với mã: " + searchId);
            }
        });
        
        
        
        //nút thêm
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean isValid = true;  

                try {
                    String id = txtId.getText().trim();
                    String name = txtName.getText().trim();
                    String dob = txtDob.getText().trim();
                    String ageStr = txtAge.getText().trim();
                    String gender = (String) cmbGender.getSelectedItem();
                    String hometown = txtHometown.getText().trim();
                    String position = txtPosition.getText().trim();

                    // Kiểm tra ID
                    if (id.isEmpty() || !id.matches("\\d+")) {
                        JOptionPane.showMessageDialog(null, "ID phải là số và không được để trống!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        isValid = false;
                    }

                    // Kiểm tra tên
                    if (name.isEmpty() || name.matches(".*\\d.*")) {
                        JOptionPane.showMessageDialog(null, "Tên không được chứa số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        isValid = false;
                    }

                    // Kiểm tra ngày sinh
                    if (!dob.matches("\\d{2}/\\d{2}/\\d{4}")) {
                        JOptionPane.showMessageDialog(null, "Ngày sinh phải có định dạng dd/MM/yyyy!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        isValid = false;
                    }

                    // Kiểm tra tuổi
                    int age = Integer.parseInt(ageStr);
                    if (age <= 0) {
                        JOptionPane.showMessageDialog(null, "Tuổi phải là số dương!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        isValid = false;
                    }

                    // Kiểm tra giới tính
                    if (gender == null || gender.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Vui lòng chọn giới tính!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        isValid = false;
                    }

                    // Kiểm tra quê quán
                    if (hometown.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Quê quán không được để trống!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        isValid = false;
                    }
                    if (hometown.matches(".*\\d.*")) {  
                        JOptionPane.showMessageDialog(null, "Quê quán không được chứa số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        isValid = false;
                    }

                    // Kiểm tra chức vụ
                    if (position.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Chức vụ không được để trống!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        isValid = false;
                    }
                    if (position.matches(".*\\d.*")) { 
                        JOptionPane.showMessageDialog(null, "Chức vụ không được chứa số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        isValid = false;
                    }

                    // Nếu tất cả dữ liệu hợp lệ
                    if (isValid) {
                        Staff newStaff = new Staff(id, name, dob, age, gender, hometown, position);
                        staffList.add(newStaff); 

                        // Cập nhật bảng
                        updateTable();

                        // Xóa thông báo lỗi (ẩn JLabel nếu có)
                        lblMessage.setText(""); 
                        lblMessage.setVisible(false);

                        JOptionPane.showMessageDialog(null, "Thêm nhân viên thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

                        // Reset form
                        resetForm();
                    } else {
                        JOptionPane.showMessageDialog(null, "Dữ liệu không hợp lệ, vui lòng kiểm tra lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });



        // Nút Sửa (Update)
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    try {
                     
                        String id = txtId.getText().trim();
                        if (!id.matches("\\d+")) {
                            JOptionPane.showMessageDialog(null, "Bạn đã nhập sai dữ liệu: ID phải là số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        
                      
                        String name = txtName.getText().trim();
                        if (name.isEmpty() || !name.matches("[a-zA-Z\\s]+")) {
                            JOptionPane.showMessageDialog(null, "Bạn đã nhập sai dữ liệu: Tên không được chứa số hoặc ký tự đặc biệt!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                            resetForm(); 
                            return;
                        }

                   
                        String dob = txtDob.getText().trim();
                        if (!dob.matches("\\d{2}/\\d{2}/\\d{4}")) {
                            JOptionPane.showMessageDialog(null, "Bạn đã nhập sai dữ liệu: Ngày sinh phải có định dạng dd/MM/yyyy!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                
                        String ageStr = txtAge.getText().trim();
                        int age = Integer.parseInt(ageStr);
                        if (age <= 0) {
                            JOptionPane.showMessageDialog(null, "Bạn đã nhập sai dữ liệu: Tuổi phải là một số dương!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

              
                        String gender = (String) cmbGender.getSelectedItem();
                        if (gender == null || gender.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Bạn đã nhập sai dữ liệu: Vui lòng chọn giới tính!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
               
                        String hometown = txtHometown.getText().trim();
                        if (hometown.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Bạn đã nhập sai dữ liệu: Quê quán không được để trống!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        if (hometown.matches(".*\\d.*")) { 
                            JOptionPane.showMessageDialog(null, "Quê quán không được chứa số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                  
                        String position = txtPosition.getText().trim();
                        if (position.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Bạn đã nhập sai dữ liệu: Chức vụ không được để trống!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        if (position.matches(".*\\d.*")) {  
                            JOptionPane.showMessageDialog(null, "Chức vụ không được chứa số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                    
                        Staff staff = staffList.get(selectedRow);
                        staff.setStaffID(id);
                        staff.setName(txtName.getText().trim());
                        staff.setDob(dob);
                        staff.setAge(age);
                        staff.setGender(gender);
                        staff.setHometown(hometown);
                        staff.setPosition(position);

               
                        updateTable();
                        clearFields();
                        JOptionPane.showMessageDialog(null, "Cập nhật thông tin nhân viên thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Bạn đã nhập sai dữ liệu: Vui lòng nhập đúng kiểu dữ liệu (ví dụ: Tuổi phải là số).", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên cần cập nhật.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Nút Xóa (Delete)
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    // Xóa nhân viên từ danh sách
                    staffList.remove(selectedRow);
                    updateTable();
                    JOptionPane.showMessageDialog(null, "Xóa nhân viên thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên cần xóa.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        //seach
        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String searchId = txtId.getText().trim();
                ArrayList<Staff> matchingStaff = new ArrayList<>();

                // Tìm các nhân viên có ID trùng
                for (Staff staff : staffList) {
                    if (staff.getStaffID().equalsIgnoreCase(searchId)) {
                        matchingStaff.add(staff);
                    }
                }

                // Xử lý kết quả tìm kiếm
                if (matchingStaff.size() > 0) {
                    if (matchingStaff.size() == 1) {
                        // Nếu chỉ có 1 nhân viên trùng ID
                        int index = staffList.indexOf(matchingStaff.get(0));
                        table.setRowSelectionInterval(index, index);
                        lblMessage.setText("Tìm thấy nhân viên: " + matchingStaff.get(0).getName());
                    } else {
                        // Nếu có nhiều nhân viên trùng ID
                        StringBuilder message = new StringBuilder("Có nhiều nhân viên trùng ID. Chọn một nhân viên dựa trên thông tin sau:\n");
                        for (int i = 0; i < matchingStaff.size(); i++) {
                            Staff staff = matchingStaff.get(i);
                            message.append(i + 1).append(". ")
                                   .append("Tên: ").append(staff.getName())
                                   .append(", Tuổi: ").append(staff.getAge())
                                   .append(", Giới tính: ").append(staff.getGender())
                                   .append(", Quê quán: ").append(staff.getHometown())
                                   .append(", Chức vụ: ").append(staff.getPosition())
                                   .append("\n");
                        }

                        // Hiển thị thông tin chi tiết để người dùng chọn
                        String choiceStr = JOptionPane.showInputDialog(null, message.toString(), 
                                                "Chọn nhân viên", JOptionPane.QUESTION_MESSAGE);

                        try {
                            int choice = Integer.parseInt(choiceStr) - 1;
                            if (choice >= 0 && choice < matchingStaff.size()) {
                                // Chọn nhân viên cụ thể
                                int index = staffList.indexOf(matchingStaff.get(choice));
                                table.setRowSelectionInterval(index, index);
                                lblMessage.setText("Tìm thấy nhân viên: " + matchingStaff.get(choice).getName());
                            } else {
                                lblMessage.setText("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                            }
                        } catch (NumberFormatException ex) {
                            lblMessage.setText("Bạn phải nhập số thứ tự hợp lệ. Vui lòng thử lại.");
                        }
                    }
                } else {
                    // Không tìm thấy nhân viên nào
                    lblMessage.setText("Không tìm thấy nhân viên với mã: " + searchId);
                }
            }
        });

    

        // Nút Reset (Reset)
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

    }

    private void resetForm() {
        txtId.setText("");
        txtName.setText("");
        txtDob.setText("");
        txtAge.setText("");
        if (cmbGender != null) {
            cmbGender.setSelectedIndex(0); // Đặt về giá trị mặc định
        }
        txtHometown.setText("");
        txtPosition.setText("");
    }


    private void updateTable() {
        tableModel.setRowCount(0);  // Xóa hết các dòng cũ trong bảng
        for (Staff staff : staffList) {
            tableModel.addRow(new Object[] { staff.getStaffID(), staff.getName(), staff.getDob(), staff.getAge(),
                    staff.getGender(), staff.getHometown(), staff.getPosition() });
        }
    }


    private void clearFields() {
        txtId.setText("");
        txtName.setText("");
        txtDob.setText("");
        txtAge.setText("");
        txtHometown.setText("");
        txtPosition.setText("");
    }
    
}
