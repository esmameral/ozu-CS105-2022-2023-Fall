package ozu.banking.model;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException() {
		
	}

	public InsufficientBalanceException(String message) {
		super(message);
	}
}
