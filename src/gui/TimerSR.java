package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

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
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// setTimerBB();
			}
		});
		btnBlueBuff.setBounds(10, 24, 89, 23);
		getContentPane().add(btnBlueBuff);

		lblStatus = new JLabel("Status");
		lblStatus.setBounds(170, 33, 46, 14);
		getContentPane().add(lblStatus);
	}

	public class MyTimer extends Thread { // ungetestet
		public void setText(final String text) {
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					TimerSR.this.lblStatus.setText(text);
				}
			});
		}

		@Override
		public void run() {
			for (int i = 10; i > 0; i--) {
				final String text = "(" + i + ") seconds left";
				setText(text);
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace(); // möp möp
				}
			}
		}
	}

}
