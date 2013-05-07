package gui.timer;

// Doppelstart bei Timer unterdrücken
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Timer3on3Frame extends JFrame {
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

	public Timer3on3Frame() {
		initGUI();
		initTimer();
		//initHotkeys();
		setLocationRelativeTo(null);
	}

	private void initGUI() {
		setSize(new Dimension(210, 470));
		setResizable(false);
		setTitle("3on3-Timer");
		getContentPane().setLayout(null);

		btnGolemR = new JButton("Golem rechts");
		btnGolemR.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				TimerGR();
			}
		});
		btnGolemR.setBounds(10, 25, 110, 23);
		getContentPane().add(btnGolemR);

		btnGolemL = new JButton("Golem links");
		btnGolemL.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				TimerGL();
			}
		});
		btnGolemL.setBounds(10, 50, 110, 23);
		getContentPane().add(btnGolemL);

		btnWolfR = new JButton("Wolf rechts");
		btnWolfR.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				TimerWR();
			}
		});
		btnWolfR.setBounds(10, 75, 110, 23);
		getContentPane().add(btnWolfR);

		btnWolfL = new JButton("Wolf links");
		btnWolfL.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				TimerWL();
			}
		});
		btnWolfL.setBounds(10, 100, 110, 23);
		getContentPane().add(btnWolfL);

		btnWraithR = new JButton("Wraith rechts");
		btnWraithR.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				TimerWrR();
			}
		});
		btnWraithR.setBounds(10, 125, 110, 23);
		getContentPane().add(btnWraithR);

		btnWraithL = new JButton("Wraith links");
		btnWraithL.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				TimerWrL();
			}
		});
		btnWraithL.setBounds(10, 150, 110, 23);
		getContentPane().add(btnWraithL);

		btnSpider = new JButton("Spider");
		btnSpider.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				TimerS();
			}
		});
		btnSpider.setBounds(10, 175, 110, 23);
		getContentPane().add(btnSpider);

		lblGolemR = new JLabel("50s");
		lblGolemR.setBounds(170, 30, 100, 14);
		getContentPane().add(lblGolemR);

		lblGolemL = new JLabel("50s");
		lblGolemL.setBounds(170, 54, 100, 14);
		getContentPane().add(lblGolemL);

		lblWolfR = new JLabel("50s");
		lblWolfR.setBounds(170, 79, 100, 14);
		getContentPane().add(lblWolfR);

		lblWolfL = new JLabel("50s");
		lblWolfL.setBounds(170, 104, 100, 14);
		getContentPane().add(lblWolfL);

		lblWraithR = new JLabel("50s");
		lblWraithR.setBounds(170, 129, 100, 14);
		getContentPane().add(lblWraithR);

		lblWraithL = new JLabel("50s");
		lblWraithL.setBounds(170, 154, 100, 14);
		getContentPane().add(lblWraithL);

		lblSpider = new JLabel("300s");
		lblSpider.setBounds(170, 179, 100, 14);
		getContentPane().add(lblSpider);
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

	private void TimerGR() {
		timerGR.start();
	}

	private void TimerGL() {

		timerGL.start();
	}

	private void TimerWR() {

		timerWR.start();
	}

	private void TimerWL() {

		timerWL.start();
	}

	private void TimerWrR() {

		timerWrR.start();
	}

	private void TimerWrL() {

		timerWrL.start();
	}

	private void TimerS() {

		timerSpider.start();
	}

}
