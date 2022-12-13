package week12.gui.examples;

import java.awt.Color;

import javax.swing.*;

public class SwingExampleSecond {
	JFrame f;
	
	public SwingExampleSecond() {
		f = new JFrame();// creating instance of JFrame

		JButton b = new JButton("Click Me");// creating instance of JButton
		b.setBounds(130, 100, 100, 40);// x axis, y axis, width, height
		b.setBackground(new Color(0,0,180));
		b.setForeground(new Color(255,255,180));
		f.add(b);// adding button in JFrame
		f.setTitle("First Swing Example");
		f.setSize(400, 300);// 400 width and 300 height
		f.setLayout(null);// using no layout managers
		f.setVisible(true);// making the frame visible
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SwingExampleSecond();
	}
}
