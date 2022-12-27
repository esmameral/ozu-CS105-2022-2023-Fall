package ozu.banking.gui.mvc;

public class BankAccountController {
	private BankAccountModel model;
	private BankAccountView view;

	public BankAccountController(BankAccountModel m, BankAccountView v) {
		model = m;
		view = v;
		//initView();
	}

	public void initView() {
		//view.getNameTextField().setText(model.getName());
	}

	public void initController() {	
		view.getBtnCreate().addActionListener(new CreateButtonActionLister(model.getAccount(),view));
	}	
}
