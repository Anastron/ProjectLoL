package gui;

// bin noch am überlegen :-)
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

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
		setSize(new Dimension(256, 470));
		setResizable(false);
		getContentPane().setLayout(null);

		btnGolemR= new JButton("Golem rechts");
		btnGolemR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
			});
		btnGolemR.setBounds(10, 25, 89, 23);
		getContentPane().add(btnGolemR);
		
		btnGolemL = new JButton("Golem links");
		btnGolemL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
			});
		btnGolemL.setBounds(10, 50, 89, 23);
		getContentPane().add(btnGolemL);
		
		btnWolfR = new JButton("Wolf rechts");
		btnWolfR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
			});
		btnWolfR.setBounds(10, 75, 89, 23);
		getContentPane().add(btnWolfR);
		
		btnWolfL = new JButton("Wolf links");
		btnWolfL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
			});
		btnWolfL.setBounds(10, 100, 89, 23);
		getContentPane().add(btnWolfL);
		
		btnWraithR = new JButton("Wraith rechts");
		btnWraithR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
			});
		btnWraithR.setBounds(10, 125, 89, 23);
		getContentPane().add(btnWraithR);
		
		btnWraithL = new JButton("Wraith links");
		btnWraithL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
			});
		btnWraithL.setBounds(10, 150, 89, 23);
		getContentPane().add(btnWraithL);
		
		btnSpider = new JButton("Spieder");
		btnSpider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
			});
		btnSpider.setBounds(10, 175, 89, 23);
		getContentPane().add(btnSpider);

		lblStatus = new JLabel("kp");
		lblStatus.setBounds(170, 33, 46, 14);
		getContentPane().add(lblStatus);

	}

	public class MyTimer extends Thread { //ungetestet
	     public void setText(final String text){
	       SwingUtilities.invokeLater(new Runnable() {
	             public void run() {
	            	 TimerTT.this.lblStatus.setText(text);
	             }
	       });
	     }
	     public void run() {
	         for(int i = 10; i > 0; i--){
	           final String text = "(" + i + ") seconds left";
	           setText(text);
	           try {
	              Thread.sleep(100);
	                } catch (Exception e) {
	                 e.printStackTrace(); //möp möp
	             }
	         } 
	      }
	 }
	
}
