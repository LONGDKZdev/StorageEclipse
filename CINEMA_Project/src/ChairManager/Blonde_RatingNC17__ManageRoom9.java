package ChairManager;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import connection.SQLServerConnection;

public class Blonde_RatingNC17__ManageRoom9 extends ChairBase {

    private static final long serialVersionUID = 1L;

    public Blonde_RatingNC17__ManageRoom9() {
        super(20);
        setBorder(BorderFactory.createTitledBorder("Blonde - Room E1"));
        loadChairDataFromDatabase();
    }

//    private void loadChairDataFromDatabase() {
//        try (Connection conn = SQLServerConnection.getConnection()) {  // Mỗi lần truy vấn một kết nối mới
//            String sql = "SELECT ChairName, UserID, Username FROM RoomManagement.Room_E1";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()) {
//                String chairName = rs.getString("ChairName");
//                int userID = rs.getInt("UserID");
//                String username = rs.getString("Username");
//                markChairAsBooked(chairName, userID, username);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Error loading chair data.", "Error", JOptionPane.ERROR_MESSAGE);
//        }
//    }
    
    private void loadChairDataFromDatabase() {
        // Fake data variables
        String[] fakeChairNames = {"Chair A", "Chair B", "Chair C", "Chair D", "Chair E"};
        int[] fakeUserIDs = {101, 102, 103, 104, 105};
        String[] fakeUsernames = {"User1", "User2", "User3", "User4", "User5"};

        // Simulating the result set using an index for iteration
        int index = 0;

        try {
            // Simulate a connection
            System.out.println("Fake connection established...");

            // Process the fake data (simulating a ResultSet)
            System.out.println("Processing fake data...");
            for (index = 0; index < fakeChairNames.length; index++) {
                String chairName = fakeChairNames[index];
                int userID = fakeUserIDs[index];
                String username = fakeUsernames[index];
                System.out.printf("Processing record: ChairName=%s, UserID=%d, Username=%s%n", chairName, userID, username);

                // Call method to simulate marking the chair as booked
                try {
                    markChairAsBooked(chairName, userID, username);
                    System.out.println("Successfully marked chair as booked: " + chairName);
                } catch (Exception e) {
                    // Catch any specific errors when trying to mark a chair
                    System.err.println("Error markingaaaaaa chair as booked for ChairName: " + chairName);
                    e.printStackTrace();
                }
            }

            System.out.println("Fake data processing complete.");
        } catch (Exception e) {
            // Handle unexpected exceptions (not SQLExceptions in this case)
            System.err.println("Unexpected error occurred during data processing: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error loadaaaing chair data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }


    /**
     * Helper method to safely close ResultSet, PreparedStatement, and Connection.
     */
    private void closeResources(ResultSet rs, PreparedStatement ps, Connection conn) {
        try {
            if (rs != null) {
                rs.close();
                System.out.println("ResultSet closed successfully.");
            }
            if (ps != null) {
                ps.close();
                System.out.println("PreparedStatement closed successfully.");
            }
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Connection closed successfully.");
            } else {
                System.out.println("Connection was already closed or null.");
            }
        } catch (SQLException e) {
            System.err.println("Error closing resources: " + e.getMessage());
            e.printStackTrace();
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
		// TODO Auto-generated method stub
		
	}
}
