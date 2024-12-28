package Table_qlsinhvien;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JScrollPane;

public class Add_Repair_Remove_2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField_ID;
	private JTextField textField_Nane;
	private JTextField textField_Class;
	private JTextField textField_Age;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Repair_Remove_2 frame = new Add_Repair_Remove_2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Add_Repair_Remove_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel student_ID = new JLabel("Student_ID");
		student_ID.setFont(new Font("Times New Roman", Font.BOLD, 15));
		student_ID.setBounds(29, 38, 75, 35);
		contentPane.add(student_ID);
		
		JLabel Name = new JLabel("Name");
		Name.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Name.setBounds(29, 84, 75, 35);
		contentPane.add(Name);
		
		JLabel Age = new JLabel("Age");
		Age.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Age.setBounds(319, 38, 75, 35);
		contentPane.add(Age);
		
		JLabel Class = new JLabel("Class");
		Class.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Class.setBounds(319, 84, 75, 35);
		contentPane.add(Class);
		
		textField_ID = new JTextField();
		textField_ID.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField_ID.setBounds(114, 45, 160, 28);
		contentPane.add(textField_ID);
		textField_ID.setColumns(10);
		
		textField_Nane = new JTextField();
		textField_Nane.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField_Nane.setColumns(10);
		textField_Nane.setBounds(114, 91, 160, 28);
		contentPane.add(textField_Nane);
		
		textField_Age = new JTextField();
		textField_Age.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField_Age.setColumns(10);
		textField_Age.setBounds(365, 45, 160, 28);
		contentPane.add(textField_Age);
		
		textField_Class = new JTextField();
		textField_Class.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField_Class.setColumns(10);
		textField_Class.setBounds(365, 91, 160, 28);
		contentPane.add(textField_Class);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 130, 1064, 186);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setFont(new Font("Time New Roman", Font.PLAIN, 20));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Student_ID", "name", "age", "class"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(65);
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(1).setMinWidth(30);
		table.getColumnModel().getColumn(2).setPreferredWidth(40);
		table.getColumnModel().getColumn(2).setMinWidth(30);
		table.getColumnModel().getColumn(3).setPreferredWidth(55);
		table.getColumnModel().getColumn(3).setMinWidth(10);
	}
}
