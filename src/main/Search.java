package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Search {
	
	Connection conn;
	
	//Declaring constants to be used as Jlables in search window
	public String NAME = null;
	public String FORM = null;
	public String STREAM = null;
	public String MATH = null;
	public String ENGLISH = null;
	public String SCI = null;
	public String SST = null;
	public String RELIGION = null;
	
	public Search(Connection conn) {
		this.conn = conn;
	}
	
	
	private ResultSet getADMCore(String admNo) {
		String query = "Select F_NAME,L_NAME,FORM,STREAM from core WHERE ADM_NO='"+admNo+"'";
		ResultSet data = null;
		try {
			PreparedStatement stm  = conn.prepareStatement(query);
			data = stm.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
	private ResultSet getADMSubjects(String admNo) {
		String query = "Select MATH,ENGLISH,SCI,SST,RELIGION from core WHERE ADM_NO='"+admNo+"'";
		ResultSet data = null;
		try {
			PreparedStatement stm  = conn.prepareStatement(query);
			data = stm.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
	public void ADMSearch(String adm) {
		ResultSet data1 = getADMCore(adm);
		ResultSet data2 = getADMSubjects(adm);
		try {
			while (data1.next()) {
				NAME = String.format("%s %s", data1.getString("F_NAME"),data1.getString("L_NAME"));
				FORM = Integer.toString(data1.getInt("FORM"));
				STREAM = data1.getString("STREAM");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			
			MATH = Integer.toString(data2.getInt("MATH"));
			ENGLISH = Integer.toString(data2.getInt("ENGLISH"));
			SCI = Integer.toString(data2.getInt("SCI"));
			SST = Integer.toString(data2.getInt("SST"));
			RELIGION = Integer.toString(data2.getInt("RELIGION"));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
