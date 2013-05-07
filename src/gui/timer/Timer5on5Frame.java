package gui.timer;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

import util.GlobalHotkeyManager;

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
		initHotkeys();
		setLocationRelativeTo(null);

	}

	private void initGUI() {
		setSize(new Dimension(256, 470));
		setResizable(false);
		getContentPane().setLayout(null);

		btnBlueBuff = new JButton("F1: Blue Buff");
		btnBlueBuff.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setTimerBB();
			}
		});
		btnBlueBuff.setBounds(10, 24, 109, 23);
		getContentPane().add(btnBlueBuff);

		lblBluebuffone = new JLabel("5min");
		lblBluebuffone.setBounds(182, 28, 46, 14);
		getContentPane().add(lblBluebuffone);

		btnRedBuff = new JButton("F2: Red Buff");
		btnRedBuff.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setTimerRB();
			}
		});
		btnRedBuff.setBounds(10, 51, 109, 23);
		getContentPane().add(btnRedBuff);

		lbRedBuffOne = new JLabel("5min");
		lbRedBuffOne.setBounds(182, 55, 46, 14);
		getContentPane().add(lbRedBuffOne);

		btnWolfsOne = new JButton("F3: Wolfs");
		btnWolfsOne.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setTimerW();
			}
		});
		btnWolfsOne.setBounds(10, 78, 109, 23);
		getContentPane().add(btnWolfsOne);

		lblWolfsOne = new JLabel("60s");
		lblWolfsOne.setBounds(182, 82, 46, 14);
		getContentPane().add(lblWolfsOne);

		btnGhostsOne = new JButton("F4: Ghosts");
		btnGhostsOne.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setTimerG();
			}
		});
		btnGhostsOne.setBounds(10, 106, 109, 23);
		getContentPane().add(btnGhostsOne);

		lblGhostsOne = new JLabel("50s");
		lblGhostsOne.setBounds(182, 110, 46, 14);
		getContentPane().add(lblGhostsOne);

		btnGolems = new JButton("F5: Golems");
		btnGolems.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setTimerGolOne();
			}
		});
		btnGolems.setBounds(10, 133, 109, 23);
		getContentPane().add(btnGolems);

		lblGolemsOne = new JLabel("60s");
		lblGolemsOne.setBounds(182, 137, 46, 14);
		getContentPane().add(lblGolemsOne);

		lblEnemyJungle = new JLabel("Enemy Jungle");
		lblEnemyJungle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnemyJungle.setBounds(76, 181, 90, 19);
		getContentPane().add(lblEnemyJungle);

		btnBlueBuff_1 = new JButton("F6: Blue Buff");
		btnBlueBuff_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setTimerBB_2();
			}
		});
		btnBlueBuff_1.setBounds(10, 221, 109, 23);
		getContentPane().add(btnBlueBuff_1);

		lblBlueBuff_2 = new JLabel("5min");
		lblBlueBuff_2.setBounds(182, 225, 46, 14);
		getContentPane().add(lblBlueBuff_2);

		btnRedBuff_1 = new JButton("F7: Red Buff");
		btnRedBuff_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setTimerRB_2();
			}
		});
		btnRedBuff_1.setBounds(10, 248, 109, 23);
		getContentPane().add(btnRedBuff_1);

		lblRedBuff_2 = new JLabel("5min");
		lblRedBuff_2.setBounds(182, 252, 46, 14);
		getContentPane().add(lblRedBuff_2);

		btnWolfs = new JButton("F8: Wolfs");
		btnWolfs.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setTimerW_2();
			}
		});
		btnWolfs.setBounds(10, 275, 109, 23);
		getContentPane().add(btnWolfs);

		lblWolfs_2 = new JLabel("60s");
		lblWolfs_2.setBounds(182, 277, 46, 14);
		getContentPane().add(lblWolfs_2);

		btnGhosts = new JButton("F9: Ghosts");
		btnGhosts.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setTimerG_2();
			}
		});
		btnGhosts.setBounds(10, 302, 109, 23);
		getContentPane().add(btnGhosts);

		lblGhosts_2 = new JLabel("50s");
		lblGhosts_2.setBounds(182, 306, 46, 14);
		getContentPane().add(lblGhosts_2);

		btnGolems_1 = new JButton("F10: Golems");
		btnGolems_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setTimerGo_2();
			}
		});
		btnGolems_1.setBounds(10, 329, 109, 23);
		getContentPane().add(btnGolems_1);

		lblGolems_2 = new JLabel("60s");
		lblGolems_2.setBounds(182, 333, 46, 14);
		getContentPane().add(lblGolems_2);

		btnDragon = new JButton("F11: Dragon");
		btnDragon.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setTimerD();
			}
		});
		btnDragon.setBounds(10, 375, 109, 23);
		getContentPane().add(btnDragon);

		lblDragon = new JLabel("6min");
		lblDragon.setBounds(182, 379, 46, 14);
		getContentPane().add(lblDragon);

		btnNashor = new JButton("F12: Nashor");
		btnNashor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setTimerN();
			}
		});
		btnNashor.setBounds(10, 407, 109, 23);
		getContentPane().add(btnNashor);

		lblNashor = new JLabel("7min");
		lblNashor.setBounds(182, 411, 46, 14);
		getContentPane().add(lblNashor);
	}

	private void initHotkeys() {
		GlobalHotkeyManager hotkeyManager = GlobalHotkeyManager.getInstance();
		
		String keyIdent_BB1 = "projektLoL.hotkey.BB1";
		String keyIdent_BB2 = "projektLoL.hotkey.BB2";
		String keyIdent_RB1 = "projektLoL.hotkey.RB1";
		String keyIdent_RB2 = "projektLoL.hotkey.RB2";
		String keyIdent_W1 = "projektLoL.hotkey.W1";
		String keyIdent_W2 = "projektLoL.hotkey.W2";
		String keyIdent_Go1 = "projektLoL.hotkey.Go1";
		String keyIdent_Go2 = "projektLoL.hotkey.Go2";
		String keyIdent_Gh1 = "projektLoL.hotkey.Gh1";
		String keyIdent_Gh2 = "projektLoL.hotkey.Gh2";
		String keyIdent_N1 = "projektLoL.hotkey.N1";
		String keyIdent_D1 = "projektLoL.hotkey.D1";
		
		
	    hotkeyManager.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), keyIdent_BB1);
	    hotkeyManager.getActionMap().put(keyIdent_BB1, new AbstractAction() {
			private static final long serialVersionUID = -4920728089299859094L;

			@Override
			public void actionPerformed(ActionEvent e) {
				setTimerBB();
			}
		});
	    hotkeyManager.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0), keyIdent_RB1);
	    hotkeyManager.getActionMap().put(keyIdent_RB1, new AbstractAction() {
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent arg0) {
				setTimerRB();				
			}
		});
	    hotkeyManager.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), keyIdent_W1);
	    hotkeyManager.getActionMap().put(keyIdent_W1, new AbstractAction() {
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
				setTimerW();
			}
		});
	    hotkeyManager.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0), keyIdent_Gh1);
	    hotkeyManager.getActionMap().put(keyIdent_Gh1, new AbstractAction() {

			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
				setTimerG();
				
			}
		});
	    hotkeyManager.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0), keyIdent_Go1);
	    hotkeyManager.getActionMap().put(keyIdent_Go1, new AbstractAction() {

			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
				setTimerGolOne();
			}
		});
	    hotkeyManager.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_F6, 0), keyIdent_BB2);
	    hotkeyManager.getActionMap().put(keyIdent_BB2, new AbstractAction() {
			
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
				setTimerBB_2();				
			}
		});
	    hotkeyManager.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_F7, 0), keyIdent_RB2);
	    hotkeyManager.getActionMap().put(keyIdent_RB2, new AbstractAction() {

			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
				setTimerRB_2();			
			}
		});
	    hotkeyManager.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_F8, 0), keyIdent_W2);
	    hotkeyManager.getActionMap().put(keyIdent_W2, new AbstractAction() {

			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
				setTimerW_2();
			}
		});
	    hotkeyManager.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_F9, 0), keyIdent_Gh2);
	    hotkeyManager.getActionMap().put(keyIdent_Gh2, new AbstractAction() {

			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
				setTimerG_2();				
			}
		});
	    hotkeyManager.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0), keyIdent_Go2);
	    hotkeyManager.getActionMap().put(keyIdent_Go2, new AbstractAction() {

			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
				setTimerGo_2();				
			}
		});
	    hotkeyManager.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0), keyIdent_D1);
	    hotkeyManager.getActionMap().put(keyIdent_D1, new AbstractAction() {

			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
				setTimerD();				
			}
		});
	    hotkeyManager.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_F12, 0), keyIdent_N1);
	    hotkeyManager.getActionMap().put(keyIdent_N1, new AbstractAction() {

			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
				setTimerN();				
			}
		});
	    
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
