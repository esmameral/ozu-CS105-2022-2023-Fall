package ozu.banking.model;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException() {
		
	}

	public InsufficientBalanceException(String message) {
		super(message);
	}

	public InsufficientBalanceException(Throwable cause) {
		super(cause);
	}

	public InsufficientBalanceException(String message, Throwable cause) {
		super(message, cause);
		
	}

	

}
