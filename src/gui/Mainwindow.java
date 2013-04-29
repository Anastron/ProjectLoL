package gui;

import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Font;

public class Mainwindow extends JFrame {
	public Mainwindow() {
		getContentPane().setFont(new Font("GreekS", Font.BOLD, 14));
		initGUI();
		
		setLocationRelativeTo(null);
	}
	private void initGUI() {
		setSize(new Dimension(480, 165));
		setResizable(false);
		setTitle("LoL-Helper");
		getContentPane().setLayout(null);
		
		btnNewButton = new JButton("Timer");
		btnNewButton.setFont(new Font("Centaur", Font.BOLD, 20));
		btnNewButton.setActionCommand("Timer");
		btnNewButton.setBounds(10, 43, 121, 49);
		getContentPane().add(btnNewButton);
		
		btnKonterchars = new JButton("Konterchars");
		btnKonterchars.setFont(new Font("Centaur", Font.BOLD, 20));
		btnKonterchars.setBounds(174, 43, 134, 49);
		getContentPane().add(btnKonterchars);
		
		btnLineup = new JButton("Lineup");
		btnLineup.setFont(new Font("Centaur", Font.BOLD, 20));
		btnLineup.setBounds(357, 43, 109, 49);
		getContentPane().add(btnLineup);
	}
	private static final long serialVersionUID = 1L;
	private JButton btnNewButton;
	private JButton btnKonterchars;
	private JButton btnLineup;
}
