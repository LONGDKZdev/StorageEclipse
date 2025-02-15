package ChairManager;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.sql.*;
import connection.SQLServerConnection;

public abstract class ChairBase extends JPanel {
    private static final long serialVersionUID = 1L;
    protected JButton btnBook;
    protected JLabel lblImage;
    protected String chairName;

    public ChairBase(String chairName, String imagePath) {
        this.chairName = chairName;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(new LineBorder(Color.BLACK));
        setPreferredSize(new Dimension(150, 150));

        lblImage = new JLabel(new ImageIcon(getClass().getResource(imagePath)));
        lblImage.setHorizontalAlignment(SwingConstants.CENTER);
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

        btnBook.addActionListener(e -> bookChair());
    }

	public ChairBase(int i) {
		
	}

	protected abstract void bookChair();

    protected Object[][] loadUserData() {
        try (Connection conn = SQLServerConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT UserID, Username FROM Users")) {

            rs.last();
            int rowCount = rs.getRow();
            rs.beforeFirst();
            Object[][] data = new Object[rowCount][3];
            int row = 0;
            while (rs.next()) {
                data[row][0] = false;
                data[row][1] = rs.getInt("UserID");
                data[row][2] = rs.getString("Username");
                row++;
            }
            return data;

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading data from database.");
            return new Object[0][0];
        }
    }

    protected void saveBookingToDatabase(int userID, String username) {
        try (Connection conn = SQLServerConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(
                     "INSERT INTO ChairBookings (ChairName, UserID, Username, BookingTime) VALUES (?, ?, ?, GETDATE())")) {
            pstmt.setString(1, chairName);
            pstmt.setInt(2, userID);
            pstmt.setString(3, username);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error saving booking to database.");
        }
    }
}
