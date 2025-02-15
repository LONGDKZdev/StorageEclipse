package view_Use_Account;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import ChairManager.ChairManager;
import FilmManager.Chose_Rating_film;
import cinema_Seller.Main_ManageSell;
import java.awt.*;

public class MainFrame_User extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel panel_Show_Information_film;
    private JPanel panel_ManagerSeat_And_Reset;
    private JPanel panel_SellTickets;
    private JPanel panel_ChoseRatingFilm;
    private JPanel panel_Manage_Film_And_Seat;

    public MainFrame_User() {
        setTitle("Main Frame User");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 700);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        // Sidebar Panel
        JPanel panel_SideBar = new JPanel();
        panel_SideBar.setBounds(0, 0, 208, 661);
        getContentPane().add(panel_SideBar);
        panel_SideBar.setLayout(null);

        // User Icon Panel
        JPanel panel_Icon_User = new JPanel();
        panel_Icon_User.setBackground(new Color(128, 255, 255));
        panel_Icon_User.setBounds(5, 0, 203, 185);
        panel_Icon_User.setLayout(null);
        panel_SideBar.add(panel_Icon_User);

        JLabel Icon_User = new JLabel("");
        Icon_User.setIcon(new ImageIcon(MainFrame_User.class.getResource("/Main_Frame_User/User_Main.png")));
        Icon_User.setHorizontalAlignment(SwingConstants.CENTER);
        Icon_User.setBounds(0, 0, 206, 118);
        panel_Icon_User.add(Icon_User);

        JLabel lbuser = new JLabel("USER");
        lbuser.setOpaque(true);
        lbuser.setHorizontalAlignment(SwingConstants.CENTER);
        lbuser.setFont(new Font("Tahoma", Font.BOLD, 25));
        lbuser.setBackground(new Color(0, 128, 255));
        lbuser.setBounds(0, 115, 206, 68);
        panel_Icon_User.add(lbuser);

        // Side Buttons in sidebar
        JPanel panel_Feature_Button = new JPanel();
        panel_Feature_Button.setBackground(new Color(0, 255, 64));
        panel_Feature_Button.setBounds(5, 196, 203, 465);
        panel_SideBar.add(panel_Feature_Button);
        panel_Feature_Button.setLayout(null);

        // Tùy chỉnh cho nút "View Films"
        JButton btnViewFilm = new JButton("View Films");
        btnViewFilm.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnViewFilm.setBounds(10, 66, 183, 60);
        btnViewFilm.setBackground(new Color(60, 179, 113)); 
        btnViewFilm.setForeground(Color.WHITE); 
        btnViewFilm.setFocusPainted(false);
        btnViewFilm.setBorder(BorderFactory.createLineBorder(new Color(40, 139, 83), 2)); 
        btnViewFilm.setHorizontalTextPosition(SwingConstants.RIGHT); 
        btnViewFilm.setVerticalTextPosition(SwingConstants.CENTER);
        panel_Feature_Button.add(btnViewFilm);

        // Tùy chỉnh cho nút "Book Ticket"
        JButton btnBookTicket = new JButton("Book Ticket");
        btnBookTicket.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnBookTicket.setBounds(10, 133, 183, 60);
        btnBookTicket.setBackground(new Color(70, 130, 180));
        btnBookTicket.setForeground(Color.WHITE); 
        btnBookTicket.setFocusPainted(false);
        btnBookTicket.setBorder(BorderFactory.createLineBorder(new Color(50, 100, 150), 2));
        btnBookTicket.setHorizontalTextPosition(SwingConstants.RIGHT); 
        btnBookTicket.setVerticalTextPosition(SwingConstants.CENTER);
        panel_Feature_Button.add(btnBookTicket);
        // Logout Button
        JButton btnLogout = new JButton("LOGOUT");
        btnLogout.addActionListener(e -> {
            dispose();
            new Login().setVisible(true);
        });
        btnLogout.setHorizontalAlignment(SwingConstants.LEFT);
        btnLogout.setIcon(new ImageIcon(MainFrame_User.class.getResource("/Main_Frame_User/icons8-logout-57.png")));
        btnLogout.setForeground(new Color(0, 128, 255));
        btnLogout.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnLogout.setBounds(10, 394, 183, 60);
        panel_Feature_Button.add(btnLogout);

        // Main Film Panel
        JPanel panel_Main_Film = new JPanel();
        panel_Main_Film.setBounds(206, 0, 970, 661);
        getContentPane().add(panel_Main_Film);
        panel_Main_Film.setLayout(null);

        // Panel quản lý phim và ghế ***
        panel_Manage_Film_And_Seat = new JPanel();
        panel_Manage_Film_And_Seat.setBounds(0, 0, 970, 661);
        panel_Main_Film.add(panel_Manage_Film_And_Seat);
        panel_Manage_Film_And_Seat.setLayout(null);

        // Panel thông tin phim ***
        panel_Show_Information_film = new JPanel();
        panel_Show_Information_film.setBounds(10, 11, 970, 186);
        panel_Manage_Film_And_Seat.add(panel_Show_Information_film);
        panel_Show_Information_film.setLayout(null);
        panel_Show_Information_film.setBorder(new TitledBorder("MOVIE INFORMATION"));

        // Panel quản lý ghế ***
        panel_ManagerSeat_And_Reset = new JPanel();
        panel_ManagerSeat_And_Reset.setBounds(10, 197, 960, 464);
        panel_Manage_Film_And_Seat.add(panel_ManagerSeat_And_Reset);
        panel_ManagerSeat_And_Reset.setLayout(new GridLayout(4, 5, 10, 10));

        for (int i = 1; i <= 20; i++) {
            panel_ManagerSeat_And_Reset.add(new ChairManager("Chair " + i, "/Icon/Chair.png"));
        }

        // *** Khởi tạo giao diện bán vé ***
        panel_SellTickets = new Main_ManageSell();
        panel_SellTickets.setBounds(0, 0, 970, 661);
        panel_Main_Film.add(panel_SellTickets);
        panel_SellTickets.setVisible(false);

        // *** Khởi tạo giao diện chọn phim ***
        panel_ChoseRatingFilm = new Chose_Rating_film(null);
        panel_ChoseRatingFilm.setBounds(0, 0, 970, 661);
        panel_Main_Film.add(panel_ChoseRatingFilm);
        panel_ChoseRatingFilm.setVisible(false);

        
        btnViewFilm.addActionListener(e -> switchPanel(panel_ChoseRatingFilm));

        
        btnBookTicket.addActionListener(e -> switchPanel(panel_SellTickets));

        
        switchPanel(panel_ManagerSeat_And_Reset);

        setVisible(true);
    }

    // Phương thức chuyển đổi giữa các panel
    private void switchPanel(JPanel panelToShow) {
        panel_Manage_Film_And_Seat.setVisible(false);
        panel_SellTickets.setVisible(false);
        panel_ChoseRatingFilm.setVisible(false);

        panelToShow.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame_User());
    }
}
