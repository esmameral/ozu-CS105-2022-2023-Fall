package week4.examples;

public class BankAccount {

	private String owner;
	private int accountNumber = 123;
	private double balance = 100;

	public double computeInterestAmount(double rate, int duration) {

		// double interestAmount = getBalance()*duration*rate/1200;
		// double interestAmount = this.balance*duration*rate/1200;
		double interestAmount = balance * duration * rate / 1200;
		return interestAmount;

	}

	public double computeInterestAmountFor(double amount, double rate, int duration) {
		double interestAmount = amount * duration * rate / 1200;
		return interestAmount;

	}

	public double formatAmount(double amount) {
		return (int) (amount * 1000) / 1000.0;

//    	(int)(729166.666666666)=>729166
//    			729166/1000.0 = 729.166
//    	
//    	729.1666666666666
//    	
//    	729.166

	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
