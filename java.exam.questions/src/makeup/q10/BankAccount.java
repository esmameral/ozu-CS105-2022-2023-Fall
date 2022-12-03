package makeup.q10;

public class BankAccount {
	private double balance;
	private String owner;
	private double maximumDeposit = 0;
	private int negativeBalanceCount=0;
	private int depositCount=0;
	private int withdrawCount=0;

	public BankAccount(String owner, double balance) {
		super();
		this.balance = balance;
		this.owner = owner;
	}

	public void withdraw(double amount) {
		withdrawCount++;
		double oldBalance=balance;
		balance -= amount;
		
		if(oldBalance>0 && balance<0) {
			this.negativeBalanceCount++;
		}
	}

	public void deposit(double amount) {
		depositCount++;
		balance += amount;
		if(amount>maximumDeposit)
			maximumDeposit=amount;
		
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getMaximumDeposit() {
		return maximumDeposit;
	}

	public void setMaximumDeposit(double maximumDeposit) {
		this.maximumDeposit = maximumDeposit;
	}

	public int getNegativeBalanceCount() {
		return negativeBalanceCount;
	}

	public void setNegativeBalanceCount(int negativeBalanceCount) {
		this.negativeBalanceCount = negativeBalanceCount;
	}

	public int getDepositCount() {
		return depositCount;
	}

	public void setDepositCount(int depositCount) {
		this.depositCount = depositCount;
	}

	public int getWithdrawCount() {
		return withdrawCount;
	}

	public void setWithdrawCount(int withdrawCount) {
		this.withdrawCount = withdrawCount;
	}

	@Override
	public String toString() {
		return owner+"'s " + balance + " TL account";
	}

}
