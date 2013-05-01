package gui;

import gui.timer.Timer3on3Frame;
import gui.timer.Timer5on5Frame;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ChooseGamemodeFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JRadioButton rdbtn5on5;
	private JRadioButton rdbtn3on3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblSpielmodus;
	private JButton btnOk;
	private JButton btnAbbrechen;

	public ChooseGamemodeFrame() {
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
			Timer5on5Frame SR = new Timer5on5Frame();
			SR.setVisible(true);
			dispose();
		} else if (rdbtn3on3.isSelected()) {
			Timer3on3Frame TT = new Timer3on3Frame();
			TT.setVisible(true);
			dispose();
		}
	}

	private void Cancel() {
		dispose();

	}
}
