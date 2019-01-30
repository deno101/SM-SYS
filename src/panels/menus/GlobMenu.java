package panels.menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import main.*;
import java.awt.Font;

public class GlobMenu extends JMenuBar {
	
	//SubMenu items for get menu
	JMenuItem class_g;
	JMenuItem form_g;
	JMenuItem subject_g;
	
	//SubMenu items for Insert
	JMenuItem class_i;
	JMenuItem student_i;
	
	//Menu items for logout
	JMenuItem log_out;
	JMenuItem exit;
	
	//SubMenu items for Search
	JMenuItem search_adm;
	JMenuItem search_fname;
	JMenuItem search_lname;

	public GlobMenu(Exe exe, Font f) {
		exe.setLook();
		JMenu get = new JMenu("Get");
		JMenu insert = new JMenu("Insert");
		JMenu search = new JMenu("Search by");
		JMenu Logout = new JMenu("Logout");
		
		ClickActions click = new ClickActions(this);
		
		//SubMenu items for get menu
		class_g = new JMenuItem("class");
		form_g = new JMenuItem("Form");
		subject_g = new JMenuItem("Subject");
		get.add(form_g);
		get.add(class_g);
		get.add(subject_g);
		class_g.setFont(f);
		form_g.setFont(f);
		subject_g.setFont(f);
		
		class_g.addActionListener(click);
		form_g.addActionListener(click);
		subject_g.addActionListener(click);
		
		//SubMenu items for Insert
		class_i = new JMenuItem("Subject");
		student_i = new JMenuItem("New student");
		insert.add(class_i);
		insert.add(student_i);
		class_i.setFont(f);
		student_i.setFont(f);
		
		class_i.addActionListener(click);
		student_i.addActionListener(click);
		
		//Menu items for logout
		log_out = new JMenuItem("Log off");
		exit = new JMenuItem("Exit");
		Logout.add(log_out);
		Logout.add(exit);
		
		log_out.addActionListener(click);
		exit.addActionListener(click);

		//Action listener for logout button
		log_out.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	
				exe.logOff();			}
		});
		
		//Action listener for exit button
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				exe.killFrame();
			}
		});
		//SubMenu items for Search
		JMenuItem search_adm = new JMenuItem("ADM N0");
		JMenuItem search_fname = new JMenuItem("First Name");
		JMenuItem search_lname = new JMenuItem("Last Name");
		search.add(search_adm);
		search.add(search_fname);
		search.add(search_lname);
		
		
		get.setFont(f);
		insert.setFont(f);
		search.setFont(f);
		log_out.setFont(f);
		Logout.setFont(f);
		search_adm.setFont(f);
		search_fname.setFont(f);
		search_lname.setFont(f);
		
		search_adm.addActionListener(click);
		search_adm.addActionListener(click);

		//Adding menus to menu bar
		this.add(get);
		this.add(insert);
		this.add(search);
		this.add(Logout);
	}
}

class ClickActions implements ActionListener {
	
	GlobMenu glob = null;
	public ClickActions(GlobMenu gl) {
		this.glob = gl;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == glob.class_g) {
			
		}
		
	}
}
