package gui.timer;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class GameTimer implements Runnable {
	private int timer_duration;
	private JLabel updateLabel;

	public GameTimer(int duration, JLabel updateLabel) {
		this.timer_duration = duration;
		this.updateLabel = updateLabel;
	}
	
	public void start() {
		new Thread(this).start();
	}

	@Override
	public void run() {
		for (int currtime = timer_duration; currtime >= 0; currtime--) {
			try { 
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			update(currtime);
		}
	}
	
	private void update(final int time) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				updateLabel.setText(time + "s");
			}
		});
	}
}
