package ConnectSQL;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {

	public static Connection getConnection() {
		Connection connection = null;
		try {
			String serverName = "DESKTOP-12FN1VC";
			String login = "sa";
			String password = "123";
			String databaseName = "qlsinhvien";
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://" + serverName + ":1433" + ";databaseName=" + databaseName
					    + ";encrypt=true;trustServerCertificate=true";
			
			connection = DriverManager.getConnection(url, login, password);
			
			System.out.println("Kết nối thành công với database: " + databaseName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return connection;
   }
   public static void closeConnection(Connection connection) {
   	try {
   		if(connection != null) {
   			connection.close();
   		}
   	} catch(Exception e) {
   		e.printStackTrace();
   	}
   }

   
   public static void main(String[] args) {
		Connection con = JDBCUtil.getConnection();
		
		if(con != null) {
			System.out.println("Kết nối thành công!");
		} else {
			System.out.println("Kết nối thất bại!");
		}


	}
}
