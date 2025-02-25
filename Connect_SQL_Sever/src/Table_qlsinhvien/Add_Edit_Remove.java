package Table_qlsinhvien;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.util.List;

public class Add_Edit_Remove extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private JTextField textField_ID;
    private JTextField textField_Name;
    private JTextField textField_Age;
    private JTextField textField_Class;

    private Connection connection;

    public Add_Edit_Remove() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(Add_Edit_Remove.class.getResource("/image_Student_manage/Icon Manager.png")));

        // Kết nối cơ sở dữ liệu
        connection = ConnectSQL_fist.JDBCUtil.getConnection();

        
        //thiết lập JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(790, 420);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setResizable(false);
        
        //thiết lập ScrollPane để khi chèn bảng vào sẽ xuát hiện thanh cuộn
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 197, 752, 180);
        contentPane.add(scrollPane);

        // Khởi tạo bảng JTable
        table = new JTable();
        table.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        table.setModel(new DefaultTableModel(
            new Object[][] {},
            new String[] { "Student_ID", "Name", "Age", "Class" }
        ));
        scrollPane.setViewportView(table);

        // Thêm MouseListener sau khi khởi tạo bảng(Phải khởi tạo bảng trước khi thêm MouseListener)
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = table.getSelectedRow();
                if (row != -1) {
                    textField_ID.setText(table.getValueAt(row, 0).toString());
                    textField_Name.setText(table.getValueAt(row, 1).toString());
                    textField_Age.setText(table.getValueAt(row, 2).toString());
                    textField_Class.setText(table.getValueAt(row, 3).toString());
                }
            }
        });

        // Các trường nhập dữ liệu
        JLabel lblID = new JLabel("Student_ID");
        lblID.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lblID.setBounds(10, 49, 129, 57);
        contentPane.add(lblID);

        textField_ID = new JTextField();
        textField_ID.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        textField_ID.setBounds(138, 49, 160, 49);
        contentPane.add(textField_ID);

        JLabel lblName = new JLabel("Name");
        lblName.setHorizontalAlignment(SwingConstants.CENTER);
        lblName.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lblName.setBounds(51, 129, 88, 57);
        contentPane.add(lblName);

        textField_Name = new JTextField();
        textField_Name.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        textField_Name.setBounds(138, 132, 160, 50);
        contentPane.add(textField_Name);

        JLabel lblAge = new JLabel("Age");
        lblAge.setHorizontalAlignment(SwingConstants.CENTER);
        lblAge.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lblAge.setBounds(320, 49, 54, 57);
        contentPane.add(lblAge);

        textField_Age = new JTextField();
        textField_Age.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        textField_Age.setBounds(372, 49, 160, 50);
        contentPane.add(textField_Age);

        JLabel lblClass = new JLabel("Class");
        lblClass.setHorizontalAlignment(SwingConstants.CENTER);
        lblClass.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lblClass.setBounds(308, 129, 66, 57);
        contentPane.add(lblClass);

        textField_Class = new JTextField();
        textField_Class.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        textField_Class.setBounds(372, 132, 160, 50);
        contentPane.add(textField_Class);

        // Nút Thêm 
        JLabel lblAdd = new JLabel("ADD");
        lblAdd.setHorizontalAlignment(SwingConstants.CENTER);
        lblAdd.setIcon(new ImageIcon(Add_Edit_Remove.class.getResource("/image_Student_manage/Button_Add.png")));
        lblAdd.setBackground(new Color(128, 255, 128));
        lblAdd.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblAdd.setBounds(542, 11, 220, 57);
        lblAdd.setOpaque(true); // Makes background color visible
        lblAdd.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Makes it look clickable
        contentPane.add(lblAdd);
        // Add hover effect(private final Color defaultColor thiết lập để 
        // lưu màu mặc định của Jlabel và đổi màu bằng hoverColor ứng với màu bản thân chọn)
        lblAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            private final Color defaultColor = lblAdd.getBackground();
            private final Color hoverColor = new Color(102, 204, 102);

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAdd.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAdd.setBackground(defaultColor);
            }
        
