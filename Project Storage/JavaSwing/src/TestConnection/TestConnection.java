package TestConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	public static void main(String[] args) {
		 
		        String url = "jdbc:sqlserver://localhost:1433;databaseName=yourDB";
		        String user = "yourUsername";
		        String password = "yourPassword";

		        try (Connection conn = DriverManager.getConnection(url, user, password)) {
		            System.out.println("Kết nối thành công!");
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }

}


