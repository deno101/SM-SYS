package panels;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import mysql.*;
import javax.swing.*;

import main.Exe;

public class Login extends JPanel{
	private Font F;
	Connection conn = null;
	
	//constructor for class Login
	public Login(Font x, Connection c,Exe ex) {
		ex.setLook();
		this.F = x;
		this.conn = c;
		auth auth = new auth(conn); 
		
		//Init of panels and layouts
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		JPanel middle = new JPanel();
		GridLayout g1 = new GridLayout(2, 2, 8, 5);
		middle.setLayout(g1);
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new GridLayout(1, 1, 5, 5 ));
		
		//Fields
		JLabel user = new JLabel("        Username : ");
		JLabel passcode = new JLabel("        Password  : ");
		JTextField user_f = new JTextField();
		JPasswordField pass_f = new JPasswordField();
		JButton login = new JButton("Log in");
		JLabel dummy = new JLabel("     ");
		JLabel dummy1 = new JLabel("     ");
		
		//Error label
		JLabel error = new JLabel(""); 
		
		//Setting the font
		user.setFont(F);
		passcode.setFont(F);
		user_f.setFont(F);
		pass_f.setFont(F);
		login.setFont(F);
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String passcode = pass_f.getText();
				String username = user_f.getText();
				if (auth.authenticate(username, passcode)) {
					//What to do after authentication
					pass_f.setText(null);
					user_f.setText(null);
					ex.parent.setSize(1200, 600);
					ex.parent.setLocationRelativeTo(null);
					ex.gotomain();
					error.setText("   ");
					
				}else {
					pass_f.setText(null);
					user_f.setText(null);
					String errormsg = "Invalid Username or passcode";
					error.setForeground(Color.RED);
					error.setText(errormsg);
				}
			}
		});
		
		
		middle.add(user);
		middle.add(user_f);
		middle.add(passcode);
		middle.add(pass_f);
		btnPanel.add(login);
		
		this.add(middle);
		gbc.gridx = 0;
		gbc.gridy = 1;
		this.add(dummy1, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		this.add(btnPanel, gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		this.add(dummy, gbc);
		gbc.gridx = 0;
		gbc.gridy = 4;
		this.add(error, gbc);
	}
	
}
