package week12.gui.event.examples;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class HelloWorldGUI  extends JFrame{
	private static final long serialVersionUID = 1358378013913954030L;
	JTextField textField;
	public HelloWorldGUI() {
		
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		JButton button = new JButton("Press me!");
		button.setBounds(100, 100, 200, 30);
		button.addActionListener(new ButtonActionListener(this));
		textField=new JTextField("Hi !",20);
		textField.setBounds(100, 150, 200, 30);
		
		add(button);
		add(textField);
		setVisible(true);
	}

	public static void main(String[] args) {

		new HelloWorldGUI();
	}
}
