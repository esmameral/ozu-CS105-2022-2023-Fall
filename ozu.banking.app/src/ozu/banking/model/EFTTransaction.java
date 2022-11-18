package ozu.banking.model;

public class EFTTransaction extends WithdrawTransaction {
	private String receiverIBAN;
	private double comRate;

	public EFTTransaction(double balance, String iban, double rate) {
		super(balance);
		this.setReceiverIBAN(iban);
		this.comRate=rate;	
	}
	
	

	public double getComRate() {
		return comRate;
	}

	public void setComRate(double comRate) {
		this.comRate = comRate;
	}



	public String getReceiverIBAN() {
		return receiverIBAN;
	}



	public void setReceiverIBAN(String receiverIBAN) {
		this.receiverIBAN = receiverIBAN;
	}



	@Override
	public String toString() {
		
		return super.toString()+" receiverIBAN=" + receiverIBAN + ", comRate=" + comRate ;
	}



	@Override
	public void updateAccount(BankAccount acc) {
		
		acc.withdraw(getAmount()+getAmount()*comRate);
		
	}

}
