package gui.timer;

// Doppelstart bei Timer unterdrücken
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import util.SpeechSynthesizer;

import main.Main;
import de.mikescher.MikesKeyLogger.converter.GermanKeyboardConverter;
import de.mikescher.MikesKeyLogger.events.GlobalKeyEvent;
import de.mikescher.MikesKeyLogger.interfaces.GlobalKeyListener;
import de.mikescher.MikesKeyLogger.logger.GlobalKeyLogger;

public class Timer3on3Frame extends JFrame implements WindowListener,
		GlobalKeyListener {
	private static final long serialVersionUID = 1L;
	private JButton btnGolemR;
	private JButton btnGolemL;
	private JButton btnWolfR;
	private JButton btnWolfL;
	private JButton btnWraithR;
	private JButton btnWraithL;
	private JButton btnSpider;
	private JLabel lblGolemR;
	private JLabel lblGolemL;
	private JLabel lblWolfR;
	private JLabel lblWolfL;
	private JLabel lblWraithR;
	private JLabel lblWraithL;
	private JLabel lblSpider;
	private GameTimer timerGR;
	private GameTimer timerGL;
	private GameTimer timerWR;
	private GameTimer timerWL;
	private GameTimer timerWrR;
	private GameTimer timerWrL;
	private GameTimer timerSpider;

	private GlobalKeyLogger gKeyLogger = new GlobalKeyLogger();

	public Timer3on3Frame() {
		initGUI();
		initTimer();
		initHotkeys();

	}

	private void initGUI() {
		setSize(new Dimension(300, 470));
		setResizable(false);
		setTitle("3on3-Timer");
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);

		btnGolemR = new JButton("F1: Golem rechts");
		btnGolemR.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setTimerGR();
			}
		});
		btnGolemR.setBounds(10, 25, 150, 23);
		getContentPane().add(btnGolemR);

		btnGolemL = new JButton("F4: Golem links");
		btnGolemL.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setTimerGL();
			}
		});
		btnGolemL.setBounds(10, 152, 150, 23);
		getContentPane().add(btnGolemL);

		btnWolfR = new JButton("F2: Wolf rechts");
		btnWolfR.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setTimerWR();
			}
		});
		btnWolfR.setBounds(10, 59, 150, 23);
		getContentPane().add(btnWolfR);

		btnWolfL = new JButton("F5: Wolf links");
		btnWolfL.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setTimerWL();
			}
		});
		btnWolfL.setBounds(10, 186, 150, 23);
		getContentPane().add(btnWolfL);

		btnWraithR = new JButton("F3: Wraith rechts");
		btnWraithR.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setTimerWrR();
			}
		});
		btnWraithR.setBounds(10, 93, 150, 23);
		getContentPane().add(btnWraithR);

		btnWraithL = new JButton("F6: Wraith links");
		btnWraithL.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setTimerWrL();
			}
		});
		btnWraithL.setBounds(10, 220, 150, 23);
		getContentPane().add(btnWraithL);

		btnSpider = new JButton("F7: Spider");
		btnSpider.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setTimerS();
			}
		});
		btnSpider.setBounds(10, 271, 150, 23);
		getContentPane().add(btnSpider);

		lblGolemR = new JLabel("50s");
		lblGolemR.setBounds(170, 30, 100, 14);
		getContentPane().add(lblGolemR);

		lblGolemL = new JLabel("50s");
		lblGolemL.setBounds(170, 156, 100, 14);
		getContentPane().add(lblGolemL);

		lblWolfR = new JLabel("50s");
		lblWolfR.setBounds(170, 63, 100, 14);
		getContentPane().add(lblWolfR);

		lblWolfL = new JLabel("50s");
		lblWolfL.setBounds(170, 190, 100, 14);
		getContentPane().add(lblWolfL);

		lblWraithR = new JLabel("50s");
		lblWraithR.setBounds(170, 97, 100, 14);
		getContentPane().add(lblWraithR);

		lblWraithL = new JLabel("50s");
		lblWraithL.setBounds(170, 224, 100, 14);
		getContentPane().add(lblWraithL);

		lblSpider = new JLabel("300s");
		lblSpider.setBounds(170, 275, 100, 14);
		getContentPane().add(lblSpider);
	}

	private void initHotkeys() {
		gKeyLogger.addGlobalKeyListener(this);
		gKeyLogger.setConverter(new GermanKeyboardConverter());

		gKeyLogger.startListening();
	}

	private void initTimer() {

		timerGR = new GameTimer(50, lblGolemR);
		timerGL = new GameTimer(50, lblGolemL);
		timerWR = new GameTimer(50, lblWolfR);
		timerWL = new GameTimer(50, lblWolfL);
		timerWrR = new GameTimer(50, lblWraithR);
		timerWrL = new GameTimer(50, lblWraithL);
		timerSpider = new GameTimer(300, lblSpider);
	}

	private void setTimerGR() {
		timerGR.start();
		SpeechSynthesizer.speak("Starting Timer Golems rechts, 50 seconds");
		timerGR.ending = "GR";
	}

	private void setTimerGL() {
		timerGL.start();
		SpeechSynthesizer.speak("Starting Timer Golem links, 50 seconds");
		timerGL.ending = "GL";
	}

	private void setTimerWR() {
		timerWR.start();
		SpeechSynthesizer.speak("Starting Timer Wölfe rechts, 50 seconds");
		timerWR.ending = "WR";
	}

	private void setTimerWL() {
		timerWL.start();
		SpeechSynthesizer.speak("Starting Timer Wölfe links, 50 seconds");
		timerWL.ending = "GR";
	}

	private void setTimerWrR() {
		timerWrR.start();
		SpeechSynthesizer.speak("Starting Timer Wraith rechts, 50 seconds");
		timerWrR.ending = "WrR";
	}

	private void setTimerWrL() {
		timerWrL.start();
		SpeechSynthesizer.speak("Starting Timer Wraith links, 50 seconds");
		timerWrL.ending = "WrL";
	}

	private void setTimerS() {
		timerSpider.start();
		SpeechSynthesizer.speak("Starting Timer Spider, 5 minutes");
		timerSpider.ending = "Spider";
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// unused
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// unused
	}

	@Override
	public void windowClosing(WindowEvent e) {
		gKeyLogger.removeGlobalKeyListener(this);

		gKeyLogger.stopListening();
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// unused
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// unused
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// unused
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// unused
	}

	@Override
	public void keyPressed(GlobalKeyEvent gke) { // Wird bei jedem KeyEvent
													// global aufgerufen
		if (gke.getConverted().equalsIgnoreCase("[F1]")) {
			setTimerGR();
		} else if (gke.getConverted().equalsIgnoreCase("[F2]")) {
			setTimerWR();
		} else if (gke.getConverted().equalsIgnoreCase("[F3]")) {
			setTimerWrR();
		} else if (gke.getConverted().equalsIgnoreCase("[F4]")) {
			setTimerGL();
		} else if (gke.getConverted().equalsIgnoreCase("[F5]")) {
			setTimerWL();
		} else if (gke.getConverted().equalsIgnoreCase("[F6]")) {
			setTimerWrL();
		} else if (gke.getConverted().equalsIgnoreCase("[F7]")) {
			setTimerS();
		} else if (Main.DEBUG) {
			System.out.println("[DEBUGMESSAGE] Unconsumed Key Event: "
					+ gke.getConverted());
		}
	}

}
