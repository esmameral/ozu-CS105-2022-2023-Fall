package ozu.banking.gui.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ozu.banking.model.BankAccount;

public class CreateButtonActionListener implements ActionListener {
	BankAccount acc;
	View view;

	public CreateButtonActionListener() {
		super();
	}
	
	public CreateButtonActionListener(BankAccount acc, View view) {
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
		view.getLblTrxInfo().setText(balanceStr);

	}

	public BankAccount getAcc() {
		return acc;
	}

	public void setAcc(BankAccount acc) {
		this.acc = acc;
	}

}
