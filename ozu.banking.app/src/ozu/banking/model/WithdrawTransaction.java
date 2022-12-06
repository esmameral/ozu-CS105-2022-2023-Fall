package ozu.banking.model;

public class WithdrawTransaction extends Transaction {

	

	public WithdrawTransaction(double amount) throws NegativeTransactionAmountException {
		super(amount);
	}

	@Override
	public void updateAccount(BankAccount acc) throws InsufficientBalanceException {
		acc.decreaseBalance(getAmount());
		
		
	}
	

}
