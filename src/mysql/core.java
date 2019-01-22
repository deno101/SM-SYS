package mysql;

import java.sql.Connection;

//Class to handle db operations for core table
public class core{
		
		Connection conn = null;
		public core(Connection c) {
			this.conn = c;
		}
	}

