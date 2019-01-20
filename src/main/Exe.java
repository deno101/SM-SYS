package main;
import java.awt.*;
import javax.swing.*;
import panels.*;

public class Exe {
	Font font = new Font("SansSerif", Font.PLAIN, 14);
	
	public Exe() {
		JFrame parent = new JFrame("School Management Sys");
		parent.setSize(400, 400);
		
		//Properties of the container panel
		JPanel main_panel = new JPanel();
		CardLayout c1 = new CardLayout();
		main_panel.setLayout(c1);
		
		//Adding of the login screen
		Login log = new Login(font);
		main_panel.add(log, "Login");
		
		c1.show(main_panel, "Login");
		//Finalization and adding of panels
		parent.getContentPane().add(main_panel);
		parent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		parent.setVisible(true);
		parent.setLocationRelativeTo(null);
		
	}
	
	public static void main(String[] args) {
		new Exe();
	}

}