//        
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            AddDialog addDialog = new AddDialog(Add_Edit_Remove.this, (DefaultTableModel) table.getModel());
            addDialog.setVisible(true);
        }
    });
//        lblAdd.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                AddDialog addDialog = new AddDialog(Add_Edit_Remove.this, (DefaultTableModel) table.getModel());
//                addDialog.setVisible(true);
//            }
//        });
        
        // Nút Sửa 
        JLabel lblUpdate = new JLabel("EDIT");
        lblUpdate.setIcon(new ImageIcon(Add_Edit_Remove.class.getResource("/image_Student_manage/Button_Edit.png")));
        lblUpdate.setBackground(new Color(255, 255, 0));
        lblUpdate.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblUpdate.setBounds(542, 72, 220, 52);
        lblUpdate.setHorizontalAlignment(SwingConstants.CENTER);
        lblUpdate.setOpaque(true);
        lblUpdate.setCursor(new Cursor(Cursor.HAND_CURSOR));
        contentPane.add(lblUpdate);
        // Add hover effect
        lblUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            private final Color defaultColor = lblUpdate.getBackground();
            private final Color hoverColor = new Color(255, 204, 51);

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUpdate.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUpdate.setBackground(defaultColor);
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = table.getSelectedRow();
                if (row == -1) {
                    JOptionPane.showMessageDialog(Add_Edit_Remove.this, "Hãy chọn một dòng để sửa!");
                } else {
                    EditDialog editDialog = new EditDialog(Add_Edit_Remove.this, (DefaultTableModel) table.getModel(), row);
                    editDialog.setVisible(true);
                }
            }
        });

        // Nút Xóa (JLabel instead of JButton)
        JLabel lblDelete = new JLabel("REMOVE");
        lblDelete.setIcon(new ImageIcon(Add_Edit_Remove.class.getResource("/image_Student_manage/Button_Remove.png")));
        lblDelete.setBackground(new Color(255, 0, 0));
        lblDelete.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblDelete.setBounds(542, 129, 220, 57);
        lblDelete.setHorizontalAlignment(SwingConstants.CENTER);
        lblDelete.setOpaque(true);
        lblDelete.setCursor(new Cursor(Cursor.HAND_CURSOR));
        contentPane.add(lblDelete);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(Add_Edit_Remove.class.getResource("/image_Student_manage/Background.jpg")));
        lblNewLabel.setBounds(0, 0, 774, 377);
        contentPane.add(lblNewLabel);
        
     // Add hover effect
        lblDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            private final Color defaultColor = lblDelete.getBackground();
            private final Color hoverColor = new Color(255, 102, 102);

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDelete.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDelete.setBackground(defaultColor);
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = table.getSelectedRow();
                if (row == -1) {
                    JOptionPane.showMessageDialog(Add_Edit_Remove.this, "Hãy chọn một dòng để xóa!");
                } else {
                    // Lấy ID của sinh viên từ dòng được chọn
                    String id = table.getValueAt(row, 0).toString();

                    // Gọi hàm xóa trong SinhVienCRUD để xóa khỏi cơ sở dữ liệu
                    boolean success = SinhVienCRUD.deleteSinhVien(connection, id);

                    if (success) {
                        ((DefaultTableModel) table.getModel()).removeRow(row);
                        JOptionPane.showMessageDialog(Add_Edit_Remove.this, "Xóa thành công!");
                    } else {
                        JOptionPane.showMessageDialog(Add_Edit_Remove.this, "Xóa không thành công! Kiểm tra kết nối cơ sở dữ liệu.");
                    }
                }
            }
        });

        // Load dữ liệu vào bảng
        loadTableData();
    }

    // Hàm tải lại dữ liệu từ CSDL vào bảng
    private void loadTableData() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Xóa dữ liệu cũ
        List<SinhVien> sinhVienList = SinhVienCRUD.viewSinhVien(connection);
        for (SinhVien sv : sinhVienList) {
            model.addRow(new Object[]{sv.getStudentID(), sv.getName(), sv.getAge(), sv.getClassName()});
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Add_Edit_Remove frame = new Add_Edit_Remove();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
