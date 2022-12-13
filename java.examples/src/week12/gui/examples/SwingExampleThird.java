package week12.gui.examples;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingExampleThird extends JFrame{//inheriting JFrame 
	

	private static final long serialVersionUID = 1L;

	public SwingExampleThird() {
		JButton b = new JButton("Click Me");// creating instance of JButton
		b.setBounds(130, 100, 100, 40);// x axis, y axis, width, height
		b.setBackground(new Color(0,0,180));
		b.setForeground(new Color(255,255,180));
		add(b);// adding button in JFrame
		setTitle("First Swing Example");
		setSize(400, 300);// 400 width and 300 height
		setLayout(null);// using no layout managers
		setVisible(true);// making the frame visible
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SwingExampleThird();
	}
}
