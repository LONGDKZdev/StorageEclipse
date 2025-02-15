package ChairManager;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;

public class ChairManager extends JPanel {
    private static final long serialVersionUID = 1L;
    private boolean isBooked = false;
    private JButton btnBook;

    public ChairManager(String chairName, String imagePath) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(new LineBorder(Color.BLACK));
        setPreferredSize(new Dimension(150, 150));

        JLabel lblImage = new JLabel();
        lblImage.setHorizontalAlignment(SwingConstants.CENTER);
        lblImage.setIcon(new ImageIcon(getClass().getResource(imagePath)));
        lblImage.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(lblImage);

        JLabel lblChairName = new JLabel(chairName);
        lblChairName.setHorizontalAlignment(SwingConstants.CENTER);
        lblChairName.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblChairName.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(lblChairName);

        btnBook = new JButton("Book");
        btnBook.setBackground(Color.RED);
        btnBook.setOpaque(true);
        btnBook.setBorderPainted(false);
        btnBook.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(btnBook);

        btnBook.addActionListener(e -> openBookingDialog(chairName));
    }

    public void resetChair() {
        isBooked = false;
        btnBook.setText("Book");
        btnBook.setBackground(Color.RED);
        btnBook.setEnabled(true);
    }

    private void openBookingDialog(String chairName) {
        JDialog dialog = new JDialog((Frame) null, "Select User to Book", true);
        dialog.setSize(400, 300);
        dialog.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());

        String[] columnNames = {"Select", "ID", "Username"};
        Object[][] data = loadUserData();

        if (data.length == 0) {
            JOptionPane.showMessageDialog(null, "No user data available.", "Error", JOptionPane.ERROR_MESSAGE);
            dialog.dispose();
            return;
        }

        JTable table = new JTable(data, columnNames);

        JButton btnBookDialog = new JButton("Book");
        JButton btnCancelDialog = new JButton("Cancel");

        btnBookDialog.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1 && !(boolean) data[selectedRow][0]) {
                int userID = (int) table.getValueAt(selectedRow, 1);
                String username = (String) table.getValueAt(selectedRow, 2);
                saveBookingToDatabase(userID, username, chairName);
                btnBook.setText("Booked");
                btnBook.setBackground(Color.GREEN);
                btnBook.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Booking successful for " + username);
                dialog.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "User already booked or no selection.");
            }
        });

        btnCancelDialog.addActionListener(e -> dialog.dispose());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnBookDialog);
        buttonPanel.add(btnCancelDialog);

        panel.add(new JScrollPane(table), BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        dialog.add(panel);
        dialog.setVisible(true);
    }

    private Object[][] loadUserData() {
        String url = "jdbc:sqlserver://DESKTOP-12FN1VC:1433;databaseName=CINEMA_Project;encrypt=true;trustServerCertificate=true";
        String dbUsername = "sa";
        String dbPassword = "123";

        try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT UserID, Username, (CASE WHEN EXISTS (SELECT 1 FROM ChairBookings WHERE Users.UserID = ChairBookings.UserID) THEN 1 ELSE 0 END) AS IsBooked FROM Users")) {

            rs.last();
            int rowCount = rs.getRow();
            rs.beforeFirst();

            if (rowCount == 0) {
                return new Object[0][0];
            }

            Object[][] data = new Object[rowCount][3];
            int row = 0;
            while (rs.next()) {
                data[row][0] = rs.getInt("IsBooked") == 1;
                data[row][1] = rs.getInt("UserID");
                data[row][2] = rs.getString("Username");
                row++;
            }
            return data;

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading data from database.", "Database Error", JOptionPane.ERROR_MESSAGE);
            return new Object[0][0];
        }
    }

    private void saveBookingToDatabase(int userID, String username, String chairName) {
        String url = "jdbc:sqlserver://DESKTOP-12FN1VC:1433;databaseName=CINEMA_Project;encrypt=true;trustServerCertificate=true";
        String dbUsername = "sa";
        String dbPassword = "123";

        String insertQuery = "INSERT INTO ChairBookings (ChairName, UserID, Username, BookingTime) VALUES (?, ?, ?, GETDATE())";

        try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
             PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {
            pstmt.setString(1, chairName);
            pstmt.setInt(2, userID);
            pstmt.setString(3, username);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error saving booking to database.", "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
