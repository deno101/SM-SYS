package mysql;

import java.sql.Connection;

//Class to handle db operations for SUBJECTS table
public class SUBJECTS{
		
		Connection conn = null;
		public SUBJECTS(Connection c) {
			this.conn = c;
		}
}
