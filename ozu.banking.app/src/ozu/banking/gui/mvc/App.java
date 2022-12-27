package ozu.banking.gui.mvc;

public class App {
	public static void main(String[] args) {
		// Assemble all the pieces of the MVC
		BankAccountModel m = new BankAccountModel();
		BankAccountView v = new BankAccountView();
		BankAccountController c = new BankAccountController(m, v);
		c.initController();
	}
}
