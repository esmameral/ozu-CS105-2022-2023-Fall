package ozu.banking.model;

public class WithdrawTransaction extends Transaction {

	

	public WithdrawTransaction(double amount) {
		super(amount);
	}

	@Override
	public void updateAccount(BankAccount acc) {
		acc.decreaseBalance(getAmount());
		
		
	}
	

}
