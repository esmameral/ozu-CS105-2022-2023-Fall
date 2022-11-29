package ozu.banking.model;

public class ContactInfo {
	public ContactInfo(String phoneNumber, String address) {
		super();
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	private String phoneNumber;
	private String address;
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
