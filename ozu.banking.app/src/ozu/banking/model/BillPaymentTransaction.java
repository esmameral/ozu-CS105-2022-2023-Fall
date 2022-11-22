package ozu.banking.model;

public class BillPaymentTransaction extends WithdrawTransaction {

	public BillPaymentTransaction(double d) {
		super(d);
	}

	@Override
	public void updateAccount(BankAccount acc) {
		acc.decreaseBalance(getAmount()+2);
		
	}
 
}
