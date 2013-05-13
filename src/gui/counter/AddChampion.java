package gui.counter;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddChampion extends JFrame {
	private static final long serialVersionUID = 1L;
	private JLabel lblChampionname;
	private JTextField textField;
	private JLabel lblCounterThisChampion;
	private JTextField textField_1;
	private JButton btnAdd;
	private JButton btnCancel;
	FileWriter out;
	BufferedReader in;

	
	public AddChampion() {
		initGUI();
		initReaderAndWriter();
		setLocationRelativeTo(null);	
	}
	private void initGUI() {
		setTitle("Add new Champion");
		setSize(new Dimension(427, 239));
		setResizable(false);
		getContentPane().setLayout(null);
		
		lblChampionname = new JLabel("Champion:");
		lblChampionname.setBounds(12, 22, 92, 16);
		getContentPane().add(lblChampionname);
		
		textField = new JTextField();
		textField.setBounds(12, 50, 114, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		lblCounterThisChampion = new JLabel("Counter this Champion:");
		lblCounterThisChampion.setBounds(12, 89, 132, 16);
		getContentPane().add(lblCounterThisChampion);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 117, 365, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		btnAdd = new JButton("Add");
		btnAdd.setBounds(311, 172, 98, 26);
		getContentPane().add(btnAdd);
		btnAdd.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			AddKlicked();
		}
		});
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setBounds(195, 172, 98, 26);
		getContentPane().add(btnCancel);
	}
	private void AddKlicked() {
		textdateiErzeugen();
		dispose();
	}
	public void initReaderAndWriter(){

	try {
		out = new FileWriter ("Champs.txt",true);
		

	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	

	private void textdateiErzeugen() {

		try {
			if(champExist()){
				System.out.println("Schon vorhanden");
			}else{
				out.write(textField.getText ());
				out.write(System.getProperty("line.separator"));
				out.write(textField_1.getText ());
				out.write(System.getProperty("line.separator"));
				out.write(System.getProperty("line.separator"));
				out.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private boolean champExist() throws IOException {
		String champs="";
		try {
			in = new BufferedReader (new FileReader("Champs.txt"));
			
			while(champs!=null){
				champs=in.readLine();
				if(textField.getText ().equalsIgnoreCase(champs)){
				return true;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}

}
