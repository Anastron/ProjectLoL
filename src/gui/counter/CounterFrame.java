package gui.counter;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class CounterFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
	private JMenu mnChampMenu;
	private JMenuItem mntmAddChampion;
	private JMenuItem mntmDeleteChampion;
	private JPanel panel;
	private JTextField txtSearch;


	private JMenuItem mntmEditChampion;
	private JList<String> list;

	public CounterFrame() {
		setSize(new Dimension(534, 397));
		setTitle("Counters on 3on3");
		initGUI();
		setLocationRelativeTo(null);
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initGUI() {

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
		getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setBounds(0, 0, 518, 24);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(2);
		flowLayout.setAlignment(FlowLayout.RIGHT);
		getContentPane().add(panel);

		txtSearch = new JTextField();
		txtSearch.setText("Search...");
		panel.add(txtSearch);
		txtSearch.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(502, 333, -492, -294);
		getContentPane().add(scrollPane);


		list = new JList();
		list.setBounds(10, 35, 486, 292);
		getContentPane().add(list);
		showChamps();

	}


	@SuppressWarnings("resource")
	private void showChamps() {
		String champs="";

		try {
			BufferedReader in = new BufferedReader (new FileReader("Champs.txt"));

			DefaultListModel<String> model = new DefaultListModel<String>();
			while(champs!=null){
				champs=in.readLine();
			model.addElement(in.readLine()+"     /     "+in.readLine()+""+in.readLine());

			list.setModel(model);}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void openAddChampion(){
		AddChampion add = new AddChampion();
		add.setVisible(true);
	}
}