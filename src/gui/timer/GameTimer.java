package gui.timer;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import util.SpeechSynthesizer;

public class GameTimer implements Runnable {
	private int timer_duration;
	private JLabel updateLabel;
	
	private boolean running = false;
	private int currtime;
	public String ending;

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
		end();
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
	private void end(){
		if(ending == "BB_1") {
			SpeechSynthesizer.speak("end Blue Buff");
		} else if(ending == "RB_1"){
			SpeechSynthesizer.speak("end Red Buff");
		} else if(ending == "W_1"){
			SpeechSynthesizer.speak("end Wolf");
		} else if(ending == "Gh_1"){
			SpeechSynthesizer.speak("end Ghosts");
		} else if(ending == "Go_1"){
			SpeechSynthesizer.speak("end Golems");
		} else if(ending == "BB_2"){
			SpeechSynthesizer.speak("end Blue Buff");
		} else if(ending == "RB_2"){
			SpeechSynthesizer.speak("end Red Buff");
		} else if(ending == "W_2"){
			SpeechSynthesizer.speak("end Wolfs");
		} else if(ending == "Gh_2"){
			SpeechSynthesizer.speak("end Ghosts");
		} else if(ending == "Go_2"){
			SpeechSynthesizer.speak("end Golems");
		} else if(ending == "D_1"){
			SpeechSynthesizer.speak("end Dragon");
		} else if(ending == "N_1"){
			SpeechSynthesizer.speak("end Nashor");
		}else if(ending == "GR"){
			SpeechSynthesizer.speak("end Golem rechts");
		}else if(ending == "GL"){
			SpeechSynthesizer.speak("end Golem links");
		}else if(ending == "WR"){
			SpeechSynthesizer.speak("end Wölfe rechts");
		}else if(ending == "WL"){
			SpeechSynthesizer.speak("end Wölfe links");
		}else if(ending == "WrR"){
			SpeechSynthesizer.speak("end Wraith rechts");
		}else if(ending == "WrL"){
			SpeechSynthesizer.speak("end Wraith links");
		}else if(ending == "Spider"){
			SpeechSynthesizer.speak("end Spider");
		}
	}
}
