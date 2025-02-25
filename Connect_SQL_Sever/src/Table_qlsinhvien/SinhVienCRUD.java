package Table_qlsinhvien;

	import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import ConnectSQL_fist.JDBCUtil;

	public class SinhVienCRUD {

		
		
		
		
	    // Thêm sinh viên mới vào bảng
	    public static void addSinhVien(Connection connection, String Student_ID, String name, int age, String className) {
	        String query = "INSERT INTO sinhvien (Student_ID, name, age, class) VALUES (?, ?, ?, ?)";
	        
	        try (PreparedStatement stmt = connection.prepareStatement(query)) {
	            stmt.setString(1, Student_ID);
	            stmt.setString(2, name);
	            stmt.setInt(3, age);
	            stmt.setString(4, className);
	            stmt.executeUpdate();
	            System.out.println("Thêm sinh viên thành công!");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // Xem tất cả sinh viên
	    
	    public static List<SinhVien> viewSinhVien(Connection connection) {
	        List<SinhVien> sinhVienList = new ArrayList<>();
	        String query = "SELECT * FROM sinhvien";

	        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
	            while (rs.next()) {
	                String studentID = rs.getString("Student_ID");
	                String name = rs.getString("name");
	                int age = rs.getInt("age");
	                String className = rs.getString("class");

	                SinhVien sv = new SinhVien(studentID, name, age, className);
	                sinhVienList.add(sv);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return sinhVienList;
	    }

	    // Sửa thông tin sinh viên
	    public static void updateSinhVien(Connection connection, String Student_ID, String name, int age, String className) {
	        String query = "UPDATE sinhvien SET name = ?, age = ?, class = ? WHERE Student_ID = ?";
	        
	        try (PreparedStatement stmt = connection.prepareStatement(query)) {
	            stmt.setString(1, name);
	            stmt.setInt(2, age);
	            stmt.setString(3, className);
	            stmt.setString(4, Student_ID);
	            stmt.executeUpdate();
	            System.out.println("Cập nhật thông tin sinh viên thành công!");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // Xóa sinh viên theo mã sinh viên
	    
	    
	    public static boolean deleteSinhVien(Connection connection, String studentID) {
	        String sql = "DELETE FROM sinhvien WHERE Student_ID = ?";
	        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
	            pstmt.setString(1, studentID);
	            int rowsAffected = pstmt.executeUpdate();
	            return rowsAffected > 0;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }

	
		
	    // Hàm main để kiểm tra CRUD
	    public static void main(String[] args) {
	        Connection connection = JDBCUtil.getConnection();
	        
	        if (connection != null) {
	            // Thêm sinh viên mới
	        	
	        	// đóng comment lại sau khi thêm 
	        	
	            //addSinhVien(connection, "SV001", " Văn A", 20, "IT");
	        	//addSinhVien(connection, "SV002", " Văn B", 20, "GIT");
	        	//addSinhVien(connection, "SV003", " Văn C", 20, "Maketing");
	        	//addSinhVien(connection, "SV004", " Văn D", 20, "AI");
	        	
	        	
	        	
	            // Xem tất cả sinh viên
	            viewSinhVien(connection);

	            // Sửa thông tin sinh viên
	            //updateSinhVien(connection, "SV001", "  Lê Văn A", 21, "IT");
	            
	            //Xóa học sinh
	          
	            // Xóa sinh viên
	            //deleteSinhVien(connection, "SV002");
	             
	            
	            
	            
	            // Xem lại danh sách sinh viên sau khi xóa
	            System.out.println("Danh sách sau khi xóa / thay đổi ");
	            viewSinhVien(connection);
	        }
	        
	        // Đóng kết nối
	        JDBCUtil.closeConnection(connection);
	    }
	}

