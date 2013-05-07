package gui.timer;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class Timer5on5Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JButton btnBlueBuff;
	private JLabel lblBluebuffone;
	private JButton btnRedBuff;
	private JLabel lbRedBuffOne;
	private JButton btnWolfsOne;
	private JLabel lblWolfsOne;
	private JButton btnGhostsOne;
	private JLabel lblGhostsOne;
	private JButton btnGolems;
	private JLabel lblGolemsOne;
	private JLabel lblEnemyJungle;
	private JButton btnBlueBuff_1;
	private JLabel lblBlueBuff_2;
	private JButton btnRedBuff_1;
	private JLabel lblRedBuff_2;
	private JButton btnWolfs;
	private JLabel lblWolfs_2;
	private JButton btnGhosts;
	private JLabel lblGhosts_2;
	private JButton btnGolems_1;
	private JLabel lblGolems_2;
	private JButton btnDragon;
	private JLabel lblDragon;
	private JButton btnNashor;
	private JLabel lblNashor;

	private GameTimer timerBB_1;
	private GameTimer timerBB_2;
	private GameTimer timerRB_1;
	private GameTimer timerRB_2;
	private GameTimer timerGo_1;
	private GameTimer timerGo_2;
	private GameTimer timerGh_1;
	private GameTimer timerGh_2;
	private GameTimer timerW_1;
	private GameTimer timerW_2;
	private GameTimer timerD_1;
	private GameTimer timerN_1;

	public Timer5on5Frame() {
		setTitle("5on5-Timer");
		initGUI();
		initTimer();
		setLocationRelativeTo(null);

	}

	private void initGUI() {
		setSize(new Dimension(256, 470));
		setResizable(false);
		getContentPane().setLayout(null);

		btnBlueBuff = new JButton("Blue Buff");
		btnBlueBuff.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setTimerBB();
			}
		});
		btnBlueBuff.setBounds(10, 24, 89, 23);
		getContentPane().add(btnBlueBuff);

		lblBluebuffone = new JLabel("5min");
		lblBluebuffone.setBounds(170, 33, 46, 14);
		getContentPane().add(lblBluebuffone);

		btnRedBuff = new JButton("Red Buff");
		btnRedBuff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setTimerRB();
			}
		});
		btnRedBuff.setBounds(10, 51, 89, 23);
		getContentPane().add(btnRedBuff);

		lbRedBuffOne = new JLabel("5min");
		lbRedBuffOne.setBounds(170, 58, 46, 14);
		getContentPane().add(lbRedBuffOne);

		btnWolfsOne = new JButton("Wolfs");
		btnWolfsOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTimerW();
			}
		});
		btnWolfsOne.setBounds(10, 78, 89, 23);
		getContentPane().add(btnWolfsOne);

		lblWolfsOne = new JLabel("60s");
		lblWolfsOne.setBounds(170, 83, 46, 14);
		getContentPane().add(lblWolfsOne);

		btnGhostsOne = new JButton("Ghosts");
		btnGhostsOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTimerG();
			}
		});
		btnGhostsOne.setBounds(10, 106, 89, 23);
		getContentPane().add(btnGhostsOne);

		lblGhostsOne = new JLabel("50s");
		lblGhostsOne.setBounds(170, 110, 46, 14);
		getContentPane().add(lblGhostsOne);

		btnGolems = new JButton("Golems");
		btnGolems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTimerGolOne();
			}
		});
		btnGolems.setBounds(10, 133, 89, 23);
		getContentPane().add(btnGolems);

		lblGolemsOne = new JLabel("60s");
		lblGolemsOne.setBounds(170, 137, 46, 14);
		getContentPane().add(lblGolemsOne);

		lblEnemyJungle = new JLabel("Enemy Jungle");
		lblEnemyJungle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnemyJungle.setBounds(66, 181, 90, 19);
		getContentPane().add(lblEnemyJungle);

		btnBlueBuff_1 = new JButton("Blue Buff");
		btnBlueBuff_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTimerBB_2();
			}
		});
		btnBlueBuff_1.setBounds(10, 221, 89, 23);
		getContentPane().add(btnBlueBuff_1);

		lblBlueBuff_2 = new JLabel("5min");
		lblBlueBuff_2.setBounds(170, 225, 46, 14);
		getContentPane().add(lblBlueBuff_2);

		btnRedBuff_1 = new JButton("Red Buff");
		btnRedBuff_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTimerRB_2();
			}
		});
		btnRedBuff_1.setBounds(10, 248, 89, 23);
		getContentPane().add(btnRedBuff_1);

		lblRedBuff_2 = new JLabel("5min");
		lblRedBuff_2.setBounds(170, 252, 46, 14);
		getContentPane().add(lblRedBuff_2);

		btnWolfs = new JButton("Wolfs");
		btnWolfs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTimerW_2();
			}
		});
		btnWolfs.setBounds(10, 275, 89, 23);
		getContentPane().add(btnWolfs);

		lblWolfs_2 = new JLabel("60s");
		lblWolfs_2.setBounds(170, 279, 46, 14);
		getContentPane().add(lblWolfs_2);

		btnGhosts = new JButton("Ghosts");
		btnGhosts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTimerG_2();
			}
		});
		btnGhosts.setBounds(10, 302, 89, 23);
		getContentPane().add(btnGhosts);

		lblGhosts_2 = new JLabel("50s");
		lblGhosts_2.setBounds(170, 306, 46, 14);
		getContentPane().add(lblGhosts_2);

		btnGolems_1 = new JButton("Golems");
		btnGolems_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTimerGo_2();
			}
		});
		btnGolems_1.setBounds(10, 329, 89, 23);
		getContentPane().add(btnGolems_1);

		lblGolems_2 = new JLabel("60s");
		lblGolems_2.setBounds(170, 333, 46, 14);
		getContentPane().add(lblGolems_2);

		btnDragon = new JButton("Dragon");
		btnDragon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTimerD();
			}
		});
		btnDragon.setBounds(10, 375, 89, 23);
		getContentPane().add(btnDragon);

		lblDragon = new JLabel("6min");
		lblDragon.setBounds(170, 379, 46, 14);
		getContentPane().add(lblDragon);

		btnNashor = new JButton("Nashor");
		btnNashor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTimerN();
			}
		});
		btnNashor.setBounds(10, 407, 89, 23);
		getContentPane().add(btnNashor);

		lblNashor = new JLabel("7min");
		lblNashor.setBounds(170, 411, 46, 14);
		getContentPane().add(lblNashor);
	}

	private void initTimer() {
		timerBB_1 = new GameTimer(60 * 5, lblBluebuffone);
		timerBB_2 = new GameTimer(60 * 5, lblBlueBuff_2);
		timerRB_1 = new GameTimer(60 * 5, lbRedBuffOne);
		timerRB_2 = new GameTimer(60 * 5, lblRedBuff_2);
		timerGo_1 = new GameTimer(60, lblGolemsOne);
		timerGo_2 = new GameTimer(60, lblGolems_2);
		timerGh_1 = new GameTimer(50, lblGhostsOne);
		timerGh_2 = new GameTimer(50, lblGhosts_2);
		timerW_1 = new GameTimer(60, lblWolfsOne);
		timerW_2 = new GameTimer(60, lblWolfs_2);
		timerN_1 = new GameTimer(60 * 7, lblNashor);
		timerD_1 = new GameTimer(60 * 6, lblDragon);

	}

	private void setTimerBB() {
		timerBB_1.start();
	}

	private void setTimerRB() {
		timerRB_1.start();
	}

	private void setTimerW() {
		timerW_1.start();
	}

	private void setTimerG() {
		timerGh_1.start();
	}

	private void setTimerGolOne() {
		timerGo_1.start();
	}

	private void setTimerBB_2() {
		timerBB_2.start();
	}

	private void setTimerRB_2() {
		timerRB_2.start();
	}

	private void setTimerW_2() {
		timerW_2.start();
	}

	private void setTimerG_2() {
		timerGh_2.start();
	}

	private void setTimerGo_2() {
		timerGo_2.start();
	}

	private void setTimerD() {
		timerD_1.start();
	}

	private void setTimerN() {
		timerN_1.start();
	}

}
