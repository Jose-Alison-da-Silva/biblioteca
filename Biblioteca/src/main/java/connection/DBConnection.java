package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static final String USERNAME = "";
	
	private static final String PASSWORD = "";
	
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/biblioteca";
	
	public static Connection createConnectionToMySQL() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con = createConnectionToMySQL();
		
		if(con != null) {
			con.close();
		}
	}
}