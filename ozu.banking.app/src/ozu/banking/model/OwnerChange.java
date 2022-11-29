package ozu.banking.model;

public class OwnerChange  implements BankAccountUpdater{
	private String newOwnerName;

	public OwnerChange(String newOwnerName) {
		super();
		this.newOwnerName = newOwnerName;
	}

	
	public String getNewOwnerName() {
		return newOwnerName;
	}

	public void setNewOwnerName(String newOwnerName) {
		this.newOwnerName = newOwnerName;
	}


	@Override
	public void updateAccount(BankAccount acc) {
		acc.setOwner(newOwnerName);
		
	}
}
