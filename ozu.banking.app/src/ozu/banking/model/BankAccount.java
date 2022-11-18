package ozu.banking.model;

import java.util.Objects;

public class BankAccount {
	private String owner;
	private int accountNumber;// = 123;
	private double balance;// = 100; 
 

	public BankAccount() {	
		this.accountNumber=(int)(Math.random()*9000000)+1000000;
	}

	public BankAccount(String owner) {
		this();
		this.owner = owner;
	}



	public BankAccount(String owner, int accountNumber) {
		this.owner = owner;
		//setOwner(owner);
		this.accountNumber = accountNumber;
		//setAccountNumber(accountNumber);
	}
	
	

	public double computeInterestAmount(int duration) {
		
		double interestAmount = balance * duration * DailyRates.getInterestRate() / 1200;
		return interestAmount;
	}

	public double computeInterestAmountFor(double amount, int duration) {
		double interestAmount = amount * duration * DailyRates.getInterestRate() / 1200;
		return interestAmount;
	}

	public double formatAmount(double amount) {
		return (int) (amount * 1000) / 1000.0;
//    	(int)(729166.666666666)=>729166
//    			729166/1000.0 = 729.166
//    	729.1666666666666
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

	private void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) {
		if(amount<=balance) {
			balance=balance-amount;
		}else {
			System.out.println("Insufficient balance !!!");
		}
		
		//Others ways:
		//setBalance(balance-amount);
		//setBalance(getBalance()-amount);
		
	}

	public void deposit(double amount) {
		balance=balance+amount;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber);
	}

	public void post(Transaction t) {
		
		
	}

	



	





	
	
}
