package gui;

// bin noch am überlegen :-)
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimerTT<Static> extends JFrame {
	private static final long serialVersionUID = 1L;
	private JButton btnGolemR;
	private JButton btnGolemL;
	private JButton btnWolfR;
	private JButton btnWolfL;
	private JButton btnWraithR;
	private JButton btnWraithL;
	private JButton btnSpider;
	private JLabel lblStatus;

	public TimerTT() {
		initGUI();
		setLocationRelativeTo(null);

	}

	private void initGUI() {
		setSize(new Dimension(500, 470));
		setResizable(false);
		getContentPane().setLayout(null);

		btnGolemR = new JButton("Golem rechts");
		btnGolemR.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Timer GR= new Timer(5);
				
				System.out.println(GR.Time);
//				Thread myThread = new Thread(new Runnable() {
//					int j;
//					public void run() {
//						for (int i = 10; i >= 0; i--) {
//							System.out.println(""+i);
//							j=i;
//							lblStatus.setText(+j+"seconds left");					//noch nicht schön aber selten :-)
//							try {													//doppelstart??
//								Thread.sleep(1000);
//							} catch (InterruptedException e) {
//
//								e.printStackTrace();
//							};
//						}
//				
//					}
//				});
//				myThread.start();
			}
			
		});
		btnGolemR.setBounds(10, 25, 110, 23);
		getContentPane().add(btnGolemR);

		btnGolemL = new JButton("Golem links");
		btnGolemL.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//empty
			}
		});
		btnGolemL.setBounds(10, 50, 110, 23);
		getContentPane().add(btnGolemL);

		btnWolfR = new JButton("Wolf rechts");
		btnWolfR.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//empty
			}
		});
		btnWolfR.setBounds(10, 75, 110, 23);
		getContentPane().add(btnWolfR);

		btnWolfL = new JButton("Wolf links");
		btnWolfL.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//empty
			}
		});
		btnWolfL.setBounds(10, 100, 110, 23);
		getContentPane().add(btnWolfL);

		btnWraithR = new JButton("Wraith rechts");
		btnWraithR.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//empty
			}
		});
		btnWraithR.setBounds(10, 125, 110, 23);
		getContentPane().add(btnWraithR);

		btnWraithL = new JButton("Wraith links");
		btnWraithL.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//empty
			}
		});
		btnWraithL.setBounds(10, 150, 110, 23);
		getContentPane().add(btnWraithL);

		btnSpider = new JButton("Spieder");
		btnSpider.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//empty
			}
		});
		btnSpider.setBounds(10, 175, 110, 23);
		getContentPane().add(btnSpider);

		lblStatus = new JLabel();
		lblStatus.setBounds(170, 33, 100, 14);
		getContentPane().add(lblStatus);
	
	}

	


}
