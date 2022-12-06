package ozu.banking.model;

public interface BankAccountUpdater {
	public void updateAccount(BankAccount acc) throws InsufficientBalanceException;
	
}
