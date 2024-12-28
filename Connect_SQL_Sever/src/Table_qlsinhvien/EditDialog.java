package Table_qlsinhvien;

import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.Color;

public class EditDialog extends JDialog {
	private static final long serialVersionUID = 1L;

	public EditDialog(JFrame parent, DefaultTableModel model, int row) {
        super(parent, "Sửa Sinh Viên", true);
        setSize(600, 475);
        setLocation(0, 0);

        // Fields
        JTextField idField = new JTextField(model.getValueAt(row, 0).toString());
        idField.setBounds(292, 0, 292, 87);
        idField.setFont(new Font("UD Digi Kyokasho NP-R", Font.PLAIN, 20));
        JTextField nameField = new JTextField(model.getValueAt(row, 1).toString());
        nameField.setBounds(292, 87, 292, 87);
        nameField.setFont(new Font("UD Digi Kyokasho NP-R", Font.PLAIN, 20));
        JTextField ageField = new JTextField(model.getValueAt(row, 2).toString());
        ageField.setBounds(292, 174, 292, 87);
        ageField.setFont(new Font("UD Digi Kyokasho NP-R", Font.PLAIN, 20));
        JTextField classField = new JTextField(model.getValueAt(row, 3).toString());
        classField.setBounds(292, 261, 292, 87);
        classField.setFont(new Font("UD Digi Kyokasho NP-R", Font.PLAIN, 20));
        getContentPane().setLayout(null);

        // Add fields to dialog
        JLabel label = new JLabel("Student ID:");
        label.setBounds(0, 0, 292, 87);
        label.setFont(new Font("Sylfaen", Font.BOLD, 20));
        getContentPane().add(label); getContentPane().add(idField);
        JLabel label_1 = new JLabel("Name:");
        label_1.setBounds(0, 87, 292, 87);
        label_1.setFont(new Font("Sylfaen", Font.BOLD, 20));
        getContentPane().add(label_1); getContentPane().add(nameField);
        JLabel label_2 = new JLabel("Age:");
        label_2.setBounds(0, 174, 292, 87);
        label_2.setFont(new Font("Sylfaen", Font.BOLD, 20));
        getContentPane().add(label_2); getContentPane().add(ageField);
        JLabel label_3 = new JLabel("Class:");
        label_3.setBounds(0, 261, 292, 87);
        label_3.setFont(new Font("Sylfaen", Font.BOLD, 20));
        getContentPane().add(label_3); getContentPane().add(classField);

        // Buttons
        JButton confirmButton = new JButton("Xác nhận");
        confirmButton.setBackground(new Color(255, 255, 128));
        confirmButton.setBounds(0, 348, 292, 87);
        confirmButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        JButton cancelButton = new JButton("Hủy");
        cancelButton.setBackground(new Color(255, 128, 64));
        cancelButton.setBounds(292, 348, 292, 87);
        cancelButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        getContentPane().add(confirmButton); getContentPane().add(cancelButton);

        confirmButton.addActionListener(e -> {
            model.setValueAt(idField.getText(), row, 0);
            model.setValueAt(nameField.getText(), row, 1);
            model.setValueAt(ageField.getText(), row, 2);
            model.setValueAt(classField.getText(), row, 3);
            JOptionPane.showMessageDialog(parent, "Sửa thành công!");
            dispose();
        });

        cancelButton.addActionListener(e -> dispose());
    }
}
