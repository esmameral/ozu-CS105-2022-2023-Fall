package ozu.banking.model;

public class DepositTransaction extends Transaction {

	public DepositTransaction(double amount) throws NegativeTransactionAmountException {
		super(amount);
	}

	@Override
	public void updateAccount(BankAccount acc) {
		acc.increaseBalance(getAmount());
		
	}

}
