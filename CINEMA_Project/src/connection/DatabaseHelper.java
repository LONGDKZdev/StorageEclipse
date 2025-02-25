package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseHelper {

    public static String getMovieInfoByTitle(String title) {
        StringBuilder movieInfo = new StringBuilder();
        try (Connection conn = SQLServerConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM Movies WHERE Title = ?")) {
            ps.setString(1, title);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                movieInfo.append("Title: ").append(rs.getString("Title")).append("\n");
                movieInfo.append("Genre: ").append(rs.getString("Genre")).append("\n");
                movieInfo.append("Duration: ").append(rs.getInt("Duration")).append(" minutes\n");
                movieInfo.append("Rating: ").append(rs.getString("Rating")).append("\n");
            } else {
                movieInfo.append("No information found for this movie.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            movieInfo.append("Error fetching movie information.");
        }

        return movieInfo.toString();
    }

	public static Connection getConnection() {

		Connection connection = SQLServerConnection.getConnection();
        if (connection == null) {
            System.err.println("❌ Lỗi: Không thể kết nối đến SQL Server từ DatabaseHelper!");
        }
        return connection;
    }

}
