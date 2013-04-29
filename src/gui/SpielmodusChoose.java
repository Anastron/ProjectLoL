package gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class SpielmodusChoose extends JFrame {
	private static final long serialVersionUID = 1L;
	private JRadioButton rdbtnon;
	private JRadioButton rdbtn3on3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblSpielmodus;
	private JButton btnOk;
	private JButton btnAbbrechen;
	
	public SpielmodusChoose() {
		setResizable(false);
		initGUI();
		setLocationRelativeTo(null);
	}
	private void initGUI() {
		setSize(new Dimension(184, 158));
		setTitle("Spielmodus-Auswahl");
		setType(Type.UTILITY);
		getContentPane().setLayout(null);
		
		rdbtnon = new JRadioButton("5on5");
		buttonGroup.add(rdbtnon);
		rdbtnon.setBounds(23, 49, 53, 24);
		getContentPane().add(rdbtnon);
		
		rdbtn3on3 = new JRadioButton("3on3");
		buttonGroup.add(rdbtn3on3);
		rdbtn3on3.setBounds(92, 49, 53, 24);
		getContentPane().add(rdbtn3on3);
		
		lblSpielmodus = new JLabel("Spielmodus:");
		lblSpielmodus.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSpielmodus.setBounds(38, 12, 86, 19);
		getContentPane().add(lblSpielmodus);
		
		btnOk = new JButton("OK");
		btnOk.setBounds(115, 91, 51, 26);
		getContentPane().add(btnOk);
		
		btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.setBounds(12, 91, 96, 26);
		getContentPane().add(btnAbbrechen);
	}

}
