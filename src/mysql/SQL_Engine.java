package mysql;
import java.sql.*;

public class SQL_Engine {
	private Connection conn;
	public SQL_Engine() {
		Exe();
	}
	
	private void Exe() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SM_SYS","root","");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
