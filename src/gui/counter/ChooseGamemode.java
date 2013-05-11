package gui.counter;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class ChooseGamemode extends JFrame {
	private static final long serialVersionUID = 1L;
	private JRadioButton rdbtn5on5;
	private JRadioButton rdbtn3on3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblSpielmodus;
	private JButton btnOk;
	private JButton btnAbbrechen;

	public ChooseGamemode() {
		setResizable(false);
		initGUI();
		setLocationRelativeTo(null);
	}

	private void initGUI() {
		setSize(new Dimension(184, 158));
		setTitle("Spielmodus-Auswahl");
		setType(Type.UTILITY);
		getContentPane().setLayout(null);

		rdbtn5on5 = new JRadioButton("5on5");
		buttonGroup.add(rdbtn5on5);
		rdbtn5on5.setBounds(23, 49, 53, 24);
		getContentPane().add(rdbtn5on5);

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
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				onBtnOK();
			}

		});

		btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.setBounds(12, 91, 96, 26);
		getContentPane().add(btnAbbrechen);
		btnAbbrechen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Cancel();
			}
		});
	}

	private void onBtnOK() {
		if (rdbtn5on5.isSelected()) {
			 Counter5on5Frame SR = new Counter5on5Frame();
			 SR.setVisible(true);
			 dispose();
			
			// Falls Counter5on5Frame vorhanden folgende Zeilen löschen
			
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(null, "Diese Option ist leider noch nicht vollständig :(", "Nicht vollständig", JOptionPane.OK_CANCEL_OPTION);
			
		} else if (rdbtn3on3.isSelected()) {			
			 Counter3on3Frame TT = new Counter3on3Frame();
			 TT.setVisible(true);
			 dispose();
			
			// Falls Counter3on3Frame vorhandeen folgende Zeilen löschen
			
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(null, "Diese Option ist leider noch nicht verfügbar :(", "Nicht verfügbar", JOptionPane.OK_CANCEL_OPTION);
		} else {
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(null, "Bitte treffe eine Auwahl!!!", "Keine Auswahl getroffen", JOptionPane.OK_CANCEL_OPTION);
			
		}
	}

	private void Cancel() {
		dispose();

	}
}
