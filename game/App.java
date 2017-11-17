
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.*;


public class App extends JFrame{
	private Area da;
	private boolean dirty;
	
	private void buildToolbar(Container c) {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2, 1));
		JButton b;
		dirty = true;
		p.add(b = new JButton("restart"));
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){

			}
		});
		p.add(b = new JButton("retract"));
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){

			}
		});
		c.add(p, BorderLayout.WEST);
		p.setBackground(Color.DARK_GRAY);
	}
	
	public void handleEvents() {
		addWindowListener(new WindowListener() {
			public void windowClosing(WindowEvent arg0) {
				JDialog dialog = new JDialog();
				dialog.setVisible(true);
				System.exit(0);
			}

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public void save() {
		dirty = false;
	}
	
	public App() {
		Container c = getContentPane();
		da = new Area();
		buildToolbar(c);
		handleEvents();
		c.add(da, BorderLayout.CENTER);
		setSize(680, 620);
		setVisible(true);
	}
}