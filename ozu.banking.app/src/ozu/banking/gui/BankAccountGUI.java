package ozu.banking.gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BankAccountGUI {

	public static void main(String[] args) {
		JFrame frame=new JFrame("My Bank Account");
		JLabel labelFirstName=new JLabel("First Name");
		JLabel labelLastName=new JLabel("Last Name");
		JLabel labelBalance=new JLabel("Initial Balance");
		JTextField firstNameText=new JTextField(15);
		JTextField lastNameText=new JTextField(15);
		JTextField balance=new JTextField(15);
	
		
		JButton button = new JButton("Create ");// creating instance of JButton
		button.setBounds(130, 100, 100, 30);// x axis, y axis, width, height
		button.setBackground(new Color(0,0,180));
		button.setForeground(new Color(255,255,180));
		frame.setLayout(new GridLayout(4,2));
		frame.add(labelFirstName);
		frame.add(firstNameText);
		frame.add(labelLastName);
		frame.add(lastNameText);
		frame.add(labelBalance);
		frame.add(balance);
		frame.add(button);

		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
