package homework2;

public class Motorcycle extends Vehicle implements Rentable {
	private String type;

	@Override
	public String getVehicleInformation() {
		return getBrand() + ", " + getModel() + ", " + getType();

	}

	public Motorcycle() {
		super();
	}

	public Motorcycle(String licensePlateNumber, String category, String transmission, String brand, String model,
			String year, String type) {
		super(licensePlateNumber, category, transmission, brand, model, year);
		this.type = type;
	}

	@Override
	public double getDailyPrice() {
		return 100;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
