package mysql;
import java.sql.*;

public class SQL_Engine {
	private Connection conn = null ;
	
	public Connection getDBConn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SM_SYS","deno101","denniz");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
	
	
	
	

}



