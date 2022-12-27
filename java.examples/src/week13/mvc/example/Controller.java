package week13.mvc.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controller {
	private Model model;
	private View view;

	public Controller(Model m, View v) {
		model = m;
		view = v;
		initView();
	}

	public void initView() {
		view.getNameTextField().setText(model.getName());
	}

	public void initController() {
		//addActionListener(e -> sayHello())
		view.getSayHelloButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sayHello();
				
			}
		});
	}

	private void sayHello() {
		model.setName(view.getNameTextField().getText());
		JOptionPane.showMessageDialog(null, "Hello " + model.getName(), "Info",
				JOptionPane.INFORMATION_MESSAGE);
	}

	

	

	
}
