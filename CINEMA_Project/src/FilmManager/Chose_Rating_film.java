package FilmManager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import view_Use_Account.MainFrame_Employee;
import connection.DatabaseHelper;
import connection.SQLServerConnection;

import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.*;

public class Chose_Rating_film extends JPanel {

    private static final long serialVersionUID = 1L;

    public Chose_Rating_film(MainFrame_Employee mainFrame) {
        setLayout(null);

        JLabel lblTitle = new JLabel("Select movie rating");
        lblTitle.setForeground(new Color(128, 128, 0));
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 40));
        lblTitle.setBounds(171, 11, 600, 50);
        add(lblTitle);

        JLabel lblImage = new JLabel("");
        lblImage.setIcon(new ImageIcon(Chose_Rating_film.class.getResource("/Chose_Rating_Film/information rating.png")));
        lblImage.setBounds(20, 197, 806, 400);
        add(lblImage);
        
       
        JRadioButton rdbtnG = new JRadioButton("G (General Audiences)");
        JRadioButton rdbtnPG = new JRadioButton("PG (Parental Guidance Suggested)");
        JRadioButton rdbtnPG13 = new JRadioButton("PG-13 (Parents Strongly Cautioned)");
        JRadioButton rdbtnR = new JRadioButton("R (Restricted)");
        JRadioButton rdbtnNC17 = new JRadioButton("NC-17 (No One 17 and Under Admitted)");
        JRadioButton rdbtnShowAll = new JRadioButton("Show all films");

        rdbtnG.setBounds(50, 80, 377, 30);
        rdbtnPG.setBounds(50, 120, 377, 30);
        rdbtnPG13.setBounds(50, 160, 377, 30);
        rdbtnR.setBounds(429, 80, 377, 30);
        rdbtnNC17.setBounds(429, 120, 377, 30);
        rdbtnShowAll.setBounds(429, 160, 377, 30);

        
        ButtonGroup group = new ButtonGroup();
        group.add(rdbtnG);
        group.add(rdbtnPG);
        group.add(rdbtnPG13);
        group.add(rdbtnR);
        group.add(rdbtnNC17);
        group.add(rdbtnShowAll);

        add(rdbtnG);
        add(rdbtnPG);
        add(rdbtnPG13);
        add(rdbtnR);
        add(rdbtnNC17);
        add(rdbtnShowAll);

        
        ActionListener ratingListener = e -> {
            String rating = "";
            if (rdbtnG.isSelected()) rating = "G";
            if (rdbtnPG.isSelected()) rating = "PG";
            if (rdbtnPG13.isSelected()) rating = "PG-13";
            if (rdbtnR.isSelected()) rating = "R";
            if (rdbtnNC17.isSelected()) rating = "NC-17";
            if (rdbtnShowAll.isSelected()) rating = "";
            displayMoviesByRating(rating, mainFrame);
        };

        rdbtnG.addActionListener(ratingListener);
        rdbtnPG.addActionListener(ratingListener);
        rdbtnPG13.addActionListener(ratingListener);
        rdbtnR.addActionListener(ratingListener);
        rdbtnNC17.addActionListener(ratingListener);
        rdbtnShowAll.addActionListener(ratingListener);
    }

    private void displayMoviesByRating(String rating, MainFrame_Employee mainFrame) {
        try (Connection connection = SQLServerConnection.getConnection()) {
            String query = rating.isEmpty() ? "SELECT * FROM Movies" : "SELECT * FROM Movies WHERE Rating = ?";
            PreparedStatement statement = connection.prepareStatement(query);

            if (!rating.isEmpty()) {
                statement.setString(1, rating);
            }

            ResultSet rs = statement.executeQuery();

            JFrame resultFrame = new JFrame("Movie List");
            resultFrame.setSize(1000, 500);
            resultFrame.setLocationRelativeTo(null);
            resultFrame.getContentPane().setLayout(new BorderLayout());

            String[] columns = {"MovieID", "Title", "Genre", "Duration", "Rating"};
            DefaultTableModel model = new DefaultTableModel(columns, 0);
            JTable movieTable = new JTable(model);
            movieTable.setRowHeight(35);
            movieTable.setFont(new Font("Times New Roman", Font.PLAIN, 18));
            movieTable.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 20));

            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getString("MovieID"),
                        rs.getString("Title"),
                        rs.getString("Genre"),
                        rs.getInt("Duration"),
                        rs.getString("Rating")
                });
            }

            
            JPanel buttonPanel = new JPanel();
            JButton btnSelect = new JButton("Select");
            JButton btnCancel = new JButton("Cancel");

            btnSelect.addActionListener(e -> {
                int selectedRow = movieTable.getSelectedRow();
                if (selectedRow != -1) {
                    String selectedMovie = movieTable.getValueAt(selectedRow, 1).toString();
                    mainFrame.displayMoviePanelByTitle(selectedMovie);
                    resultFrame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a movie first.");
                }
            });

            btnCancel.addActionListener(e -> resultFrame.dispose());

            buttonPanel.add(btnSelect);
            buttonPanel.add(btnCancel);

            resultFrame.getContentPane().add(new JScrollPane(movieTable), BorderLayout.CENTER);
            resultFrame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
            resultFrame.setVisible(true);

            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching data from the database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
