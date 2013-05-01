package gui.timer;

public class GameTimer {
	private int time;

	public GameTimer(final int duration) {
		Thread myThread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int j = duration; j >= 0; j--) {
					// System.out.println("" + j);
					time = 4;
					// noch nicht schön aber selten :-)
					try { // doppelstart??
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				return;
			}
		});
		myThread.start();
	}
}
