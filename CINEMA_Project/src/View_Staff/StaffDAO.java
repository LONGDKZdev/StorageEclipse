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
                        rs.getString("StaffID"), 
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

            // Kiểm tra kết nối
            if (conn == null) {
                System.err.println("❌ Kết nối đến SQL Server thất bại!");
                return false;
            }

            // Kiểm tra dữ liệu đầu vào
            if (!staff.getDob().matches("\\d{4}-\\d{2}-\\d{2}")) {  // Định dạng YYYY-MM-DD
                System.err.println("❌ Lỗi: Ngày sinh phải có định dạng YYYY-MM-DD.");
                return false;
            }

            if (!staff.getGender().matches("Male|Female|Other")) {  // Kiểm tra Gender
                System.err.println("❌ Lỗi: Giới tính không hợp lệ.");
                return false;
            }

            if (staff.getAge() <= 0) {  // Kiểm tra Age
                System.err.println("❌ Lỗi: Tuổi phải lớn hơn 0.");
                return false;
            }

            // Gán giá trị vào câu lệnh SQL
            stmt.setString(1, staff.getName());
            stmt.setString(2, staff.getDob());  // YYYY-MM-DD
            stmt.setInt(3, staff.getAge());
            stmt.setString(4, staff.getGender());  
            stmt.setString(5, staff.getHometown());
            stmt.setString(6, staff.getPosition());

            // Thực thi lệnh SQL
            int rowsAffected = stmt.executeUpdate();

            // Kiểm tra kết quả
            if (rowsAffected > 0) {
                System.out.println("✅ Thêm nhân viên thành công!");
                return true;
            } else {
                System.err.println("❌ Lỗi: Không thể thêm nhân viên vào database.");
                return false;
            }

        } catch (SQLException e) {
            System.err.println("❌ Lỗi SQL khi thêm nhân viên: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
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
