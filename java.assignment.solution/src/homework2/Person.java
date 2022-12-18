package homework2;

public class Person {
	private String name;
	private String driverLicenceNumber;

	public String getName() {
		return name;
	}

	public Person(String name, String driverLicenceNumber) {
		super();
		this.name = name;
		this.driverLicenceNumber = driverLicenceNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDriverLicenceNumber() {
		return driverLicenceNumber;
	}

	public void setDriverLicenceNumber(String driverLicenceNumber) {
		this.driverLicenceNumber = driverLicenceNumber;
	}
}
