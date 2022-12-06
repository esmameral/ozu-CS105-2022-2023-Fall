package ozu.banking.model;

public class BillPaymentTransaction extends WithdrawTransaction {

	public BillPaymentTransaction(double d) throws NegativeTransactionAmountException {
		super(d);
	}

	@Override
	public void updateAccount(BankAccount acc) throws InsufficientBalanceException {
		acc.decreaseBalance(getAmount()+2);
		
	}
 
}
