package week12.gui.event.examples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;

public class ButtonActionListener implements ActionListener {
	HelloWorldGUI obj;  
	public ButtonActionListener(HelloWorldGUI obj) {
		super();
		this.obj = obj;
	}
	public ButtonActionListener() {
		super();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("deneme");
		obj.textField.setText("Hello World");
		
		JOptionPane.showMessageDialog(obj, 
			    "Got an ActionEvent at " + new Date(e.getWhen()) 
				+ " from " + e.getSource().getClass());



	}
}
