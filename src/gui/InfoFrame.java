package gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class InfoFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JLabel lblVAlpha;
	private JLabel lblVersion;
	private JLabel lblEntwickler;
	private JLabel lblBenzin;
	private JLabel lblDatum;
	private JLabel label;
	private JLabel lblThanksTo;
	private JLabel lblMikescher;
	public InfoFrame() {
		initGUI();
		setLocationRelativeTo(null);
	}
	private void initGUI() {
		getContentPane().setSize(new Dimension(1, 1));
		setSize(new Dimension(256, 180));
		setResizable(false);
		setTitle("Info");
		setType(Type.UTILITY);
		getContentPane().setLayout(null);
		
		lblVAlpha = new JLabel("???");
		lblVAlpha.setBounds(121, 12, 89, 16);
		getContentPane().add(lblVAlpha);
		
		lblVersion = new JLabel("Version:");
		lblVersion.setBounds(12, 12, 55, 16);
		getContentPane().add(lblVersion);
		
		lblEntwickler = new JLabel("Entwickler:");
		lblEntwickler.setBounds(12, 86, 68, 16);
		getContentPane().add(lblEntwickler);
		
		lblBenzin = new JLabel("Benzin, Angel of Dying");
		lblBenzin.setBounds(121, 86, 124, 16);
		getContentPane().add(lblBenzin);
		
		lblDatum = new JLabel("Datum:");
		lblDatum.setBounds(12, 47, 55, 16);
		getContentPane().add(lblDatum);
		
		label = new JLabel("06.05.2013");
		label.setBounds(121, 47, 68, 16);
		getContentPane().add(label);
		
		lblThanksTo = new JLabel("Special thanks to:");
		lblThanksTo.setBounds(12, 126, 101, 16);
		getContentPane().add(lblThanksTo);
		
		lblMikescher = new JLabel("Mikescher");
		lblMikescher.setBounds(121, 126, 60, 16);
		getContentPane().add(lblMikescher);
	}
}


