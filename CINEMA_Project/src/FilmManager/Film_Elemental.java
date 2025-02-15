package FilmManager;

import java.awt.*;
import java.net.URL;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

import javax.swing.border.TitledBorder;
import connection.DatabaseHelper;
import view_Use_Account.MainFrame_Employee;

public class Film_Elemental extends JPanel {
    private static final long serialVersionUID = 1L;
    private JLabel lbl_Icon_Film;
    private JTextArea txtrMovieDetails;
    private JPanel seatManagementPanel;

    public Film_Elemental() {
        setLayout(new BorderLayout());

        // Panel chứa thông tin phim
        JPanel panel_Information_Film = new JPanel();
        panel_Information_Film.setBorder(new TitledBorder(new EtchedBorder(), "MOVIE INFORMATION", 
                TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLUE));
        panel_Information_Film.setPreferredSize(new Dimension(970, 200));
        panel_Information_Film.setLayout(null);

        // Ảnh phim
        lbl_Icon_Film = new JLabel();
        lbl_Icon_Film.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_Icon_Film.setBounds(0, 11, 113, 178);
        lbl_Icon_Film.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        panel_Information_Film.add(lbl_Icon_Film);

        // Thông tin phim
        txtrMovieDetails = new JTextArea();
        txtrMovieDetails.setFont(new Font("Mongolian Baiti", Font.BOLD, 25)); // In đậm
        txtrMovieDetails.setEditable(false);
        txtrMovieDetails.setBounds(123, 21, 722, 168);
        panel_Information_Film.add(txtrMovieDetails);

        add(panel_Information_Film, BorderLayout.NORTH);

        // Panel quản lý ghế
        seatManagementPanel = new JPanel();
        seatManagementPanel.setLayout(new GridLayout(5, 5, 10, 10)); // 5x5 ghế mẫu
        add(seatManagementPanel, BorderLayout.CENTER);

        // Panel điều khiển (Back & End Film)
        JPanel panel_Control = new JPanel();
        JButton btnBack = new JButton("Back");
        JButton btnEndFilm = new JButton("End Film");
        
        btnBack.addActionListener(e -> backToMovieSelection());
        btnEndFilm.addActionListener(e -> endFilm());

        panel_Control.add(btnBack);
        panel_Control.add(btnEndFilm);
        add(panel_Control, BorderLayout.SOUTH);

        // Load dữ liệu từ SQL Server
        loadFilmData();
        loadSeatData();
    }

    private void loadFilmData() {
        try {
            String query = "SELECT Title, Genre, Duration, Rating FROM Movies WHERE Title = 'Elemental'";
            Connection connection = DatabaseHelper.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String title = rs.getString("Title");
                String genre = rs.getString("Genre");
                int duration = rs.getInt("Duration");
                String rating = rs.getString("Rating");

                String movieDetails = "Title: " + title + "\n"
                                    + "Genre: " + genre + "\n"
                                    + "Duration(min): " + duration + "\n"
                                    + "Rating: " + rating;
                txtrMovieDetails.setText(movieDetails);

                // Load ảnh từ thư mục /Image_Film_For_Information_Film
                String imagePath = "/Image_Film_For_Information_Film/FilmElemental.png";
                URL resource = getClass().getResource(imagePath);
                if (resource != null) {
                    ImageIcon icon = new ImageIcon(resource);
                    lbl_Icon_Film.setIcon(new ImageIcon(icon.getImage().getScaledInstance(100, 80, Image.SCALE_SMOOTH)));
                }
            }

            rs.close();
            ps.close();
            connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading film data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadSeatData() {
        seatManagementPanel.removeAll();

        try {
            String query = "SELECT ChairName FROM RoomManagement.Room_A1";
            Connection connection = DatabaseHelper.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String chairName = rs.getString("ChairName");
                JButton btnSeat = new JButton(chairName);
                seatManagementPanel.add(btnSeat);
            }

            rs.close();
            ps.close();
            connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading chair data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        seatManagementPanel.revalidate();
        seatManagementPanel.repaint();
    }

    private void backToMovieSelection() {
        MainFrame_Employee mainFrame = (MainFrame_Employee) SwingUtilities.getWindowAncestor(this);
        mainFrame.switchPanel("ChoseRatingFilm");
    }

    private void endFilm() {
        JOptionPane.showMessageDialog(this, "Film has ended!", "End Film", JOptionPane.INFORMATION_MESSAGE);
        backToMovieSelection();
    }
}
