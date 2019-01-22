package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//Class to handle db operations for auth table
public class auth{
		
		Connection conn = null;
		public auth(Connection c) {
			this.conn = c;
		}
		
		public boolean authenticate(String username, String password) {
			boolean bool = false;
			if (! ifExists(username)) {
				return bool;
			}
			
			String query = "SELECT password FROM auth WHERE username = '"+username+"'";
			try {
				PreparedStatement stm = conn.prepareStatement(query);
				ResultSet result = stm.executeQuery();
				result.next();
				if (result.getString(1).equals(password)) {
					bool = true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return bool;
		}
		
		private boolean ifExists(String Username) {
			boolean bool = false;
			String query = "Select * FROM auth WHERE username = '" +Username +"'";
			PreparedStatement stm;
			ResultSet result = null;
			try {
				stm = conn.prepareStatement(query);
				result = stm.executeQuery();
				if (result.next()) {
					bool = true;
				}
			} catch (SQLException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return bool;
		}
	}
