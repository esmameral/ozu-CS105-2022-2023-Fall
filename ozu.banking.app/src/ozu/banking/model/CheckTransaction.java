package ozu.banking.model;

public class CheckTransaction extends WithdrawTransaction {

	
	private String checkNumber;

	public CheckTransaction(double amount, String checkNumber) throws NegativeTransactionAmountException {
		super(amount);
		this.checkNumber=checkNumber;
		
	}
	
	public String getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}
	
	@Override
	public String toString() {
		
		return super.toString()+" checkNumber=" + checkNumber ;
	}
}
