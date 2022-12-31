package ozu.banking.gui.mvc;

import javax.swing.JLabel;

public class Controller {
	private Model model;
	private View view;

	public Controller(Model m, View v) {
		model = m;
		view = v;
		initView();
	}

	public void initView() {
		//view.getNameTextField().setText(model.getName());
		view.getLblResponse().setText("Hello");
		
	}

	public void initController() {	
		view.getBtnCreate().addActionListener(new CreateButtonActionListener(model.getAccount(),view));
	}	
}
