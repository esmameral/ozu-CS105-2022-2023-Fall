package homework2;

public abstract class Vehicle {
private String licensePlateNumber;
private String category;
private String transmission;
private String brand;
private String model;
private String year;
public abstract String getVehicleInformation();

public String getLicensePlateNumber() {
	return licensePlateNumber;
}
public void setLicensePlateNumber(String licensePlateNumber) {
	this.licensePlateNumber = licensePlateNumber;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getTransmission() {
	return transmission;
}
public void setTransmission(String transmission) {
	this.transmission = transmission;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}
public Vehicle(String licensePlateNumber, String category, String transmission, String brand, String model,
		String year) {
	super();
	this.licensePlateNumber = licensePlateNumber;
	this.category = category;
	this.transmission = transmission;
	this.brand = brand;
	this.model = model;
	this.year = year;
}
public Vehicle() {
	super();
}


}
