package gui.counter;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class Counter5on5Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
	private JMenu mnChampMenu;
	private JMenuItem mntmAddChampion;
	private JMenuItem mntmDeleteChampion;
	private JPanel panel;
	private JTextField txtSearch;
	private JScrollPane scrollPane;
	private JList<Object> list;
	private JMenuItem mntmEditChampion;
	
	public Counter5on5Frame() {
		setSize(new Dimension(534, 397));
		setTitle("Counters on 5on5");
		initGUI();
		setLocationRelativeTo(null);
	}
	private void initGUI() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnChampMenu = new JMenu("Champions");
		menuBar.add(mnChampMenu);
		
		mntmAddChampion = new JMenuItem("Add Champion");
		mntmAddChampion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				openAddChampion();
			}
		});
		mnChampMenu.add(mntmAddChampion);
		
		mntmEditChampion = new JMenuItem("Edit Champion");
		mnChampMenu.add(mntmEditChampion);
		
		mntmDeleteChampion = new JMenuItem("Delete Champion");
		mnChampMenu.add(mntmDeleteChampion);
		
		panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(2);
		flowLayout.setAlignment(FlowLayout.RIGHT);
		getContentPane().add(panel, BorderLayout.NORTH);
		
		txtSearch = new JTextField();
		txtSearch.setText("Search...");
		panel.add(txtSearch);
		txtSearch.setColumns(10);
		
		scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		list = new JList<Object>();
		list.setSize(new Dimension(1, 1));
		scrollPane.setViewportView(list);
	}
	private void openAddChampion(){
		AddChampion add = new AddChampion();
		add.setVisible(true);
	}
}
