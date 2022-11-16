package ozu.banking.model;

public class EFTTransaction extends WithdrawTransaction {
	private String iban;
	private double comRate;

	public EFTTransaction(double balance, String iban, double rate) {
		super(balance);
		this.iban=iban;
		this.comRate=rate;	
	}
	
	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public double getComRate() {
		return comRate;
	}

	public void setComRate(double comRate) {
		this.comRate = comRate;
	}

}
