package main;
import java.awt.*;
import javax.swing.*;
import panels.*;
import mysql.*;
import panels.menus.*;

import java.sql.*;


public class Exe {
	Font font = new Font("SansSerif", Font.PLAIN, 14);
	SQL_Engine engine = new SQL_Engine();
	Connection conn = engine.getDBConn();
	auth auth = new auth(conn);
	CardLayout c1;
	JPanel main_panel;
	public JFrame parent = new JFrame("School Management Sys");
	GlobMenu menubar = new GlobMenu(this,font);
	
	public Exe() {
		setLook();
		parent.setSize(400, 400);
		//Properties of the container panel
		main_panel = new JPanel();
		c1 = new CardLayout();
		main_panel.setLayout(c1);
		
		//Adding of the login screen
		Login log = new Login(font, conn ,this);
		main_panel.add(log, "Login");
		
		
		c1.show(main_panel, "Login");
		//Finalization and adding of panels
		parent.getContentPane().add(main_panel);
		parent.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		parent.setVisible(true);
		parent.setLocationRelativeTo(null);
	
	}
	
	
	public static void main(String[] args) {
		new Exe();
	}
	
	//redirect method to Home panel
	public void gotomain() {
		Home homepanel = new Home(this);
		main_panel.add(homepanel, "home");
		c1.show(main_panel, "home");
		parent.setJMenuBar(menubar);
	}
	
	//function to logout the user frame
	public void logOff() {
		parent.setSize(400, 400);
		parent.setLocationRelativeTo(null);
		parent.setJMenuBar(null);
		c1.show(main_panel, "Login");
	}
	
	//Set the look and fell
	public void setLook() {
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Method to exit the widow and dispose all
	public void killFrame() {
		parent.dispose();
	}
	
}
