package gui.timer;

public class GameTimer {
	int Time;

	public GameTimer(final int i) {
		Thread myThread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int j = i; j >= 0; j--) {
					// System.out.println("" + j);
					Time = 4;
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
