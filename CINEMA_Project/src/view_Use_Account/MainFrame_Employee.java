package view_Use_Account;

import javax.swing.*;
import ChairManager.*;
import FilmManager.*;
import cinema_Seller.Main_ManageSell;
import java.awt.*;

public class MainFrame_Employee extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel cardPanel;
    private JPanel panel_SellTickets;
    private JPanel panel_ChoseRatingFilm;
    private JPanel panel_Manage_Film_And_Seat;
    private CardLayout cardLayout;

    public MainFrame_Employee() {
        setTitle("Main Frame Employee");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 700);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        // Sidebar Panel
        JPanel panel_SideBar = new JPanel();
        panel_SideBar.setBounds(0, 0, 208, 661);
        getContentPane().add(panel_SideBar);
        panel_SideBar.setLayout(null);

        JPanel panel_Icon_Employee = new JPanel();
        panel_Icon_Employee.setBackground(new Color(128, 255, 255));
        panel_Icon_Employee.setBounds(5, 0, 203, 185);
        panel_SideBar.add(panel_Icon_Employee);
        panel_Icon_Employee.setLayout(null);

        JLabel Icon_Employee = new JLabel("");
        Icon_Employee.setIcon(new ImageIcon(MainFrame_Employee.class.getResource("/Main_Frame_Employee/Employee_Main.png")));
        Icon_Employee.setHorizontalAlignment(SwingConstants.CENTER);
        Icon_Employee.setBounds(0, 0, 206, 118);
        panel_Icon_Employee.add(Icon_Employee);

        JLabel lbemployee = new JLabel("EMPLOYEE");
        lbemployee.setOpaque(true);
        lbemployee.setHorizontalAlignment(SwingConstants.CENTER);
        lbemployee.setFont(new Font("Tahoma", Font.BOLD, 25));
        lbemployee.setBackground(new Color(0, 128, 255));
        lbemployee.setBounds(0, 115, 206, 68);
        panel_Icon_Employee.add(lbemployee);

        // Side Buttons in sidebar
        JPanel panel_Feature_Button = new JPanel();
        panel_Feature_Button.setBackground(new Color(0, 255, 64));
        panel_Feature_Button.setBounds(5, 196, 203, 465);
        panel_SideBar.add(panel_Feature_Button);
        panel_Feature_Button.setLayout(null);

        JButton btnManageRoom = new JButton("Manage Room");
        btnManageRoom.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnManageRoom.setBounds(10, 66, 183, 60);
        panel_Feature_Button.add(btnManageRoom);

        JButton btnManageSell = new JButton("Manage Sell");
        btnManageSell.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnManageSell.setBounds(10, 133, 183, 60);
        panel_Feature_Button.add(btnManageSell);

        JButton btnLogout = new JButton("LOGOUT");
        btnLogout.addActionListener(e -> {
            dispose();
            new Login().setVisible(true);
        });
        btnLogout.setHorizontalAlignment(SwingConstants.LEFT);
        btnLogout.setIcon(new ImageIcon(MainFrame_Employee.class.getResource("/Main_Frame_Employee/icons8-logout-55.png")));
        btnLogout.setForeground(new Color(0, 128, 255));
        btnLogout.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnLogout.setBounds(10, 394, 183, 60);
        panel_Feature_Button.add(btnLogout);

        // Main Card Panel Setup
        cardPanel = new JPanel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);
        cardPanel.setBounds(206, 0, 970, 661);
        getContentPane().add(cardPanel);

        // Initialize Panels
        panel_SellTickets = new Main_ManageSell();
        panel_ChoseRatingFilm = new Chose_Rating_film(this);
        panel_Manage_Film_And_Seat = new JPanel(new BorderLayout());

        cardPanel.add(panel_SellTickets, "SellTickets");
        cardPanel.add(panel_ChoseRatingFilm, "ChoseRatingFilm");
        cardPanel.add(panel_Manage_Film_And_Seat, "ManageFilmAndSeat");

        // Button Actions
        btnManageRoom.addActionListener(e -> switchPanel("ChoseRatingFilm"));
        btnManageSell.addActionListener(e -> switchPanel("SellTickets"));

        // Mở giao diện bán vé mặc định
        switchPanel("SellTickets");

        setVisible(true);
    }

    public void switchPanel(String panelName) {
        cardLayout.show(cardPanel, panelName);
    }

    public void displayMoviePanelByTitle(String movieTitle) {
        panel_Manage_Film_And_Seat.removeAll();

        if (movieTitle.equals("Elemental")) {
            panel_Manage_Film_And_Seat.add(new Film_Elemental(), BorderLayout.CENTER);
        } else if (movieTitle.equals("Encanto")) {
            panel_Manage_Film_And_Seat.add(new Film_Encanto(), BorderLayout.CENTER);
        }

        panel_Manage_Film_And_Seat.revalidate();
        panel_Manage_Film_And_Seat.repaint();
        switchPanel("ManageFilmAndSeat");
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame_Employee());
    }
}
