package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimerSR extends JFrame {
	private static final long serialVersionUID = 1L;
	private JButton btnBlueBuff;
	private JLabel lblStatus;
	public TimerSR() {
		initGUI();
		setLocationRelativeTo(null);
		
	}
	private void initGUI() {
		setSize(new Dimension(256, 470));
		setResizable(false);
		getContentPane().setLayout(null);
		
		btnBlueBuff = new JButton("Blue Buff");
		btnBlueBuff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setTimerBB();
			}
		});
		btnBlueBuff.setBounds(10, 24, 89, 23);
		getContentPane().add(btnBlueBuff);
		
		lblStatus = new JLabel("Status");
		lblStatus.setBounds(170, 33, 46, 14);
		getContentPane().add(lblStatus);
	}

	public void setTimerBB(){

	}
}
