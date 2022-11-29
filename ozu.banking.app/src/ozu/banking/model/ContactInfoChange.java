package ozu.banking.model;

public class ContactInfoChange implements BankAccountUpdater {
	private String newPhoneNumber;
	private String newAddress;

	public ContactInfoChange(String newPhoneNumber, String newAddress) {
		super();
		this.newPhoneNumber = newPhoneNumber;
		this.newAddress = newAddress;
	}

	public ContactInfoChange() {
		super();
	}

	@Override
	public void updateAccount(BankAccount acc) {
		if (newAddress != null) {
			acc.getContactInfo().setAddress(newAddress);
		}

		if (newPhoneNumber != null) {
			acc.getContactInfo().setPhoneNumber(newPhoneNumber);
		}

	}

	public String getNewPhoneNumber() {
		return newPhoneNumber;
	}

	public void setNewPhoneNumber(String newPhoneNumber) {
		this.newPhoneNumber = newPhoneNumber;
	}

	public String getNewAddress() {
		return newAddress;
	}

	public void setNewAddress(String newAddress) {
		this.newAddress = newAddress;
	}

}
