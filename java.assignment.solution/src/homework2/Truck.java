package homework2;

public class Truck extends Vehicle {
	private double mass;

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	@Override
	public String getVehicleInformation() {
		return getBrand() + " " + getModel() + " " + getMass();
	}

	public Truck() {
		super();
	}

	public Truck(String licensePlateNumber, String category, String transmission, String brand, String model,
			String year, double mass) {
		super(licensePlateNumber, category, transmission, brand, model, year);
		this.mass = mass;
	}

}
