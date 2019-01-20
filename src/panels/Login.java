package panels;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JPanel{
	private Font F;
	
	//constructor for class Login
	public Login(Font x) {
		this.F = x;
		
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
		
		//Setting the font
		user.setFont(F);
		passcode.setFont(F);
		user_f.setFont(F);
		pass_f.setFont(F);
		login.setFont(F);
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
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
		this.add(dummy, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		this.add(btnPanel, gbc);
	}
	
}
