package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import main.Exe;

//Class to handle db operations for core table
public class core{
		
		Connection conn = null;
		public core(Connection c) {
			this.conn = c;
		}
		
	}

