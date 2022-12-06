package ozu.banking.model;

public class NegativeTransactionAmountException extends Exception {

	public NegativeTransactionAmountException() {
		
	}

	public NegativeTransactionAmountException(String message) {
		super(message);
	}
}
