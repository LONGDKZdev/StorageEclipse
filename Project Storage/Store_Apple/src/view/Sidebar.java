package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Sidebar extends JPanel {
    private static final long serialVersionUID = 1L;

    public Sidebar() {
        setBackground(new Color(119, 187, 255));
        setLayout(null);

        JLabel QLCH = new JLabel("QUẢN LÝ CỬA HÀNG ");
        QLCH.setIcon(new ImageIcon(Sidebar.class.getResource("/icon/icons8-user-30.png")));
        QLCH.setHorizontalAlignment(SwingConstants.CENTER);
        QLCH.setFont(new Font("Times New Roman", Font.BOLD, 19));
        QLCH.setBounds(0, 168, 206, 29);
        add(QLCH);

        JLabel QLNV = new JLabel("QUẢN LÝ NHÂN VIÊN");
        QLNV.setHorizontalAlignment(SwingConstants.CENTER);
        QLNV.setFont(new Font("Times New Roman", Font.BOLD, 19));
        QLNV.setBounds(0, 202, 206, 29);
        add(QLNV);

        JLabel QLSP = new JLabel("QUẢN LÝ SẢN PHẨM");
        QLSP.setHorizontalAlignment(SwingConstants.CENTER);
        QLSP.setFont(new Font("Times New Roman", Font.BOLD, 19));
        QLSP.setBounds(0, 236, 206, 29);
        add(QLSP);

        JLabel KHACHHANG = new JLabel("KHÁCH HÀNG");
        KHACHHANG.setHorizontalAlignment(SwingConstants.CENTER);
        KHACHHANG.setFont(new Font("Times New Roman", Font.BOLD, 19));
        KHACHHANG.setBounds(0, 270, 206, 29);
        add(KHACHHANG);

        JLabel doanhthu = new JLabel("DOANH THU");
        doanhthu.setHorizontalAlignment(SwingConstants.CENTER);
        doanhthu.setFont(new Font("Times New Roman", Font.BOLD, 19));
        doanhthu.setBounds(0, 305, 206, 29);
        add(doanhthu);

        JLabel lblNewLabel_1_2 = new JLabel("QUẢN LÝ CỬA HÀNG ");
        lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 19));
        lblNewLabel_1_2.setBounds(0, 339, 206, 29);
        add(lblNewLabel_1_2);
    }
}
