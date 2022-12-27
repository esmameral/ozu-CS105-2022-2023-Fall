package ozu.banking.gui.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ozu.banking.model.BankAccount;

public class CreateButtonActionLister implements ActionListener {
	BankAccount acc;
	BankAccountView view;

	public CreateButtonActionLister() {
		super();
	}
	
	public CreateButtonActionLister(BankAccount acc, BankAccountView view) {
		super();
		this.acc = acc;
		this.view=view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(".....CreateButtonActionLister....");
		
		acc=new BankAccount(view.getTxtName().getText());
		String balanceStr=view.getTxtBalance().getText();
		System.out.println("....My Account....:"+acc.getOwner());
		

	}

	public BankAccount getAcc() {
		return acc;
	}

	public void setAcc(BankAccount acc) {
		this.acc = acc;
	}

}
