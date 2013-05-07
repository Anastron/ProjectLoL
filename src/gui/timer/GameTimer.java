package gui.timer;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class GameTimer implements Runnable {
	private int timer_duration;
	private JLabel updateLabel;
	
	private boolean running = false;
	private int currtime;

	public GameTimer(int duration, JLabel updateLabel) {
		this.timer_duration = duration;
		this.updateLabel = updateLabel;
	}
	
	public void start(){
		if(! isRunning()){
			forcestart();
		} else{
			reset();
		}
	}
	
	private void forcestart() {
		new Thread(this).start();
	}

	@Override
	public void run() {
		running = true;
		for (currtime = timer_duration; currtime >= 0;) {
			update(currtime);
			
			try { 
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			currtime--;
		}
		running = false;
	}
	
	private void update(final int time) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				updateLabel.setText(time + "s");
			}
		});
	}
	
	private boolean isRunning(){
		return running;
	}
	
	private void reset(){
		currtime = timer_duration;
	}
}
