package JavaTest;

import java.sql.DriverManager;
import java.sql.*;

public class JavaTestConnect {
	 public static void main(String[] args) {
	        Connection connection = null;
	        try {
	            // Thông tin kết nối SQL Server
	            String serverName = "DESKTOP-12FN1VC"; // Đổi thành tên server của bạn
	            String databaseName = "JavaTest";
	            String login = "sa"; // Đổi thành tên đăng nhập của bạn
	            String password = "123"; // Đổi thành mật khẩu của bạn

	            // URL kết nối
	            String url = "jdbc:sqlserver://" + "DESKTOP-12FN1VC" + ":1433;databaseName=" + "JavaTest"
	                        + ";encrypt=true;trustServerCertificate=true";

	            // Tải Driver
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

	            // Kết nối đến cơ sở dữ liệu
	            connection = DriverManager.getConnection(url, login, password);
	            System.out.println("Kết nối thành công với database: " + "JavaTest");

	            // Tạo Statement
	            Statement statement = connection.createStatement();

	            // Câu truy vấn lấy dữ liệu
	            String query = "SELECT * FROM Manager";

	            // Thực thi câu truy vấn
	            ResultSet resultSet = statement.executeQuery(query);

	            // Hiển thị dữ liệu
	            System.out.println("Dữ liệu từ bảng Manager:");
	            while (resultSet.next()) {
	            	   int ID_Manager = resultSet.getInt("ID_Manager");
	                   String Name_Manager = resultSet.getString("Name_Manager");
	                   String Gender = resultSet.getString("Gender");
	                   String phone = resultSet.getString("Phone");
	                   String email = resultSet.getString("Email");
	                   

	                   System.out.println("ID: " + ID_Manager 
	                		   + " , Họ tên: " + Name_Manager 
	                		   + " , Giới tính: " + Gender 
	                		   +" , SĐT: " + phone 
	                		   + " , Email: " + email);
	            }
	            
	            // Đóng ResultSet
	            resultSet.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                // Đóng kết nối
	                if (connection != null) {
	                    connection.close();
	                    System.out.println("Đóng kết nối thành công.");
	                }
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	 }
	 }