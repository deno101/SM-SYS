package main;
import java.awt.*;
import javax.swing.*;
import panels.*;
import mysql.*;

import java.sql.*;

public class Exe {
	Font font = new Font("SansSerif", Font.PLAIN, 14);
	SQL_Engine engine = new SQL_Engine();
	Connection conn = engine.getDBConn();
	auth auth = new auth(conn);
	
	public Exe() {
		JFrame parent = new JFrame("School Management Sys");
		parent.setSize(400, 400);
		
		//Properties of the container panel
		JPanel main_panel = new JPanel();
		CardLayout c1 = new CardLayout();
		main_panel.setLayout(c1);
		
		//Adding of the login screen
		Login log = new Login(font,conn);
		main_panel.add(log, "Login");
		
		c1.show(main_panel, "Login");
		//Finalization and adding of panels
		parent.getContentPane().add(main_panel);
		parent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		parent.setVisible(true);
		parent.setLocationRelativeTo(null);
		
	}
	
	public static void main(String[] args) {
		Exe z = new Exe();
	}
	
}
