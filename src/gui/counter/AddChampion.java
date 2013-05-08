package gui.counter;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddChampion extends JFrame {
	private static final long serialVersionUID = 1L;
	private JLabel lblChampionname;
	private JTextField textField;
	private JLabel lblCounterThisChampion;
	private JTextField textField_1;
	private JButton btnAdd;
	private JButton btnCancel;
	
	public AddChampion() {
		initGUI();
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
}
