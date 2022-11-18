package ozu.banking.model;

import java.util.Date;

public class Transaction {
	private int id;
	private Date date;
	private double amount;
	private String placeOfOperation;
	
	public void updateAccount(BankAccount acc) {
		System.out.println("Transaction updateAccount");
	}
	
	
	public Transaction(double amount) {
		this();
		this.amount = amount;
	}
	public Transaction() {
		super();
		this.id=(int)(Math.random()*9000000)+1000000;
		this.date=new Date();
	}

	
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	private void setDate(Date date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	private void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPlaceOfOperation() {
		return placeOfOperation;
	}

	public void setPlaceOfOperation(String placeOfOperation) {
		this.placeOfOperation = placeOfOperation;
	}
	@Override
	public String toString() {
		return getClass().getSimpleName()+"["+amount+"]";
	}
}

