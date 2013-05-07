package main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import gui.Mainwindow;

public class Main {

	public static void main(String[] args) {
		init();
		Mainwindow MainWindow = new Mainwindow();
		MainWindow.setVisible(true);

	}
	
	private static void init() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

}
