package Table_qlsinhvien;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDialog extends JDialog {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField idField, nameField, ageField, classField;
    private JButton confirmButton, cancelButton;

    public AddDialog(JFrame parent, DefaultTableModel model) {
        super(parent, "Thêm Sinh Viên", true);
        setSize(500, 350);
        setLocation(0, 0);
        //setLocationRelativeTo(null);
        getContentPane().setLayout(new GridLayout(5, 2));

        // Labels and TextFields
        JLabel label_3 = new JLabel("Student ID:");
        label_3.setFont(new Font("Source Sans Pro ExtraLight", Font.BOLD, 20));
        getContentPane().add(label_3);
        idField = new JTextField();
        idField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        getContentPane().add(idField);

        JLabel label_2 = new JLabel("Name:");
        label_2.setFont(new Font("Source Sans Pro ExtraLight", Font.BOLD, 20));
        getContentPane().add(label_2);
        nameField = new JTextField();
        nameField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        getContentPane().add(nameField);

        JLabel label_1 = new JLabel("Age:");
        label_1.setFont(new Font("Source Sans Pro ExtraLight", Font.BOLD, 20));
        getContentPane().add(label_1);
        ageField = new JTextField();
        ageField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        getContentPane().add(ageField);

        JLabel label = new JLabel("Class:");
        label.setFont(new Font("Source Sans Pro ExtraLight", Font.BOLD, 20));
        getContentPane().add(label);
        classField = new JTextField();
        classField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        getContentPane().add(classField);

        // Buttons
        confirmButton = new JButton("Xác nhận");
        confirmButton.setFont(new Font("Source Sans Pro ExtraLight", Font.BOLD, 20));
        confirmButton.setBackground(new Color(128, 255, 255));
        cancelButton = new JButton("Hủy");
        cancelButton.setFont(new Font("Source Sans Pro ExtraLight", Font.BOLD, 20));
        cancelButton.setBackground(new Color(128, 128, 64));

        getContentPane().add(confirmButton);
        getContentPane().add(cancelButton);

        confirmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Thêm dữ liệu vào JTable
                model.addRow(new Object[] {
                    idField.getText(),
                    nameField.getText(),
                    ageField.getText(),
                    classField.getText()
                });

                JOptionPane.showMessageDialog(parent, "Thêm thành công!");
                dispose();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
