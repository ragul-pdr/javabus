package busResv;

import java.sql.*;

public class DbConnection {
	private static final String url="jdbc:mysql://localhost:3306/busresv";
	private static final String username="root";
	private static final String password="dhara";
	
	public static Connection getConnection()throws SQLException{
		return DriverManager.getConnection(url,username,password);
	}

}
