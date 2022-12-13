package week12.gui.examples;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class PanelExample {
	JFrame f;

	PanelExample() {
		f = new JFrame();// creating instance of JFrame
		f.setTitle("Hello App");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBounds(40, 80, 300, 100);
		panel.setBackground(Color.gray);

		JButton b = new JButton("Say Hello");
		b.setBounds(50, 100, 80, 30);
		b.setBackground(Color.green);
		b.setForeground(Color.BLUE);

		JTextField text = new JTextField("Hi", 20);
		text.setBounds(100, 100, 200, 30);

		panel.add(b);
		panel.add(text);
		f.getContentPane().add(panel);

		f.setSize(400, 400);
		f.getContentPane().setLayout(null);

		// f.validate();
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new PanelExample();
	}
}
