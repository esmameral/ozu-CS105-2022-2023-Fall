package ozu.banking.model;

public class DepositTransaction extends Transaction {

	public DepositTransaction(double amount) {
		super(amount);
	}

	@Override
	public void updateAccount(BankAccount acc) {
		acc.increaseBalance(getAmount());
		
	}

}
