package gui;
// bin noch am überlegen :-)
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class TimerTT extends JFrame {
	private static final long serialVersionUID = 1L;
	private JButton btnBlueBuff;
	private JLabel lblStatus;
	public TimerTT() {
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
//				setTimerBB();
			}
		});
		btnBlueBuff.setBounds(10, 24, 89, 23);
		getContentPane().add(btnBlueBuff);
		
		lblStatus = new JLabel("Status");
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
