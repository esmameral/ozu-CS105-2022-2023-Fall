package ozu.banking.model;

public class NegativeTransactionAmountException extends Exception {

	public NegativeTransactionAmountException() {
		
	}

	public NegativeTransactionAmountException(String message) {
		super(message);
	}

	public NegativeTransactionAmountException(Throwable cause) {
		super(cause);
	}

	public NegativeTransactionAmountException(String message, Throwable cause) {
		super(message, cause);
		
	}

	

}
