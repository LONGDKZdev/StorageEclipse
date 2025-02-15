package ChairManager;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import connection.SQLServerConnection;

public class Elemental_RatingG__ManageRoom1 extends ChairBase {

    private static final long serialVersionUID = 1L;

    public Elemental_RatingG__ManageRoom1() {
        super(20);
        setBorder(BorderFactory.createTitledBorder("Elemental - Room A1"));
        loadChairDataFromDatabase();
    }

    private void loadChairDataFromDatabase() {
        try (Connection conn = SQLServerConnection.getConnection()) {
            String sql = "SELECT ChairName, UserID, Username FROM RoomManagement.Room_A1";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String chairName = rs.getString("ChairName");
                int userID = rs.getInt("UserID");
                String username = rs.getString("Username");
                markChairAsBooked(chairName, userID, username);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading chair data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void markChairAsBooked(String chairName, int userID, String username) {
        for (Component comp : getComponents()) {
            if (comp instanceof JButton) {
                JButton chairButton = (JButton) comp;
                if (chairButton.getText().equals(chairName)) {
                    chairButton.setText(username);
                    chairButton.setBackground(Color.GREEN);
                    chairButton.setEnabled(false);
                }
            }
        }
    }

    @Override
    protected void bookChair() {
        JOptionPane.showMessageDialog(null, "Chair booked successfully!");
    }
}
