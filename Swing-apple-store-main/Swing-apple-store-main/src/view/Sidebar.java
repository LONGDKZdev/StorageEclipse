package view;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Sidebar extends JPanel {

	private static final long serialVersionUID = 1L;

	public Sidebar() {
		setBackground(new Color(74, 170, 239));
		setSize( 300, 840);
		
		JLabel lb_managerment = new JLabel("QUẢN LÝ CỬA HÀNG ");
		lb_managerment.setForeground(new Color(255, 255, 255));
		lb_managerment.setFont(new Font("Tahoma", Font.BOLD, 24));
		lb_managerment.setBackground(new Color(173, 216, 230));
		//thêm dòng này để đổi màu jlabel
		lb_managerment.setOpaque(true);		
		lb_managerment.setHorizontalAlignment(SwingConstants.CENTER);
		lb_managerment.setBounds(0, 149, 284, 40);
		add(lb_managerment);
		
		JLabel lb_employee_management = new JLabel("QUẢN LÝ NHÂN VIÊN");
		lb_employee_management.setOpaque(true);
		lb_employee_management.setHorizontalAlignment(SwingConstants.CENTER);
		lb_employee_management.setForeground(Color.WHITE);
		lb_employee_management.setFont(new Font("Tahoma", Font.BOLD, 24));
		lb_employee_management.setBackground(new Color(173, 216, 230));
		lb_employee_management.setBounds(0, 200, 284, 40);
		add(lb_employee_management);
		
		
		JLabel lb_product_management = new JLabel("QUẢN LÝ SẢN PHẨM");
		lb_product_management.setOpaque(true);
		lb_product_management.setHorizontalAlignment(SwingConstants.CENTER);
		lb_product_management.setForeground(Color.WHITE);
		lb_product_management.setFont(new Font("Tahoma", Font.BOLD, 24));
		lb_product_management.setBackground(new Color(173, 216, 230));
		lb_product_management.setBounds(0, 251, 284, 40);
		add(lb_product_management);
		
		
		JLabel lb_customer_management = new JLabel("KHÁCH HÀNG");
		lb_customer_management.setOpaque(true);
		lb_customer_management.setHorizontalAlignment(SwingConstants.CENTER);
		lb_customer_management.setForeground(Color.WHITE);
		lb_customer_management.setFont(new Font("Tahoma", Font.BOLD, 24));
		lb_customer_management.setBackground(new Color(173, 216, 230));
		lb_customer_management.setBounds(0, 302, 284, 40);
		add(lb_customer_management);
		
		JLabel lb_income = new JLabel("DOANH THU ");
		lb_income.setOpaque(true);
		lb_income.setHorizontalAlignment(SwingConstants.CENTER);
		lb_income.setForeground(Color.WHITE);
		lb_income.setFont(new Font("Tahoma", Font.BOLD, 24));
		lb_income.setBackground(new Color(173, 216, 230));
		lb_income.setBounds(0, 353, 284, 40);
		add(lb_income);
		
		
		JLabel lb_statistical = new JLabel("THỐNG KÊ");
		lb_statistical.setOpaque(true);
		lb_statistical.setHorizontalAlignment(SwingConstants.CENTER);
		lb_statistical.setForeground(Color.WHITE);
		lb_statistical.setFont(new Font("Tahoma", Font.BOLD, 24));
		lb_statistical.setBackground(new Color(173, 216, 230));
		lb_statistical.setBounds(0, 404, 284, 40);
		add(lb_statistical);

		
	}
}
