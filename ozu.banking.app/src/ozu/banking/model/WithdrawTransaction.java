package ozu.banking.model;

public class WithdrawTransaction extends Transaction {

	

	public WithdrawTransaction(double d) {
		super(d);
	}

	@Override
	public void updateAccount(BankAccount acc) {
		acc.withdraw(getAmount());
		
	}

}
