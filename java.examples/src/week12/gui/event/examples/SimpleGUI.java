package week12.gui.event.examples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleGUI  extends JFrame  implements ActionListener{
	private static final long serialVersionUID = 1358378013913954030L;
	
	public SimpleGUI() {
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		JButton button = new JButton("Press me!");
		button.setBounds(100, 100, 200, 30);
		button.addActionListener(this);
		add(button);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SimpleGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Hello World!");
		System.out.println(e.getSource().getClass().getSimpleName());
		
	}
}
