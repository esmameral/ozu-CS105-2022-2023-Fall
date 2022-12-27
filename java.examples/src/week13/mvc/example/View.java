package week13.mvc.example;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class View {
	private JFrame frame;
	private JLabel nameLabel;
	
	private JTextField nameTextField;
	
	private JButton sayHelloButton;
	
	
	public View(String title) {
		frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 200);
		
		// Create UI elements
		nameLabel = new JLabel("Name :");
		nameLabel.setBounds(50, 50, 50, 30);
		
		nameTextField = new JTextField(20);
		nameTextField.setBounds(150, 50, 300, 30);
		sayHelloButton = new JButton("Say Hello");
		sayHelloButton.setBounds(150, 80, 299, 30);
		
		frame.setLayout(null);
		frame.add(nameLabel);
		frame.add(nameTextField);
		frame.add(sayHelloButton);
		
		
		frame.setVisible(true);
	}
//getter/setter methods 
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JLabel getNameLabel() {
		return nameLabel;
	}

	public void setNameLabel(JLabel nameLabel) {
		this.nameLabel = nameLabel;
	}

	public JTextField getNameTextField() {
		return nameTextField;
	}

	public void setNameTextField(JTextField nameTextField) {
		this.nameTextField = nameTextField;
	}

	public JButton getSayHelloButton() {
		return sayHelloButton;
	}

	public void setSayHelloButton(JButton sayHelloButton) {
		this.sayHelloButton = sayHelloButton;
	}

	

	



	
	

	

	

	
}
