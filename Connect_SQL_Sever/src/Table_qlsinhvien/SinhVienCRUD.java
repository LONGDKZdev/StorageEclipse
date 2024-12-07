package Table_qlsinhvien;

	import java.sql.*;

import ConnectSQL.JDBCUtil;

	public class SinhVienCRUD {

	    // Thêm sinh viên mới vào bảng
	    public static void addSinhVien(Connection connection, String maSinhVien, String name, int age, String className) {
	        String query = "INSERT INTO sinhvien (ma_sinh_vien, name, age, class) VALUES (?, ?, ?, ?)";
	        
	        try (PreparedStatement stmt = connection.prepareStatement(query)) {
	            stmt.setString(1, maSinhVien);
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
	    public static void viewSinhVien(Connection connection) {
	        String query = "SELECT * FROM sinhvien";
	        
	        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
	            while (rs.next()) {
	                System.out.println("Mã sinh viên: " + rs.getString("ma_sinh_vien") +
	                                   ", Tên: " + rs.getString("name") +
	                                   ", Tuổi: " + rs.getInt("age") +
	                                   ", Lớp: " + rs.getString("class"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // Sửa thông tin sinh viên
	    public static void updateSinhVien(Connection connection, String maSinhVien, String name, int age, String className) {
	        String query = "UPDATE sinhvien SET name = ?, age = ?, class = ? WHERE ma_sinh_vien = ?";
	        
	        try (PreparedStatement stmt = connection.prepareStatement(query)) {
	            stmt.setString(1, name);
	            stmt.setInt(2, age);
	            stmt.setString(3, className);
	            stmt.setString(4, maSinhVien);
	            stmt.executeUpdate();
	            System.out.println("Cập nhật thông tin sinh viên thành công!");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // Xóa sinh viên theo mã sinh viên
	    
	    
	    public static void deleteSinhVien(Connection connection, String maSinhVien) {
	        String query = "DELETE FROM sinhvien WHERE ma_sinh_vien = ?";
	        
	        try (PreparedStatement stmt = connection.prepareStatement(query)) {
	            stmt.setString(1, maSinhVien);
	            stmt.executeUpdate();
	            System.out.println("Xóa sinh viên thành công!");
	        } catch (SQLException e) {
	            e.printStackTrace();
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

