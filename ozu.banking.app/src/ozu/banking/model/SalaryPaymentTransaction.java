package ozu.banking.model;

public class SalaryPaymentTransaction extends DepositTransaction {

	

	public SalaryPaymentTransaction(double d) throws NegativeTransactionAmountException {
		super(d);
	}

}
