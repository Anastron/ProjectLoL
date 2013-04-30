package gui;

import javax.swing.SwingUtilities;

	 public class Timer extends Thread { //ungetestet

		public Timer(int i, String string) {
			setText(string);
		}
		public void setText(final String text){
	       SwingUtilities.invokeLater(new Runnable() {
	             public void run() {
	            	 setText(text);
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

