package FilmManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import connection.SQLServerConnection;

public class FilmManager extends JPanel {

    private static final long serialVersionUID = 1L;

    public FilmManager(String roomName, JPanel previousPanel, JFrame mainFrame) {
        setLayout(new BorderLayout());

        JLabel lblTitle = new JLabel("Film Information");
        lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 24));
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblTitle, BorderLayout.NORTH);

        JTextArea filmInfoArea = new JTextArea();
        filmInfoArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
        filmInfoArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(filmInfoArea);
        add(scrollPane, BorderLayout.CENTER);

        JButton btnBack = new JButton("Back");
        btnBack.setFont(new Font("Times New Roman", Font.BOLD, 16));
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.getContentPane().removeAll();
                mainFrame.getContentPane().add(previousPanel);
                mainFrame.revalidate();
                mainFrame.repaint();
            }
        });
        add(btnBack, BorderLayout.SOUTH);

        loadFilmData(roomName, filmInfoArea);
    }

    private void loadFilmData(String roomName, JTextArea filmInfoArea) {
        String query = "SELECT Title, Genre, Duration, Rating FROM Movies WHERE RoomName = ?";
        try (Connection connection = SQLServerConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setString(1, roomName);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String title = rs.getString("Title");
                String genre = rs.getString("Genre");
                int duration = rs.getInt("Duration");
                String rating = rs.getString("Rating");

                StringBuilder filmDetails = new StringBuilder();
                filmDetails.append("Title: ").append(title).append("\n");
                filmDetails.append("Genre: ").append(genre).append("\n");
                filmDetails.append("Duration: ").append(duration).append(" minutes\n");
                filmDetails.append("Rating: ").append(rating).append("\n");

                filmInfoArea.setText(filmDetails.toString());
            } else {
                filmInfoArea.setText("No film information available for this room.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading film data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
