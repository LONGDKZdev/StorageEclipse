package View_Staff;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import connection.SQLServerConnection;

public class StaffDAO {
    public static List<Staff> getAllStaff() {
        List<Staff> staffList = new ArrayList<>();
        String query = "SELECT StaffID, Name, DOB, Age, Gender, Hometown, Position FROM Staff";

        try (Connection conn = SQLServerConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Staff staff = new Staff(
                        rs.getString("StaffID"),  // ✅ Đổi từ "id" thành "StaffID"
                        rs.getString("Name"),
                        rs.getString("DOB"),
                        rs.getInt("Age"),
                        rs.getString("Gender"),
                        rs.getString("Hometown"),
                        rs.getString("Position")
                );
                staffList.add(staff);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return staffList;
    }

    public static boolean addStaff(Staff staff) {
        String query = "INSERT INTO Staff (Name, DOB, Age, Gender, Hometown, Position) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = SQLServerConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, staff.getName());
            stmt.setString(2, staff.getDob());
            stmt.setInt(3, staff.getAge());
            stmt.setString(4, staff.getGender());
            stmt.setString(5, staff.getHometown());
            stmt.setString(6, staff.getPosition());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean updateStaff(Staff staff) {
        String query = "UPDATE Staff SET Name=?, DOB=?, Age=?, Gender=?, Hometown=?, Position=? WHERE StaffID=?";

        try (Connection conn = SQLServerConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, staff.getName());
            stmt.setString(2, staff.getDob());
            stmt.setInt(3, staff.getAge());
            stmt.setString(4, staff.getGender());
            stmt.setString(5, staff.getHometown());
            stmt.setString(6, staff.getPosition());
            stmt.setString(7, staff.getStaffID());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean deleteStaff(String staffID) {
        String query = "DELETE FROM Staff WHERE StaffID=?";

        try (Connection conn = SQLServerConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, staffID);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
